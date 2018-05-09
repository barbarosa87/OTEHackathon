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

        import app.slotapp.com.slot_android.BuildConfig;
        import app.slotapp.com.slot_android.objects.ArticlesObj;
        import app.slotapp.com.slot_android.objects.BannersObj;
        import com.common.ChallengeObj;
        import app.slotapp.com.slot_android.objects.ErrorObj;
        import app.slotapp.com.slot_android.objects.FriendshipObj;
        import app.slotapp.com.slot_android.objects.FriendshipUncompressed;
        import app.slotapp.com.slot_android.objects.InterestsObj;
        import app.slotapp.com.slot_android.objects.MunicipalityObj;
        import app.slotapp.com.slot_android.objects.NotificationObj;
        import app.slotapp.com.slot_android.objects.PrefectureObj;
        import app.slotapp.com.slot_android.objects.SettingsObj;
        import app.slotapp.com.slot_android.objects.StarSignsObj;
        import com.common.UnlockObj;
        import app.slotapp.com.slot_android.objects.UserObj;
        import app.slotapp.com.slot_android.utils.ServiceGenerator;
        import okhttp3.MediaType;
        import okhttp3.MultipartBody;
        import okhttp3.RequestBody;
        import rx.Observable;
        import rx.Observer;
        import rx.android.schedulers.AndroidSchedulers;
        import rx.schedulers.Schedulers;
        import tgio.rncryptor.RNCryptorNative;

/**
 * Created by elias on 04-Feb-17.
 */

public class retrofitManager {
    private Observer observer;


    public retrofitManager(Observer observer) {
        this.observer = observer;
    }


    private void subscribeObservable(Observable call) {
        call.subscribeOn(Schedulers.newThread()) // Create a new Thread
                .observeOn(AndroidSchedulers.mainThread()) // Use the UI thread
                .subscribe(observer);
    }



}

