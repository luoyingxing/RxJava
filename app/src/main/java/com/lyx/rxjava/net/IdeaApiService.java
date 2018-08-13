package com.lyx.rxjava.net;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * <p/>
 * Created by luoyingxing on 2018/8/13.
 */
public interface IdeaApiService<T> {
    /**
     * 网络请求超时时间毫秒
     */
    int DEFAULT_TIMEOUT = 15000;

    String HOST = "http://v.juhe.cn/";

    @GET("toutiao/index")
    Observable<T> getNews(@Query(value = "key") String key, @Query(value = "type") String type);
}