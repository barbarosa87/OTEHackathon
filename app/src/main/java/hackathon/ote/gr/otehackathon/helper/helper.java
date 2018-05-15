package hackathon.ote.gr.otehackathon.helper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by elias on 5/15/2018.
 */

public class helper {

    public static void startActivity(Context context, AppCompatActivity activity, Bundle bundle){
        Intent intent=new Intent(context,activity.getClass());
        intent.putExtra("bundle",bundle);
        context.startActivity(intent);
    }
}
