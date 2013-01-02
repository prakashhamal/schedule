package com.vidhya.report.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.2.v20111125-r10461", date="2012-10-28T12:19:31")
@StaticMetamodel(Report.class)
public class Report_ { 

    public static volatile SingularAttribute<Report, String> headers;
    public static volatile SingularAttribute<Report, Boolean> pieChart;
    public static volatile SingularAttribute<Report, String> query;
    public static volatile SingularAttribute<Report, Integer> reportId;
    public static volatile SingularAttribute<Report, Date> deleted;
    public static volatile SingularAttribute<Report, String> creator;
    public static volatile SingularAttribute<Report, String> chartColumns;
    public static volatile SingularAttribute<Report, Integer> groupId;
    public static volatile SingularAttribute<Report, String> databaseKey;
    public static volatile SingularAttribute<Report, String> title;
    public static volatile SingularAttribute<Report, Short> multiChart;
    public static volatile SingularAttribute<Report, Boolean> lineChart;
    public static volatile SingularAttribute<Report, String> description;
    public static volatile SingularAttribute<Report, String> permissionKey;
    public static volatile SingularAttribute<Report, String> owner;
    public static volatile SingularAttribute<Report, String> reportKey;
    public static volatile SingularAttribute<Report, Boolean> barChart;
    public static volatile SingularAttribute<Report, String> mainTitle;

}