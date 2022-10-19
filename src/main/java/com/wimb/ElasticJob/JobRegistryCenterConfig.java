package com.wimb.ElasticJob;

import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: meng.wu01
 * @DateTime: 2021/11/27
 */
@Configuration
public class JobRegistryCenterConfig {
    private static final String serverList = "localhost:2181";
    private static final String namespace = "springboot-elasticjob";

    @Bean(initMethod = "init")
    public ZookeeperRegistryCenter regCenter() {
        return new ZookeeperRegistryCenter(new ZookeeperConfiguration(serverList, namespace));
    }
}