package hackathon.ote.gr.otehackathon;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import butterknife.BindView;
import butterknife.ButterKnife;
import hackathon.ote.gr.otehackathon.objects.CaseObj;
import hackathon.ote.gr.otehackathon.retrofit.RetrofitManager;
import rx.Observer;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.logoImage)
    ImageView logoImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //startSession();


        RotateAnimation rotate = new RotateAnimation(
                0, 360,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f
        );
        rotate.setInterpolator(new LinearInterpolator());
        rotate.setDuration(800);
        rotate.setRepeatCount(Animation.INFINITE);
        logoImage.startAnimation(rotate);


        startSession();


    }

    private void startSession() {

       /* Observer<CaseObj> caseObjObserver = new Observer<CaseObj>() {
            @Override
            public void onCompleted() {
                Animator anim = bouncingStringIntoViewGroup((ViewGroup) findViewById(R.id.bounceView), Color.RED, 30, "A bouncy string.", 3000);
                //here you can add a another listener to anim if you want (a listener could manipulate the views by set ids).
                anim.start();
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(CaseObj caseObj) {
                Toast.makeText(MainActivity.this,
                        "Case created:" + caseObj.getCaseId(), Toast.LENGTH_LONG).show();
            }
        };

        new RetrofitManager(caseObjObserver).startCase();*/

        Animator anim = bouncingStringIntoViewGroup((ViewGroup) findViewById(R.id.bounceView), Color.WHITE, 40, "COSMOTE", 3000);
        //here you can add a another listener to anim if you want (a listener could manipulate the views by set ids).
        anim.start();

    }

    private Animator bouncingStringIntoViewGroup(ViewGroup bouncingTextContainer, final int firstLetterColor, final float size, final String vls, int duration) {
        Context context = bouncingTextContainer.getContext();
        final FrameLayout textViewHolder = new FrameLayout(context);
        final TextView textView = new TextView(context);
        final TextView helper = new TextView(context);
        textViewHolder.addView(helper, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        textViewHolder.addView(textView);

        final int length = vls.length();
        SpannableString textViewString = new SpannableString(vls);
        textViewString.setSpan(new ForegroundColorSpan(Color.TRANSPARENT), 0, length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        SpannableString helperString = new SpannableString(vls);
        helperString.setSpan(new ForegroundColorSpan(Color.TRANSPARENT), 1, length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        helperString.setSpan(new ForegroundColorSpan(firstLetterColor), 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setTextSize(size);
        helper.setTextSize(0);
        helper.setText(helperString);
        setupCreatedViews(bouncingTextContainer, textViewHolder, textView, helper);

        final int intSize = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, size, getResources().getDisplayMetrics());
        final int stepDuration = duration / length;
        ObjectAnimator anim = ObjectAnimator.ofFloat(helper, "textSize", 0, size).setDuration(stepDuration);
        anim.setRepeatCount(length);
        anim.addListener(new Animator.AnimatorListener() {
            int at = 1;

            @Override
            public void onAnimationStart(Animator animation) {
            }

            @Override
            public void onAnimationEnd(Animator animation) {
            }

            @Override
            public void onAnimationCancel(Animator animation) {
            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                SpannableString textViewString = new SpannableString(vls);
                textViewString.setSpan(new ForegroundColorSpan(firstLetterColor), 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                textViewString.setSpan(new ForegroundColorSpan(Color.TRANSPARENT), at, length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                textView.setText(textViewString);
                helper.setTextSize(0);
                SpannableString helperString = new SpannableString(vls);
                helperString.setSpan(new ForegroundColorSpan(Color.TRANSPARENT), 0, at, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                helperString.setSpan(new TextAppearanceSpan(null, 10, intSize, null, null), 0, at, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                if (at != length)
                    helperString.setSpan(new ForegroundColorSpan(Color.TRANSPARENT), at + 1, length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                helper.setText(helperString);
                at++;
            }
        });
        return anim;
    }

    private void setupCreatedViews(ViewGroup containerForAnimatedText, FrameLayout subcontainer, TextView textView, TextView textViewFadeinLetter) {
        containerForAnimatedText.addView(subcontainer, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        //here you can set colors, ids, padding etc...
    }
}
