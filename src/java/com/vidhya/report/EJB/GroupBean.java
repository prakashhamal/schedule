/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vidhya.report.EJB;

import com.vidhya.report.DAO.GroupDAO;
import com.vidhya.report.entity.ReportGroup;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author phamal
 */
@Stateless
public class GroupBean {

    @EJB
    private GroupDAO groupDao;

    public List<ReportGroup> getGroups() {
        return groupDao.getGroups();
    }

    public void saveGroup(ReportGroup group) {    
        if(group.getGroupId() != null){    
            groupDao.updateGroup(group);
        }else{    
            groupDao.saveGroup(group);
        }
    }    
    
    public void deleteGroup(ReportGroup group){
        groupDao.deleteGroup(group);
    }
    
    public ReportGroup getGroup(int id){
        return groupDao.getGroup(id);
    }
}
