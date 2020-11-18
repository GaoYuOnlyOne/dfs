package com.gy.dfs.controller;

import com.gy.dfs.service.DFSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName DFSController
 * @Description
 * @Author gaoyu
 * @Date 2020/11/17 17:44
 * @Version 1.0
 **/
@RestController
@RequestMapping("dfs")
public class DFSController {

    @Autowired
    private DFSService dfsService;

    /**
     * 默认是
     * @param file
     * @throws IOException
     */
    @PostMapping("upload")
    public String upload(MultipartFile file) throws IOException {
        InputStream inputStream = file.getInputStream();
        String fileName = file.getOriginalFilename();
        String prefix = fileName.substring(0,fileName.lastIndexOf("."));
        String suffix = fileName.substring(fileName.lastIndexOf(".")+1);
        return dfsService.upload(inputStream,"dfstest/dfs/",prefix,suffix);
    }


}
