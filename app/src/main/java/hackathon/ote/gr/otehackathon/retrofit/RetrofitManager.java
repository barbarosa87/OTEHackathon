package hackathon.ote.gr.otehackathon.retrofit;



        import android.content.Context;
        import android.content.pm.PackageInfo;
        import android.content.pm.PackageManager;
        import android.os.Build;
        import android.support.annotation.NonNull;
        import android.util.Base64;

        import java.io.File;
        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.Random;

        import hackathon.ote.gr.otehackathon.helper.HelperClass;
        import hackathon.ote.gr.otehackathon.objects.CaseObj;
        import hackathon.ote.gr.otehackathon.objects.SessionStateObj;
        import hackathon.ote.gr.otehackathon.objects.SymptomItemObj;
        import hackathon.ote.gr.otehackathon.objects.SymptomObj;
        import hackathon.ote.gr.otehackathon.utils.ServiceGenerator;
        import okhttp3.MediaType;
        import okhttp3.MultipartBody;
        import okhttp3.RequestBody;
        import rx.Observable;
        import rx.Observer;
        import rx.android.schedulers.AndroidSchedulers;
        import rx.schedulers.Schedulers;


/**
 * Created by elias on 04-Feb-17.
 */

public class RetrofitManager {
    private Observer observer;


    public RetrofitManager(Observer observer) {
        this.observer = observer;
    }
   // private static final String API_URL = "https://solvatiouat.ote.gr/WebServiceProject/rest/startCase";
    //private static final String API_URL = "http://192.168.1.15:8080/WebServiceProject/";

    private void subscribeObservable(Observable call) {
        call.subscribeOn(Schedulers.newThread()) // Create a new Thread
                .observeOn(AndroidSchedulers.mainThread()) // Use the UI thread
                .subscribe(observer);
    }

    public void startCase(String cli) {
        RetrofitInterface client = ServiceGenerator.createServiceRxAndroid(RetrofitInterface.class, HelperClass.getApiUrl());
     /*   HashMap<String,String> map=new HashMap<>();
        map.put("token",token);
        map.put("type",type);
        map.put("user_id",user_id);*/
        Observable<CaseObj> call = client.startCase(cli,"TELEPHONY");
        subscribeObservable(call);


    }

    public void getProcessState(String token) {
        RetrofitInterface client = ServiceGenerator.createServiceRxAndroid(RetrofitInterface.class, HelperClass.getApiUrl());
     /*   HashMap<String,String> map=new HashMap<>();
        map.put("token",token);
        map.put("type",type);
        map.put("user_id",user_id);*/
        Observable<SessionStateObj> call = client.getProcessState(token);
        subscribeObservable(call);


    }

    public void getSymptoms(String token) {
        RetrofitInterface client = ServiceGenerator.createServiceRxAndroid(RetrofitInterface.class, HelperClass.getApiUrl());
     /*   HashMap<String,String> map=new HashMap<>();
        map.put("token",token);
        map.put("type",type);
        map.put("user_id",user_id);*/
        Observable<ArrayList<SymptomItemObj>> call = client.getSymptoms(token);
        subscribeObservable(call);


    }

}

