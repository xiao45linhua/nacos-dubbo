package com.linhua.service.facade.impl;

import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.client.naming.NacosNamingService;
import org.springframework.beans.factory.annotation.Value;

import java.net.Inet4Address;

/**
 * @author linhua
 * @date 2021/1/27
 * @description
 */
//public class ShutdownUnReigister extends Thread {
//
//
//    @Value(value = ("${spring.cloud.nacos.discovery.server-addr}"))
//    private String serviceAddr;
//
//    @Value(value = ("${spring.application.name}"))
//    private String serviceName;
//
//    @Override
//    public void run() {
//        try {
//            System.out.println("执行主动向nacos下线");
//            sleep(5000);
//            new NacosNamingService(serviceAddr).deregisterInstance(serviceName, Inet4Address.getLocalHost().getHostAddress(),20880);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//}
