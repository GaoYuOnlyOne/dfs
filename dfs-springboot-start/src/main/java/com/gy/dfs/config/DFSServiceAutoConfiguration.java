package com.gy.dfs.config;

import com.gy.dfs.enums.DFSEnum;
import com.gy.dfs.model.AbstractDFSDomain;
import com.gy.dfs.model.OBSDomain;
import com.gy.dfs.model.OSSDomain;
import com.gy.dfs.model.QIANNIUDomain;
import com.gy.dfs.properties.ParamProperties;
import com.gy.dfs.service.DFSFactory;
import com.gy.dfs.service.DFSService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName DFSServiceAutoConfiguration
 * @Description
 * @Author gaoyu
 * @Date 2020/11/17 20:27
 * @Version 1.0
 **/
@Configuration
public class DFSServiceAutoConfiguration {

    //@ConditionalOnBean：当容器里有指定Bean的条件下
    //@ConditionalOnMissingBean：当容器里没有指定Bean的情况下
    @Bean
    @ConditionalOnMissingBean
    public DFSService dFSService(ParamProperties paramProperties){
        AbstractDFSDomain abstractDFSDomain = null;
        if (paramProperties.getService_type().equals(DFSEnum.OSS_SERVICE_TYPE.getCode())){
            OSSDomain ossDomain = new OSSDomain();
            ossDomain.setAk(paramProperties.getOss_accessKeyId());
            ossDomain.setAs(paramProperties.getOss_accessKeySecret());
            ossDomain.setBuketName(paramProperties.getOss_bucketName());
            ossDomain.setCallbackServerUrl(paramProperties.getOss_callbackServerUrl());
            ossDomain.setEndpoint(paramProperties.getOss_endpoint());
            ossDomain.setObjectName(paramProperties.getOss_objectName());
            ossDomain.setServiceType(paramProperties.getService_type());
            abstractDFSDomain = ossDomain;
        } else if (paramProperties.getService_type().equals(DFSEnum.OBS_SERVICE_TYPE.getCode())){
            OBSDomain obsDomain = new OBSDomain();
            obsDomain.setAk(paramProperties.getObs_accessKeyId());
            obsDomain.setAs(paramProperties.getObs_accessKeySecret());
            obsDomain.setBuketName(paramProperties.getObs_bucketName());
            obsDomain.setEndpoint(paramProperties.getObs_endpoint());
            obsDomain.setObjectName(paramProperties.getObs_objectName());
            obsDomain.setServiceType(paramProperties.getService_type());
            abstractDFSDomain = obsDomain;
        } else if (paramProperties.getService_type().equals(DFSEnum.QIANNIU_SERVICE_TYPE.getCode())){
            abstractDFSDomain = new QIANNIUDomain();
        } else{

        }
        return DFSFactory.getInstance(abstractDFSDomain);
    }

}
