package hackathon.ote.gr.otehackathon.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;

import butterknife.ButterKnife;
import hackathon.ote.gr.otehackathon.R;

/**
 * Created by elias on 5/15/2018.
 */

public class SymptomsLIstActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
