package kr.springcoreproject.springapplicationcontext;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

//    @InitBinder
//    public void init(WebDataBinder webDataBinder) {
//        //Event class 타입을 처리할 PropertyEditor를 등록할 수 있다
//        //DataBinder의 구현체 중 하나이다
//        //DataBinder의 PropertyEditor를 사용해서 String으로 받은 "1"을 Integer 1로 변환이 가능하다
//        // 이렇게 구현하는 방법은 상당히 편리하지 않다 구현자체도 편리하지않고 Thread-safe하지 않으며 사용하기 힘들고 Bean으로 등록해서 사용하기도 위험하다
//        //Spring 3부터 DataBinding과 관련된 추가된 Formmater와 Converter가 있다.
//        webDataBinder.registerCustomEditor(Event.class, new EventEditor());
//    }

    // GetMapping 애노테이션으로 Get Request를 /event/이벤트id로 받게된다
    @GetMapping("/event/{event}")
    //@PathVariable 애노테이션으로 {event}는 event 도메인 객체로 받아서 매개 변수에 넣어준다
    // EX) www.TheWing.com/event/1 이렇게 입력했다고 가정하면 1인 부분인 이벤트 id를 Event 타입에 맞게 변환을 해야한다
    public String getEvent(@PathVariable Event event) {
        System.out.println(event);
        return event.getId().toString();
    }


}
