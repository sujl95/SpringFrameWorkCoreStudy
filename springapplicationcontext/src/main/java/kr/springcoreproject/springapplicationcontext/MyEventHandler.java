package kr.springcoreproject.springapplicationcontext;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.*;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

//@Component
//public class MyEventHandler {
//
//    @EventListener
//    @Order(Ordered.HIGHEST_PRECEDENCE)
//    @Async
//    public void handle(MyEvent event) {
//        System.out.println(Thread.currentThread().toString());
//        System.out.println("이벤트를 받았다. 데이터는 "+ event.getData());
//    }
//
//    @EventListener
//    @Async
//    public void handle(ContextRefreshedEvent event) {
//        System.out.println(Thread.currentThread().toString());
//        System.out.println("ContextRefreshedEvent");
//    }
//
//    @EventListener
//    @Async
//    public void handle(ContextStartedEvent event) {
//        System.out.println(Thread.currentThread().toString());
//        System.out.println("ContextRefreshedEvent");
//    }
//
//    @EventListener
//    @Async
//    public void handle(ContextStoppedEvent event) {
//        System.out.println(Thread.currentThread().toString());
//        System.out.println("ContextRefreshedEvent");
//    }
//
//    @EventListener
//    @Async
//    public void handle(ContextClosedEvent event) {
//        System.out.println(Thread.currentThread().toString());
//        System.out.println("ContextClosedEvent");
//    }
//}
