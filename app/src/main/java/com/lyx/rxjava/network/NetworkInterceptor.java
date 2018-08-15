package com.lyx.rxjava.network;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * NetworkInterceptor
 * <p/>
 * Created by luoyingxing on 2018/8/15.
 */
public class NetworkInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {

        Response originalResponse = chain.proceed(chain.request());
        return originalResponse.newBuilder().build();
    }

}