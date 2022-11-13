package com.neuedu.demo.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Emp {
    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    private Date hiredate;
    private Double sal;
    private Double comm;
    private Integer deptno;

    //一对一关联
    private Dept dept;

}
