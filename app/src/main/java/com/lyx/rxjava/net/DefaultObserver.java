package com.lyx.rxjava.net;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * <p/>
 * Created by luoyingxing on 2018/8/13.
 */
public abstract class DefaultObserver<T> implements Observer<T> {

    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onNext(T response) {
        onSuccess(response);
    }

    /**
     * 请求数据成功 且响应码为200
     *
     * @param response 服务器返回的数据
     */
    abstract public void onSuccess(T response);

    /**
     * 服务器返回数据，但响应码不为200
     *
     * @param response 服务器返回的数据
     */
    public void onFail(T response) {
    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onComplete() {

    }
}
