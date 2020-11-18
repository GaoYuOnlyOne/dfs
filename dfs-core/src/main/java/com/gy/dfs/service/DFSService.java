package com.gy.dfs.service;

import cn.hutool.core.util.IdUtil;

import java.io.InputStream;
import java.util.List;

public interface DFSService {

//    public String getPath(String catalog,String fileName,String suffix);



    /**
     * 文件上传方法
     * @param data 字节数组
     * @param catalog 目录
     * @param fileName 文件名
     * @param suffix 后缀
     * @return
     */
    public String upload(byte[] data, String catalog,String fileName,String suffix);

    /**
     * 文件上传方法
     * @param inputStream 流
     * @param catalog 目录
     * @param fileName 文件名
     * @param suffix 后缀
     * @return
     */
    public String upload(InputStream inputStream, String catalog, String fileName, String suffix);

    /**
     * 批量删除文件
     * @param keys
     * @return
     */
    public List<String> delete(List<String> keys);

    /**
     * 判断文件是否存在
     * @param objectName
     * @return
     */
    public boolean exist(String objectName);
}
