package com.vidhya.report.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2012-10-28T12:19:31")
@StaticMetamodel(ReportGroup.class)
public class ReportGroup_ { 

    public static volatile SingularAttribute<ReportGroup, Integer> groupId;
    public static volatile SingularAttribute<ReportGroup, Integer> parentId;
    public static volatile SingularAttribute<ReportGroup, String> permissionKey;
    public static volatile SingularAttribute<ReportGroup, String> name;
    public static volatile SingularAttribute<ReportGroup, Date> deleted;

}