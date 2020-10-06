package com.example.demo.Model;
//import com.fasterxml.jackson.annotation.JsonProperty;
public class employees {
    private int empid;
    private String empname;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    /*public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }*/


    @Override
    public String toString() {
        return "employees{" +
                "empid=" + empid +
                ", empname='" + empname +
                '}';
    }
}