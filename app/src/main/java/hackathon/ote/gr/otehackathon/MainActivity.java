package hackathon.ote.gr.otehackathon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


import hackathon.ote.gr.otehackathon.objects.CaseObj;
import hackathon.ote.gr.otehackathon.retrofit.RetrofitManager;
import rx.Observer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //startSession();
    }

    private void startSession() {

            Observer<CaseObj> caseObjObserver = new Observer<CaseObj>() {
                @Override
                public void onCompleted() {

                }

                @Override
                public void onError(Throwable e) {

                }

                @Override
                public void onNext(CaseObj caseObj) {
                    Toast.makeText(MainActivity.this,
                            "Case created:"+caseObj.getCaseId(), Toast.LENGTH_LONG).show();
                }
            };

            new RetrofitManager(caseObjObserver).startCase();

    }


}
