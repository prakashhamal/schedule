/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vidhya.report.view;

import com.vidhya.report.EJB.GroupBean;
import com.vidhya.report.entity.ReportGroup;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author phamal
 */
@Named("groupMB")
@ManagedBean
@RequestScoped
public class GroupMB implements Serializable {

    @EJB
    private GroupBean groupBean;
    private ReportGroup group;
    private List<ReportGroup> groups;

    @PostConstruct
    private void init() {
        FacesContext context = FacesContext.getCurrentInstance();
        Map<String, String> params = context.getExternalContext().getRequestParameterMap();
        String id = params.get("id");
        
        if (id != null) {
            group = groupBean.getGroup(Integer.parseInt(id));
        } else {        
            group = new ReportGroup();
        }
        groups = groupBean.getGroups();
    }

    public void saveGroup() {
        groupBean.saveGroup(group);
    }

    public void deleteGroup(ReportGroup group) {
        groupBean.deleteGroup(group);
    }

    public ReportGroup getGroup() {
        return this.group;
    }

    public List<ReportGroup> getGroups() {
        return this.groups;
    }
}
