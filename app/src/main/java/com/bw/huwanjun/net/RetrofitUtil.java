package com.bw.huwanjun.net;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.io.IOException;
import java.util.IllegalFormatCodePointException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * author: 斛万珺
 * data: 2020/3/17 09:9:10
 * function:
 */
public class RetrofitUtil {
    private OkHttpClient okHttpClient;
    private  String baseUrl="small/user/v1/register/";
    private static RetrofitUtil retrofitUtil;
    private Retrofit retrofit;

    private RetrofitUtil(){

        HttpLoggingInterceptor httpLoggingInterceptor=new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

      retrofit=new Retrofit.Builder()
              .baseUrl(baseUrl)
              .client(okHttpClient)
              .addConverterFactory(GsonConverterFactory.create())
              .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
              .build();

        okHttpClient=new OkHttpClient.Builder()
                .connectTimeout(5, TimeUnit.SECONDS)
                .readTimeout(5,TimeUnit.SECONDS)
                .writeTimeout(5,TimeUnit.SECONDS)
                .addInterceptor(httpLoggingInterceptor)
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request request = chain.request();
                        Request.Builder builder = request.newBuilder();
                        builder.addHeader("userId","28563  ");
                        builder.addHeader("sessionId","158390734444028563");

                        return null;
                    }
                })
                .build();
    }

    public static RetrofitUtil getInstance() {
        if (retrofitUtil==null){

            synchronized (RetrofitUtil.class){
                if (retrofitUtil==null){

                    retrofitUtil=new RetrofitUtil();
                }
            }

        }

        return retrofitUtil;
    }

    public ApiService ApiSercice(){
        ApiService apiService = retrofit.create(ApiService.class);
        return apiService;
    }

  public void getPhoto(String photoUrl, ImageView imageView){
      Glide.with(imageView).load(photoUrl).into(imageView);
  }

    public boolean getNet(Context context){

        ConnectivityManager manager=(ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info=manager.getActiveNetworkInfo();
        if (info!=null){
            return info.isConnected();
        }
        return false;
    }
}
