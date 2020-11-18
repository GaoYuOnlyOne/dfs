package com.gy.dfs.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;


/**
 * @ClassName ParamProperties
 * @Description
 * @Author gaoyu
 * @Date 2020/11/17 17:19
 * @Version 1.0
 **/
@ConfigurationProperties("dfs")
public class ParamProperties {
    private Integer service_type;
    private String oss_bucketName;
    private String oss_accessKeyId;
    private String oss_accessKeySecret;
    private String oss_endpoint;
    private String oss_objectName;
    private String oss_callbackServerUrl;


    private String obs_bucketName;
    private String obs_accessKeyId;
    private String obs_accessKeySecret;
    private String obs_endpoint;
    private String obs_objectName;


    public Integer getService_type() {
        return service_type;
    }

    public void setService_type(Integer service_type) {
        this.service_type = service_type;
    }

    public String getOss_bucketName() {
        return oss_bucketName;
    }

    public void setOss_bucketName(String oss_bucketName) {
        this.oss_bucketName = oss_bucketName;
    }

    public String getOss_accessKeyId() {
        return oss_accessKeyId;
    }

    public void setOss_accessKeyId(String oss_accessKeyId) {
        this.oss_accessKeyId = oss_accessKeyId;
    }

    public String getOss_accessKeySecret() {
        return oss_accessKeySecret;
    }

    public void setOss_accessKeySecret(String oss_accessKeySecret) {
        this.oss_accessKeySecret = oss_accessKeySecret;
    }

    public String getOss_endpoint() {
        return oss_endpoint;
    }

    public void setOss_endpoint(String oss_endpoint) {
        this.oss_endpoint = oss_endpoint;
    }

    public String getOss_objectName() {
        return oss_objectName;
    }

    public void setOss_objectName(String oss_objectName) {
        this.oss_objectName = oss_objectName;
    }

    public String getOss_callbackServerUrl() {
        return oss_callbackServerUrl;
    }

    public void setOss_callbackServerUrl(String oss_callbackServerUrl) {
        this.oss_callbackServerUrl = oss_callbackServerUrl;
    }

    public String getObs_bucketName() {
        return obs_bucketName;
    }

    public void setObs_bucketName(String obs_bucketName) {
        this.obs_bucketName = obs_bucketName;
    }

    public String getObs_accessKeyId() {
        return obs_accessKeyId;
    }

    public void setObs_accessKeyId(String obs_accessKeyId) {
        this.obs_accessKeyId = obs_accessKeyId;
    }

    public String getObs_accessKeySecret() {
        return obs_accessKeySecret;
    }

    public void setObs_accessKeySecret(String obs_accessKeySecret) {
        this.obs_accessKeySecret = obs_accessKeySecret;
    }

    public String getObs_endpoint() {
        return obs_endpoint;
    }

    public void setObs_endpoint(String obs_endpoint) {
        this.obs_endpoint = obs_endpoint;
    }

    public String getObs_objectName() {
        return obs_objectName;
    }

    public void setObs_objectName(String obs_objectName) {
        this.obs_objectName = obs_objectName;
    }
}
