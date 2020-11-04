package kr.springcoreproject.springapplicationcontext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    // GetMapping 애노테이션으로 Get Request를 /event/이벤트id로 받게된다
    @GetMapping("/event/{event}")
    //@PathVariable 애노테이션으로 {event}는 event 도메인 객체로 받아서 매개 변수에 넣어준다
    // EX) www.TheWing.com/event/1 이렇게 입력했다고 가정하면 1인 부분인 이벤트 id를 Event 타입에 맞게 변환을 해야한다
    public String getEvent(@PathVariable Event event) {
        System.out.println(event);
        return event.getId().toString();
    }
}
