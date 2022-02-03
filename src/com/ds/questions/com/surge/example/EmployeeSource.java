package com.surge.example;

import akka.NotUsed;
import akka.stream.javadsl.Source;

public class EmployeeSource {
    public Source<Employee, NotUsed> source(){
        return Source.range(1,100).map(val ->{
            return new Employee(val,"GGGG"+ val);
        });
    }
}
