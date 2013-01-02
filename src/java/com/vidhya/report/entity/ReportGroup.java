/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vidhya.report.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author phamal
 */
@Entity
@Table(name = "report_group")
public class ReportGroup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "group_id")
    private Integer groupId;
    @Column(name = "name")
    private String name;
    @Column(name = "parent_id")
    private int parentId;
    @Column(name = "deleted")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deleted;
    @Basic(optional = false)
    @Column(name = "permission_key")
    private String permissionKey;
    
    @OneToMany(mappedBy="reportGroup")    
    private List<Report> reports;

    public ReportGroup() {
    }

    public ReportGroup(Integer groupId) {
        this.groupId = groupId;
    }

    public ReportGroup(Integer groupId, String name, int parentId, String permissionKey) {
        this.groupId = groupId;
        this.name = name;
        this.parentId = parentId;
        this.permissionKey = permissionKey;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public Date getDeleted() {
        return deleted;
    }

    public void setDeleted(Date deleted) {
        this.deleted = deleted;
    }

    public String getPermissionKey() {
        return permissionKey;
    }

    public void setPermissionKey(String permissionKey) {
        this.permissionKey = permissionKey;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupId != null ? groupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReportGroup)) {
            return false;
        }
        ReportGroup other = (ReportGroup) object;
        if ((this.groupId == null && other.groupId != null) || (this.groupId != null && !this.groupId.equals(other.groupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vidhya.report.entity.ReportGroup[ groupId=" + groupId + " ]";
    }
    
}
