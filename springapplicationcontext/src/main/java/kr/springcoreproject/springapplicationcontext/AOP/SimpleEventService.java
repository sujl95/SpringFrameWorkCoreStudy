package kr.springcoreproject.springapplicationcontext.AOP;

import org.springframework.stereotype.Service;

@Service
public class SimpleEventService implements EventService{
    @PerLogging
    @Override
    public void createEvent() {
        long begin = System.currentTimeMillis();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Created an event");

//        System.out.println(System.currentTimeMillis() - begin);
    }

    @PerLogging
    @Override
    public void publishEvent() {
        long begin = System.currentTimeMillis();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Published an event");
//        System.out.println(System.currentTimeMillis() - begin);
    }

    public void deleteEvent() {
        System.out.println("Deleted an event");
    }

}
