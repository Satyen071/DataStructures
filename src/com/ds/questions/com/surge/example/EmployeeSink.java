package com.surge.example;

import akka.Done;
import akka.NotUsed;
import akka.stream.javadsl.Sink;

import java.security.PublicKey;
import java.util.concurrent.CompletionStage;

public class EmployeeSink {
    public Sink<Employee, CompletionStage<Done>> sink(){
        return Sink.foreach(System.out::println);
    }
}
