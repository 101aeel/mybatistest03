package com.neuedu.demo.pojo;

import lombok.Data;

import java.util.List;


@Data
public class Dept {
    private Integer deptno;
    private String dname;
    private String loc;
    private Integer type;

    //一对一复合属性
    private DeptType deptType;

    //一对多复合属性
    private List<Emp> empList;

}
