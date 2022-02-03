package com.surge.example;

public class Employee {
    private String name;
    private Integer Id;
    private String dept;

    public Employee(Integer val, String s) {
        this.Id = val;
        this.name = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", dept='" + dept + '\'' +
                '}';
    }
}
