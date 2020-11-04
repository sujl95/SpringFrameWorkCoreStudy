package kr.springcoreproject.springapplicationcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class EventFormatter implements Formatter<Event> {
    // Formatter로 처리하는 타입을 하나 준다
    // 딱 두개만 구현하면된다 parse, print
    // 문자를 받아서 객체로 다른 하나는 객체를 받아서 문자열로 , locale 정보를 기반으로 바꿀 수 있다.
    // Thread-safe하다
    // 빈으로 등록해서 사용가능 즉 다른 빈으로 주입해서 등록이 가능하다


    @Override
    public Event parse(String text, Locale locale) throws ParseException {
        return new Event(Integer.parseInt(text));
    }

    @Override
    public String print(Event object, Locale locale) {
        return object.getId().toString();
    }
}
