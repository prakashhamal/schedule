/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vidhya.report.DAO;

import com.vidhya.report.entity.Report;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author phamal
 */
@Stateless
public class ReportDAO {
    @PersistenceContext(unitName = "reportPU")
    private EntityManager em;

    public Report getReport() {
        List<Report> reports = em.createQuery("Select w from Report w").getResultList();
        return reports.get(0);
    }
    
    public Report getReport(int id){
        return em.find(Report.class,id);
    }
    
    public List<Report> getReports(){
        List<Report> reports = em.createQuery("Select w from Report w").getResultList();
        return reports;
    }
    
    public void deleteReport(Report report){            
        Report mergedReport = em.merge(report);
        em.remove(mergedReport);
    }
    
    public void createReport(Report report){
        em.persist(report);
    }
    
    public void updateReport(Report report){
        em.merge(report);
    }
}
