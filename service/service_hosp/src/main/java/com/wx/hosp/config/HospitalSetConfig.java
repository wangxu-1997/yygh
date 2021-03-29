package com.wx.hosp.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.wx.hosp.mapper")
public class HospitalSetConfig { }
