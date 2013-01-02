/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vidhya.report.EJB;

import com.vidhya.report.DAO.GroupDAO;
import com.vidhya.report.DAO.ReportDAO;
import com.vidhya.report.entity.Report;
import com.vidhya.report.entity.ReportGroup;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Named;

/**
 *
 * @author phamal
 */
@Named("ReportBean")
@Stateless
public class ReportBean implements Serializable {

    @EJB
    private ReportDAO reportDao;

    public Report getReport(int id) {
        return reportDao.getReport(id);
    }

    public List<Report> getReports() {
        return reportDao.getReports();
    }

    public void deleteReport(Report report) {        
        reportDao.deleteReport(report);
    }

    public void saveReport(Report report) {
        if (report.getReportId() == null) {            
            reportDao.createReport(report);
        } else {
            reportDao.updateReport(report);
        }
    }
}
