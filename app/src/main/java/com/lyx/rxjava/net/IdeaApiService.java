package com.lyx.rxjava.net;

import com.lyx.rxjava.Result;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * <p/>
 * Created by luoyingxing on 2018/8/13.
 */
public interface IdeaApiService {
    /**
     * 网络请求超时时间毫秒
     */
    int DEFAULT_TIMEOUT = 15000;

    String HOST = "http://v.juhe.cn/";

    @GET("toutiao/index")
    Observable<BasicResponse<Result>> getNews(@Query(value = "key") String key, @Query(value = "type") String type);
}