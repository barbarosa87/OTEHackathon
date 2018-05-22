package hackathon.ote.gr.otehackathon.adapters;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import hackathon.ote.gr.otehackathon.R;
import hackathon.ote.gr.otehackathon.objects.SymptomItemObj;

/**
 * Created by elias on 5/21/2018.
 */

public class SymptomsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<SymptomItemObj> symptomItemObjArrayList;
    private Context context;

    @Override
    public int getItemViewType(int position) {

        if (symptomItemObjArrayList.get(position).getProcessDefinitionId() == null) {
            return 0;
        } else {

            return 1;
        }

    }


    public static class HeaderViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        @BindView(R.id.title)
        TextView title;

        public HeaderViewHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);
        }
    }


    public SymptomsAdapter(ArrayList<SymptomItemObj> symptomItemObjArrayList, Context context) {
        this.symptomItemObjArrayList = symptomItemObjArrayList;
        this.context = context;
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
        if (viewType == 0) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.symptom_list_header_row, null);
            HeaderViewHolder headerViewHolder = new HeaderViewHolder(view);
            return headerViewHolder;
        } else {
            return null;
        }

    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
       // holder.mTextView.setText(mDataset[position]);

        if (getItemViewType(position)==0){
            ((HeaderViewHolder)holder).title.setText(symptomItemObjArrayList.get(position).getCaption());
        }


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return symptomItemObjArrayList.size();
    }
}