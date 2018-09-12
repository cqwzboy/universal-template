package com.taojin.report.dao.api;

import com.taojin.report.service.entity.ReportConfig;

/**
 * @author limingwei
 */
public interface IReportConfigDao {
    ReportConfig findById(Integer id);
}