package com.gy.dfs.service;

import com.gy.dfs.model.AbstractDFSDomain;
import com.gy.dfs.model.QIANNIUDomain;

import java.io.InputStream;
import java.util.List;

/**
 * @ClassName QIANNIUServiceImpl
 * @Description
 * @Author gaoyu
 * @Date 2020/11/17 19:08
 * @Version 1.0
 **/
public class QIANNIUServiceImpl implements DFSService {
    public QIANNIUServiceImpl(QIANNIUDomain qianniuDomain) {

    }

    @Override
    public String upload(byte[] data, String catalog, String fileName, String suffix) {
        return null;
    }

    @Override
    public String upload(InputStream inputStream, String catalog, String fileName, String suffix) {
        return null;
    }

    @Override
    public List<String> delete(List<String> keys) {
        return null;
    }

    @Override
    public boolean exist(String objectName) {
        return false;
    }
}
