package hackathon.ote.gr.otehackathon.retrofit;

import java.util.ArrayList;
import java.util.Map;

import hackathon.ote.gr.otehackathon.objects.CaseObj;
import hackathon.ote.gr.otehackathon.objects.SessionStateObj;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by elias on 05-Feb-17.
 */

public interface RetrofitInterface {


    @GET("/WebServiceProject/startCase")
    Observable<CaseObj> startCase(
            @Query("CLI") String cli,
            @Query("type") String type
    );

    @GET("/WebServiceProject/getProcessState")
    Observable<SessionStateObj> getProcessState(
            @Query("token") String token
    );

}
