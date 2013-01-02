/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vidhya.report.view;


import com.vidhya.report.EJB.GroupBean;
import com.vidhya.report.EJB.ReportBean;
import com.vidhya.report.entity.Report;
import com.vidhya.report.entity.ReportGroup;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author phamal
 */
@Named("reportsDisplay")
@ManagedBean
@ViewScoped
public class ReportsDisplay {
    
    @EJB
    private ReportBean reportBean;
    @EJB
    private GroupBean groupBean;
    
    private List<Report> reports;
    private List<ReportGroup> groups;
    private ReportGroup selectedGroup;
    
        
    @PostConstruct
    public void initAction(){
        reports = reportBean.getReports();
        groups = groupBean.getGroups();
    }
    
    public List<Report> getReports(){
        return reports;
    }
    
    public List<ReportGroup> getGroups(){
        return groups;
    }
    
    public void selectGroup(ReportGroup group){
        System.out.println("Selected Group ==  "+group.getName());
        this.selectedGroup = group;
    }
    
    public void test(){
        System.out.println("I am testing the ajax");
    }
    
    
    
}
