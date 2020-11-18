package com.gy.dfs.model;

/**
 * @ClassName OBSDomain
 * @Description
 * @Author gaoyu
 * @Date 2020/11/17 17:56
 * @Version 1.0
 **/
public class OBSDomain extends AbstractDFSDomain {
    private String ak;
    private String as;
    private String buketName;
    private String endpoint;
    private String objectName;
    private String projectId;

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

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "OBSDomain{" +
                "ak='" + ak + '\'' +
                ", as='" + as + '\'' +
                ", buketName='" + buketName + '\'' +
                ", endpoint='" + endpoint + '\'' +
                ", objectName='" + objectName + '\'' +
                ", projectId='" + projectId + '\'' +
                ", serviceType=" + serviceType +
                '}';
    }
}
