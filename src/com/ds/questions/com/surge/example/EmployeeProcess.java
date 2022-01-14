package com.surge.example;

import akka.NotUsed;
import akka.stream.javadsl.Flow;

public class EmployeeProcess {
    Flow<Employee,Employee,NotUsed> flow(){
        return Flow.fromFunction(emp -> {
            emp.setDept("ATTACK");
            return emp;
        });
    }
}
