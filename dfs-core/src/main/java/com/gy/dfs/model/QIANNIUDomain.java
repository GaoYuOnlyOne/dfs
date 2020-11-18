package com.gy.dfs.model;

/**
 * @ClassName OSSDomain
 * @Description
 * @Author gaoyu
 * @Date 2020/11/17 17:57
 * @Version 1.0
 **/


/*
*    private String oss_bucketName;
    private String oss_accessKeyId;
    private String oss_accessKeySecret;
    private String oss_endpoint;
    private String oss_objectName;
    private String oss_callbackServerUrl;
* */
public class QIANNIUDomain extends AbstractDFSDomain {
    private String ak;
    private String as;
    private String buketName;
    private String endpoint;
    private String objectName;
    private String callbackServerUrl;

    public String getAk() {
        return ak;
    }

    public void setAk(String ak) {
        this.ak = ak;
    }

    public String getAs() {
        return as;
    }

    public void setAs(String as) {
        this.as = as;
    }

    public String getBuketName() {
        return buketName;
    }

    public void setBuketName(String buketName) {
        this.buketName = buketName;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getCallbackServerUrl() {
        return callbackServerUrl;
    }

    public void setCallbackServerUrl(String callbackServerUrl) {
        this.callbackServerUrl = callbackServerUrl;
    }

    @Override
    public String toString() {
        return "OSSDomain{" +
                "ak='" + ak + '\'' +
                ", as='" + as + '\'' +
                ", buketName='" + buketName + '\'' +
                ", endpoint='" + endpoint + '\'' +
                ", objectName='" + objectName + '\'' +
                ", callbackServerUrl='" + callbackServerUrl + '\'' +
                ", serviceType=" + serviceType +
                '}';
    }
}
