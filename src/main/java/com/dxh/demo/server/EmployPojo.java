package com.dxh.demo.server;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 百莫
 * @create 2021/12/21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployPojo {
    private String name;
    private Integer age;
    private String address;
}
