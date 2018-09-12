package com.taojin.report.service.api;

import com.taojin.report.service.entity.ReportConfig;

/**
 * @author limingwei
 */
public interface IReportConfigService {
    ReportConfig findById(Integer id);
}