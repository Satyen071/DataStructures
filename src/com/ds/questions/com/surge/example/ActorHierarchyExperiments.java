package com.surge.example;


//import akka.Done;
//import akka.NotUsed;
////import akka.actor.ActorSystem;
//import akka.actor.typed.ActorRef;
//import akka.actor.typed.ActorSystem;
//import akka.stream.ActorMaterializer;
//import akka.stream.javadsl.Flow;
//import akka.stream.javadsl.RunnableGraph;
//import akka.stream.javadsl.Sink;
//import akka.stream.javadsl.Source;
//import java.util.concurrent.CompletionStage;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

interface Node {

    List<Node> getChildren();

}

class ActorHierarchyExperiments {
    public static void main(String[] args) {
//        ActorRef<String> testSystem = ActorSystem.create(Main.create(), "testSystem");
//        ActorRef<String> testSystem1 = ActorSystem.create(PrintMyActorRefActor.create(), "testSystem1");
//        testSystem.tell("start");
//        testSystem1.tell("start");
////        ActorSystem system = ActorSystem.create("basic-stream-app");
////        Source<Employee, NotUsed> source = new EmployeeSource().source();
////        Flow<Employee,Employee,NotUsed> flow = new EmployeeProcess().flow();
////        Sink<Employee, CompletionStage<Done>> sink = new EmployeeSink().sink();
////        RunnableGraph<NotUsed> runnable = source.via(flow).to(sink);
////        ActorMaterializer materializer = ActorMaterializer.create(system);
////        runnable.run(materializer);
////        ActorSystem.create(IotSupervisor.create(), "iot-system");


        class Solution {

            public int count(Node node) {

                int s = 0;

                if (node == null) {
                    return 0;
                }

                Queue<Node> que = new LinkedList<Node>();
                que.add(node);
                while (!que.isEmpty()) {
                    int n = que.size();
                    while (n > 0) {
                        Node x = que.peek();
                        que.remove();
                        if (x.getChildren().size() > 1) {
                            s++;
                        }
                        for (int k = 0; k < x.getChildren().size(); k++) {
                            que.add(x.getChildren().get(k));
                        }
                        n--;
                    }
                }
                return s;
            }
        }

    }
}