package hackathon.ote.gr.otehackathon.utils;

import java.util.concurrent.TimeUnit;


import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by ilias.karditsis on 19/10/2015.
 */
public class ServiceGenerator {

    private static long SIZE_OF_CACHE = 10 * 1024 * 1024; // 10 MB

    public static final  OkHttpClient clientLog = new OkHttpClient.Builder().addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)).readTimeout(60, TimeUnit.SECONDS)
            .connectTimeout(60, TimeUnit.SECONDS).build();
    public static final OkHttpClient clientNoLog = new OkHttpClient.Builder().addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.HEADERS)).readTimeout(60, TimeUnit.SECONDS)
            .connectTimeout(60, TimeUnit.SECONDS).build();

    // No need to instantiate this class.
    private ServiceGenerator() {
    }

    public static <S> S createServiceRxAndroid(Class<S> serviceClass, String baseUrl) {
       /* HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        if (BuildConfig.DEBUG) {
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        }else {
            interceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);
        }

        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).readTimeout(60, TimeUnit.SECONDS)
                .connectTimeout(60, TimeUnit.SECONDS).build();*/

//        client.setConnectTimeout(30, TimeUnit.SECONDS);
        //      client.setReadTimeout(30, TimeUnit.SECONDS);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl).client(clientNoLog)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();


     /*   RestAdapter.Builder builder = new RestAdapter.Builder()
                .setEndpoint(baseUrl)
                .setLogLevel(RestAdapter.LogLevel.BASIC)
                .setClient(new OkClient(client));

        RestAdapter adapter = builder.build();*/

        return retrofit.create(serviceClass);
    }


    public static <S> S createServiceRxAndroidNoLog(Class<S> serviceClass, String baseUrl) {
       /* HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        if (BuildConfig.DEBUG) {
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        }else {
            interceptor.setLevel(HttpLoggingInterceptor.Level.HEADERS);
        }*/


//        client.setConnectTimeout(30, TimeUnit.SECONDS);
        //      client.setReadTimeout(30, TimeUnit.SECONDS);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl).client(clientNoLog)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();


     /*   RestAdapter.Builder builder = new RestAdapter.Builder()
                .setEndpoint(baseUrl)
                .setLogLevel(RestAdapter.LogLevel.BASIC)
                .setClient(new OkClient(client));

        RestAdapter adapter = builder.build();*/

        return retrofit.create(serviceClass);
    }





}
