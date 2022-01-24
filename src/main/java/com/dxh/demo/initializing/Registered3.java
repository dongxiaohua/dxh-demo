package com.dxh.demo.initializing;

import javax.annotation.Resource;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Registered3 implements IExecute, InitializingBean {

  @Resource
  IFactoryService iFactoryService;
  @Resource
  TestRegistSercice testRegistSercice;

  @Override
  public void afterPropertiesSet() throws Exception {
    iFactoryService.registered("registered3", this);
  }

  @Override
  public void execute(String id) {
    System.out.println(">>>>> registered3");
    testRegistSercice.sys(id);
  }
}
