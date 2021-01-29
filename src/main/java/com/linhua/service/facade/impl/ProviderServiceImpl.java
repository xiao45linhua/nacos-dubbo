package com.linhua.service.facade.impl;

import com.linhua.service.facade.DubboDemoService;
import org.apache.dubbo.config.annotation.Service;


/**
 * @author linhua
 * @date 2021/1/22
 * @description
 */
@Service
public class ProviderServiceImpl implements DubboDemoService {
    @Override
    public String helloDubbo() {
        return "helloDubbo";
        }

}
