package com.gy.dfs.service;

import cn.hutool.core.util.IdUtil;
import com.gy.dfs.exception.DFSException;
import com.gy.dfs.model.OBSDomain;
import com.obs.services.ObsClient;
import com.obs.services.model.PutObjectResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName OBSServiceImpl
 * @Description
 * @Author gaoyu
 * @Date 2020/11/17 19:07
 * @Version 1.0
 **/
public class OBSServiceImpl implements DFSService {
    Logger logger = LoggerFactory.getLogger(OBSServiceImpl.class);

    private OBSDomain obsDomain;
    private ObsClient client;
    public OBSServiceImpl(OBSDomain obsDomain) {
        init(obsDomain);


    }



    private void init(OBSDomain obsDomain) {
        client = new ObsClient(obsDomain.getAk(), obsDomain.getAs(), obsDomain.getEndpoint());
        this.obsDomain = obsDomain;
    }

    @Override
    public String upload(byte[] data, String catalog, String fileName, String suffix) {
        return upload(new ByteArrayInputStream(data), catalog, fileName, suffix);
    }

    @Override
    public String upload(InputStream inputStream, String catalog, String fileName, String suffix) {
        PutObjectResult putObjectResult;
        try {
            putObjectResult = client.putObject(obsDomain.getBuketName(), obsDomain.getObjectName() + catalog + fileName + "." + suffix, inputStream);
        }catch (Exception e){
            throw new DFSException("obs上传异常" );
        }
        logger.info("图片上传后的地址为：" + putObjectResult.getObjectUrl());
        return putObjectResult.getObjectUrl();
    }

    @Override
    public List<String> delete(List<String> keys) {
        List<String> deletedObjects = new ArrayList<>();
        for (String key : keys) {
            client.deleteObject(obsDomain.getBuketName(), key);
        }
        return deletedObjects;
    }

    @Override
    public boolean exist(String objectName) {
        return client.doesObjectExist(obsDomain.getBuketName(), objectName);
    }
}
