package com.lyx.rxjava;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * author:  luoyingxing
 * date: 2018/8/9.
 */
public interface NewsService {
    @GET("index")
    Call<NewsData> getNews(@Query(value = "key") String key,
                           @Query(value = "type") String type);
}