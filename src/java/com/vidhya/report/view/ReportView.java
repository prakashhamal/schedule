/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vidhya.report.view;

import com.vidhya.report.entity.Report;
import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.naming.InitialContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

/**
 *
 * @author phamal
 */
@Named("reportView")
@ManagedBean
@RequestScoped
public class ReportView {

    @PersistenceContext(unitName = "reportPU")
    private EntityManager em;
    private Report report = new Report();

    public void doCreateReport() {
        try {
            UserTransaction transaction = (UserTransaction) new InitialContext().lookup("java:comp/UserTransaction");
            transaction.begin();
            em.persist(report);
            transaction.commit();

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            System.out.println("Cannot create the reportgroup");
        }
    }

    public void setReportKey(String key) {
        report.setReportKey(key);
    }

    public void setHeaders(String headers) {
        report.setHeaders(headers);
    }

    public void setTitle(String title) {
        report.setTitle(title);
    }

    public void setQuery(String query) {
        report.setQuery(query);
    }

    public String getReportKey() {
        return report.getReportKey();
    }

    public String getHeaders() {
        return report.getHeaders();
    }

    public String getTitle() {
        return report.getTitle();
    }

    public String getQuery() {
        return report.getQuery();
    }
}
