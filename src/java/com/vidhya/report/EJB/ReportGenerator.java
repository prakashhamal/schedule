/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vidhya.report.EJB;

import com.vidhya.report.entity.Report;
import com.vidhya.report.model.ReportDisplayModel;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author phamal
 */
@Named("reportGen")
@Stateless
public class ReportGenerator {
    @PersistenceContext(unitName = "reportPU")
    private EntityManager em;
    private Report report;
    
    @EJB
    ReportBean reportBean;
    
    ReportDisplayModel displayModel;
    
    
    public void setReport(int id){
        report = reportBean.getReport(id);
    }
    
    /*
     * From the report key get the JDBC config and run the query
     * 
     */
    
    private void loadReportData(){
        displayModel = new ReportDisplayModel();
        String sql = report.getQuery();
        ReportDisplayModel model = new ReportDisplayModel();
        model.setReport(report);        
    }
    
    
    public ReportDisplayModel getDisplayModel(){
        if(displayModel == null){
            loadReportData();
        } 
        return displayModel;
    }
    
            
    
}
