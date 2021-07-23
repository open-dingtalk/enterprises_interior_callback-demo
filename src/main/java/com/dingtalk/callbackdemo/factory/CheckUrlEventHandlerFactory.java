package com.dingtalk.callbackdemo.factory;

import com.dingtalk.callbackdemo.config.ApplicationContextHolder;
import com.dingtalk.callbackdemo.handler.EventHandler;
import com.dingtalk.callbackdemo.handler.impl.CheckUrlEventHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 回调测试事件工厂
 */
@Component
public class CheckUrlEventHandlerFactory extends AbstractEventHandlerFactory {

    @Autowired
    private ApplicationContextHolder applicationContextHolder;

    @Override
    public EventHandler getEventHandler(String eventType) {
        return applicationContextHolder.getApplicationContext().getBean(CheckUrlEventHandler.class);
    }
}
