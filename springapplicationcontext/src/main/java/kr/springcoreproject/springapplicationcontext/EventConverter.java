package kr.springcoreproject.springapplicationcontext;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;


public class EventConverter {
    //상태 정보가 없기 때문에 Component 빈으로 등록해서 사용이 가능하다
    //Converter 인터페이스를 구현해서 사용할 일은 없다
    @Component
    public static class StringToEventConverter implements Converter<String, Event> {
        @Override
        public Event convert(String source) {
            //source를 받아서 Event 객체를 생성해준다
            return new Event(Integer.parseInt(source));
        }
    }

    @Component
    public static class EventToStringConverter implements Converter<Event , String> {
        @Override
        public String convert(Event source) {
            //source를 받아서 Id를 리턴해준다
            return source.getId().toString();
        }
    }
}
