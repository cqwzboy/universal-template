package com.taojin.report.web.api;

import com.taojin.report.service.entity.ReportConfig;

/**
 * Web 层接口
 * 
 * @author limingwei
 */
public interface ReportConfigApi {
    String sayHi(String name);

    ReportConfig findById(Integer id);
}