package com.neuedu.demo.pojo;

import lombok.Data;

import java.util.Date;


@Data
public class Person {
    private Integer pid;
    private String pname;
    private String password;
    private String sex;
    private Date birthday;
    private String address;
    private Double money;
}
