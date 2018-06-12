package hackathon.ote.gr.otehackathon.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.OvershootInterpolator;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import hackathon.ote.gr.otehackathon.Application;
import hackathon.ote.gr.otehackathon.R;
import hackathon.ote.gr.otehackathon.adapters.SymptomsAdapter;
import hackathon.ote.gr.otehackathon.objects.SymptomItemObj;
import jp.wasabeef.recyclerview.animators.SlideInUpAnimator;

public class FormActivity extends AppCompatActivity {


    private Application application;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        ButterKnife.bind(this);


    }



}
