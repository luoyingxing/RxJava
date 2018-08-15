package com.lyx.rxjava.network;

import com.lyx.rxjava.NewsData;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * ApiService
 * <p/>
 * Created by luoyingxing on 2018/8/15.
 */
public interface ApiService {
    String HOST = "http://v.juhe.cn/";

    @GET("toutiao/index")
    Observable<NewsData> getNews(@Query(value = "key") String key, @Query(value = "type") String type);


}