/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vidhya.report.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author phamal
 */
@Entity
@Table(name = "report")
public class Report implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "report_id")
    private Integer reportId;
    @Column(name = "report_key")
    private String reportKey;
    @Column(name = "title")
    private String title;
    @Column(name = "query")
    private String query;
    @Column(name = "group_id")
    private int groupId;
    @Column(name = "headers")
    private String headers;
    @Column(name = "permission_key")
    private String permissionKey;
    @Column(name = "database_key")
    private String databaseKey;
    @Column(name = "deleted")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deleted;
    @Column(name = "line_chart")
    private boolean lineChart;
    @Column(name = "bar_chart")
    private boolean barChart;
    @Column(name = "pie_chart")
    private boolean pieChart;
    @Column(name = "main_title")
    private String mainTitle;
    @Column(name = "creator")
    private String creator;
    @Column(name = "owner")
    private String owner;
    @Column(name = "description")
    private String description;
    @Column(name = "chart_columns")
    private String chartColumns;
    @Column(name = "multi_chart")
    private short multiChart;
    
    @ManyToOne
    @JoinColumn(name="group_id",insertable=false,updatable=false)
    private ReportGroup reportGroup;

    public Report() {
    }

    public Report(Integer reportId) {
        this.reportId = reportId;
    }

    public Report(Integer reportId, String reportKey, String title, String query, int groupId, String headers, String permissionKey, String databaseKey, boolean lineChart, boolean barChart, boolean pieChart, String mainTitle, String creator, String owner, String description, String chartColumns, short multiChart) {
        this.reportId = reportId;
        this.reportKey = reportKey;
        this.title = title;
        this.query = query;
        this.groupId = groupId;
        this.headers = headers;
        this.permissionKey = permissionKey;
        this.databaseKey = databaseKey;
        this.lineChart = lineChart;
        this.barChart = barChart;
        this.pieChart = pieChart;
        this.mainTitle = mainTitle;
        this.creator = creator;
        this.owner = owner;
        this.description = description;
        this.chartColumns = chartColumns;
        this.multiChart = multiChart;
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public String getReportKey() {
        return reportKey;
    }

    public void setReportKey(String reportKey) {
        this.reportKey = reportKey;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    public String getPermissionKey() {
        return permissionKey;
    }

    public void setPermissionKey(String permissionKey) {
        this.permissionKey = permissionKey;
    }

    public String getDatabaseKey() {
        return databaseKey;
    }

    public void setDatabaseKey(String databaseKey) {
        this.databaseKey = databaseKey;
    }

    public Date getDeleted() {
        return deleted;
    }

    public void setDeleted(Date deleted) {
        this.deleted = deleted;
    }

    public boolean getLineChart() {
        return lineChart;
    }

    public void setLineChart(boolean lineChart) {
        this.lineChart = lineChart;
    }

    public boolean getBarChart() {
        return barChart;
    }

    public void setBarChart(boolean barChart) {
        this.barChart = barChart;
    }

    public boolean getPieChart() {
        return pieChart;
    }

    public void setPieChart(boolean pieChart) {
        this.pieChart = pieChart;
    }

    public String getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getChartColumns() {
        return chartColumns;
    }

    public void setChartColumns(String chartColumns) {
        this.chartColumns = chartColumns;
    }

    public short getMultiChart() {
        return multiChart;
    }

    public void setMultiChart(short multiChart) {
        this.multiChart = multiChart;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reportId != null ? reportId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Report)) {
            return false;
        }
        Report other = (Report) object;
        if ((this.reportId == null && other.reportId != null) || (this.reportId != null && !this.reportId.equals(other.reportId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vidhya.report.entity.Report[ reportKey=" + this.reportKey + " ]";
    }

    public ReportGroup getGroup() {
        return reportGroup;
    }

    public void setGroup(ReportGroup reportGroup) {
        this.reportGroup = reportGroup;
    }
}
