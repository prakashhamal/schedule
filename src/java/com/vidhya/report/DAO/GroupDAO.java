/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vidhya.report.DAO;

import com.vidhya.report.entity.ReportGroup;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author phamal
 */
@Stateless
public class GroupDAO {
    @PersistenceContext(unitName = "reportPU")
    private EntityManager em;

    public ReportGroup getGroup(int id) {
        return em.find(ReportGroup.class, id);
    }
    
    public void saveGroup(ReportGroup group){
        em.persist(group);
    }
    public void updateGroup(ReportGroup group){
        em.merge(group);
    }
    
    public List<ReportGroup> getGroups(){
        List<ReportGroup> groups = em.createQuery("Select w from ReportGroup w").getResultList();
        return groups;
    }
    
    public void deleteGroup(ReportGroup reportgroup){        
        ReportGroup group = em.merge(reportgroup);
        em.remove(group);
    }
}