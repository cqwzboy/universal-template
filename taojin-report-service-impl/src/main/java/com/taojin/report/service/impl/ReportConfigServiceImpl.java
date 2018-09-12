package com.taojin.report.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.taojin.report.dao.api.IReportConfigDao;
import com.taojin.report.service.api.IReportConfigService;
import com.taojin.report.service.entity.ReportConfig;

/**
 * @author limingwei
 */
@Service
public class ReportConfigServiceImpl implements IReportConfigService{
    @Resource
    IReportConfigDao reportConfigDao;

    @Override
    public ReportConfig findById(Integer id) {
        return reportConfigDao.findById(id);
    }
}