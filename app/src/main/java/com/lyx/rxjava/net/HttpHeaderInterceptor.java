package com.lyx.rxjava.net;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;

/**
 * <p/>
 * 添加请求头的拦截器
 * Created by luoyingxing on 2018/8/13.
 */
public class HttpHeaderInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        //  将token统一放到请求头
        String token = "token";
        //  也可以统一配置用户名
        String user_id = "123456";
        Response originalResponse = chain.proceed(chain.request());
        return originalResponse.newBuilder().build();
    }
}
