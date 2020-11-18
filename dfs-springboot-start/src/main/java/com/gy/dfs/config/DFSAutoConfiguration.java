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
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName DFSAutoConfiguration
 * @Description
 * @Author gaoyu
 * @Date 2020/11/17 16:46
 * @Version 1.0
 **/
@Configuration
@EnableConfigurationProperties(ParamProperties.class)
@ComponentScan("com.gy.dfs")
@Import({DFSServiceAutoConfiguration.class})
public class DFSAutoConfiguration {
}
