package hackathon.ote.gr.otehackathon.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import hackathon.ote.gr.otehackathon.Application;
import hackathon.ote.gr.otehackathon.R;
import hackathon.ote.gr.otehackathon.adapters.SymptomsAdapter;
import hackathon.ote.gr.otehackathon.enumerators.ProcessStates;
import hackathon.ote.gr.otehackathon.helper.HelperClass;
import hackathon.ote.gr.otehackathon.objects.ProcessStatesObj;
import hackathon.ote.gr.otehackathon.objects.SessionStateObj;
import hackathon.ote.gr.otehackathon.objects.SymptomItemObj;
import hackathon.ote.gr.otehackathon.objects.SymptomObj;
import hackathon.ote.gr.otehackathon.retrofit.RetrofitManager;
import rx.Observer;

public class SymtpmsListActivity extends AppCompatActivity {


    private Application application;
    @BindView(R.id.symptomsRecycler)
    RecyclerView symptomsRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symtpms_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        ButterKnife.bind(this);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        application = (Application) getApplication();

        setUpSymptomsRecycler();

    }

    private void setUpSymptomsRecycler() {




        // use a linear layout manager
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        symptomsRecycler.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        SymptomsAdapter mAdapter = new SymptomsAdapter(application.getSymptomItemObjArrayList(), getApplicationContext());
        symptomsRecycler.setAdapter(mAdapter);
    }


}
