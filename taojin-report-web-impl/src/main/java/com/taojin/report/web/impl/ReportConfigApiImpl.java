package com.taojin.report.web.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.taojin.report.service.api.IReportConfigService;
import com.taojin.report.service.entity.ReportConfig;
import com.taojin.report.web.api.ReportConfigApi;

/**
 * @author limingwei
 */
 @Component
public class ReportConfigApiImpl implements ReportConfigApi {
    @Resource
    IReportConfigService reportConfigService;

    @Override
    public String sayHi(String name) {
        return "hi, " + name;
    }

    @Override
    public ReportConfig findById(Integer id) {
        return reportConfigService.findById(id);
    }
}