/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vidhya.report.view;

import com.vidhya.report.EJB.GroupBean;
import com.vidhya.report.EJB.ReportBean;
import com.vidhya.report.entity.Report;
import com.vidhya.report.entity.ReportGroup;
import java.io.Serializable;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author phamal
 */
@Named("reportMB")
@ManagedBean
@RequestScoped
public class ReportMB implements Serializable{
    
    @EJB private ReportBean reportBean;
    @EJB private GroupBean groupBean;
    
    private Report report;
    private List<Report> reports;
    private List<ReportGroup> groups;
    private String title;
    
    
    @PostConstruct
    public void init(){  
        
        report = new Report();
        reports = reportBean.getReports();
        groups = groupBean.getGroups();        
    }
    
    public List<Report> getReports(){
        return reports;
    }
    
    public List<ReportGroup> getGroups(){
        return groups;
    }
       
    public void saveReport(){ 
        System.out.println("Title ---- "+title);
       if(report.getReportKey() != null){
            reportBean.saveReport(report);
       }
    }
    
    
    public void deleteReport(Report ireport){
        reportBean.deleteReport(ireport);
    }
    
   
    public Report getReport(){
        return report;
    }
    
    public List getReportViewModel(){
        return null;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

   
}
