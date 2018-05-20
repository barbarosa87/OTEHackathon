package hackathon.ote.gr.otehackathon.helper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by elias on 5/15/2018.
 */

public class HelperClass {

    private static final String API_URL = "http://192.168.1.15:8080/";
    private static String demoCLI="2108136652";

    public static void startActivity(Context context, Class activity, Bundle bundle){
        Intent intent=new Intent(context,activity);
        intent.putExtra("bundle",bundle);
        context.startActivity(intent);
    }

    public static String getApiUrl() {
        return API_URL;
    }

    public static String getDemoCLI() {
        return demoCLI;
    }

    public static void setDemoCLI(String demoCLI) {
        HelperClass.demoCLI = demoCLI;
    }
}
