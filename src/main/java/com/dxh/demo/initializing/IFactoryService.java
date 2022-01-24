package com.dxh.demo.initializing;

import java.util.Map;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;

/**
 * 初始化bean的测试 将不同registered以不同key放在map中
 *
 * @author dongxiaohua
 */
@Component
public class IFactoryService {

  public Map<String, IExecute> map = Maps.newHashMap();

  public IExecute get(String key) {
    return map.get(key);
  }

  public void registered(String keyType, IExecute iExecute) {
    map.put(keyType, iExecute);
  }
}
