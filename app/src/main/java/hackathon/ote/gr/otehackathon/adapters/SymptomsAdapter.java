package hackathon.ote.gr.otehackathon.adapters;


import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ThemedSpinnerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import hackathon.ote.gr.otehackathon.Application;
import hackathon.ote.gr.otehackathon.MainActivity;
import hackathon.ote.gr.otehackathon.R;
import hackathon.ote.gr.otehackathon.objects.CaseObj;
import hackathon.ote.gr.otehackathon.objects.ProcessStatesObj;
import hackathon.ote.gr.otehackathon.objects.SymptomItemObj;
import hackathon.ote.gr.otehackathon.retrofit.RetrofitManager;
import jp.wasabeef.recyclerview.animators.SlideInUpAnimator;
import rx.Observer;

/**
 * Created by elias on 5/21/2018.
 */

public class SymptomsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<SymptomItemObj> symptomItemObjArrayList;
    private Context context;
    private String token;

   /* @Override
    public int getItemViewType(int position) {

        if (symptomItemObjArrayList.get(position).getProcessDefinitionId() == null) {
            return 0;
        } else {

            return 1;
        }

    }*/


    public static class HeaderViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        @BindView(R.id.title)
        TextView title;
        @BindView(R.id.leftImage)
        ImageView leftImage;
        @BindView(R.id.embededRecycler)
        RecyclerView embededRecycler;

        public HeaderViewHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);
        }
    }


    public SymptomsAdapter(ArrayList<SymptomItemObj> symptomItemObjArrayList, Context context,String token) {
        this.symptomItemObjArrayList = symptomItemObjArrayList;
        this.context = context;
        this.token=token;
    }


    public void insert(SymptomItemObj symptomItemObj) {
     /*   for (int i = 0; i < tournamentObjArrayList.size(); i++) {
            if (tournamentObjArrayList.get(i).getId() == tour.getId()) {
                tournamentObjArrayList.set(i, tour);
                notifyItemChanged(i);
                return;
            }
        }*/
        // int prevSize = tournamentObjArrayList.size();

        symptomItemObjArrayList.add(symptomItemObj);
        notifyItemInserted(symptomItemObjArrayList.indexOf(symptomItemObj));
        //notifyItemInserted(position);
        //notifyItemRangeChanged(position,tournamentObjArrayList.size()-prevSize);
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        // if (viewType == 0) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.symptom_list_header_row, null);
        HeaderViewHolder headerViewHolder = new HeaderViewHolder(view);
        return headerViewHolder;
        // } else {
        //     return null;
        // }

    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        // holder.mTextView.setText(mDataset[position]);

        //if (getItemViewType(position)==0){

        //}
        final SymptomItemObj symptomItemObj = symptomItemObjArrayList.get(position);

        if (symptomItemObj.getItems() != null) {
            ((HeaderViewHolder) holder).title.setText(symptomItemObjArrayList.get(position).getCaption());
            ((HeaderViewHolder) holder).leftImage.setImageDrawable(context.getDrawable(R.drawable.ic_keyboard_arrow_right_black_24dp));

            ((HeaderViewHolder) holder).itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                 ExpandList(holder,symptomItemObj);
                }


            });
        } else {
            ((HeaderViewHolder) holder).title.setText(symptomItemObjArrayList.get(position).getCaption());
            ((HeaderViewHolder) holder).leftImage.setImageDrawable(context.getDrawable(R.drawable.ic_fiber_manual_record_black_24dp));

            ((HeaderViewHolder) holder).itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    startFormsActivity(symptomItemObjArrayList.get(position).getProcessDefinitionId());

                }
            });
        }


    }


    private void ExpandList(final RecyclerView.ViewHolder holder, final SymptomItemObj symptomItemObj ){
        ((HeaderViewHolder) holder).leftImage.setImageDrawable(context.getDrawable(R.drawable.ic_keyboard_arrow_down_black_24dp));


        // use a linear layout manager
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(context);
        ((HeaderViewHolder) holder).embededRecycler.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        SymptomsAdapter mAdapter = new SymptomsAdapter(new ArrayList<SymptomItemObj>(), context,token);
        ((HeaderViewHolder) holder).embededRecycler.setAdapter(mAdapter);

        SlideInUpAnimator animator = new SlideInUpAnimator(new OvershootInterpolator(1f));

        ((HeaderViewHolder) holder).embededRecycler.setItemAnimator(animator);

        for (SymptomItemObj symptomItemObjItem : symptomItemObj.getItems()) {
            if (symptomItemObjItem.getVisible() == true) {
                mAdapter.insert(symptomItemObjItem);
            }
        }

        ((HeaderViewHolder) holder).itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //((HeaderViewHolder) holder).leftImage.setImageDrawable(context.getDrawable(R.drawable.ic_keyboard_arrow_right_black_24dp));

                ShrinkList(holder,symptomItemObj);
            }
        });
        //application.getSymptomItemObjArrayList()
    }

    private void ShrinkList(final RecyclerView.ViewHolder holder, final SymptomItemObj symptomItemObj ){
        ((HeaderViewHolder) holder).leftImage.setImageDrawable(context.getDrawable(R.drawable.ic_keyboard_arrow_right_black_24dp));
        SymptomsAdapter mAdapter = new SymptomsAdapter(new ArrayList<SymptomItemObj>(), context,token);
        ((HeaderViewHolder) holder).embededRecycler.setAdapter(mAdapter);

        ((HeaderViewHolder) holder).itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //((HeaderViewHolder) holder).leftImage.setImageDrawable(context.getDrawable(R.drawable.ic_keyboard_arrow_right_black_24dp));

                ExpandList(holder,symptomItemObj);
            }
        });
    }

    private void startFormsActivity(final String processID) {
        Observer<ProcessStatesObj> caseObjObserver = new Observer<ProcessStatesObj>() {
            @Override
            public void onCompleted() {




            }

            @Override
            public void onError(Throwable e) {
                Toast.makeText(context, "ERROR STARTING PROCESS "+processID, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNext(ProcessStatesObj processStatesObjList) {
                Toast.makeText(context,
                        "Process started:" + processStatesObjList.getProcessId(), Toast.LENGTH_LONG).show();

            }
        };

        new RetrofitManager(caseObjObserver).startProcess(token,processID);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return symptomItemObjArrayList.size();
    }
}
