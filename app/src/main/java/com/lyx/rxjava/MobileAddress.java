package com.lyx.rxjava;

/**
 * author:  luoyingxing
 * date: 2018/8/7.
 */
public class MobileAddress {
    /**
     * error_code : 10005
     * reason : 应用未审核超时，请提交认证
     */
    private int error_code;
    private String reason;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
