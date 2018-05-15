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

        import hackathon.ote.gr.otehackathon.objects.CaseObj;
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
    private static final String API_URL = "https://solvatiouat.ote.gr/WebServiceProject/rest/startCase";

    private void subscribeObservable(Observable call) {
        call.subscribeOn(Schedulers.newThread()) // Create a new Thread
                .observeOn(AndroidSchedulers.mainThread()) // Use the UI thread
                .subscribe(observer);
    }

    public void startCase() {
        RetrofitInterface client = ServiceGenerator.createServiceRxAndroid(RetrofitInterface.class, API_URL);
     /*   HashMap<String,String> map=new HashMap<>();
        map.put("token",token);
        map.put("type",type);
        map.put("user_id",user_id);*/
        Observable<CaseObj> call = client.startCase();
        subscribeObservable(call);


    }

}

