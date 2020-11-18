package com.gy.dfs.service;

import com.gy.dfs.enums.DFSEnum;
import com.gy.dfs.model.AbstractDFSDomain;
import com.gy.dfs.model.OBSDomain;
import com.gy.dfs.model.OSSDomain;
import com.gy.dfs.model.QIANNIUDomain;

/**
 * @ClassName DFSFactory
 * @Description
 * @Author gaoyu
 * @Date 2020/11/17 18:49
 * @Version 1.0
 **/
public class DFSFactory {

    public static DFSService getInstance(AbstractDFSDomain abstractDFSDomain) {
        if (abstractDFSDomain.getServiceType().equals(DFSEnum.OSS_SERVICE_TYPE.getCode())) {
            return new OSSServiceImpl((OSSDomain) abstractDFSDomain);
        } else if (abstractDFSDomain.getServiceType().equals(DFSEnum.OBS_SERVICE_TYPE.getCode())) {
            return new OBSServiceImpl((OBSDomain) abstractDFSDomain);
        } else if (abstractDFSDomain.getServiceType().equals(DFSEnum.QIANNIU_SERVICE_TYPE.getCode())) {
            return new QIANNIUServiceImpl((QIANNIUDomain) abstractDFSDomain);
        } else {
            return null;
        }
    }

}
