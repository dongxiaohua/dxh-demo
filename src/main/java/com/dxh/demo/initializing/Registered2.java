package com.dxh.demo.initializing;

import javax.annotation.Resource;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Registered2 implements IExecute, InitializingBean {

  @Resource
  IFactoryService iFactoryService;

  @Override
  public void afterPropertiesSet() throws Exception {
    iFactoryService.registered("registered2", this);
  }

  @Override
  public void execute(String id) {
    System.out.println(">>>>> registered2");
  }
}