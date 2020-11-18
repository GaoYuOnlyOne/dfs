package com.gy.dfs.model;

/**
 * @ClassName AbstractDfs
 * @Description
 * @Author gaoyu
 * @Date 2020/11/17 17:53
 * @Version 1.0
 **/
public class AbstractDFSDomain {
    protected Integer serviceType;

    public Integer getServiceType() {
        return serviceType;
    }

    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "AbstractDFSDomain{" +
                "serviceType=" + serviceType +
                '}';
    }
}
