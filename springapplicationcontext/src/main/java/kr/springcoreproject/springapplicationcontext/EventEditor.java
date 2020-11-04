package kr.springcoreproject.springapplicationcontext;

import java.beans.PropertyEditorSupport;

public class EventEditor extends PropertyEditorSupport {

    // 보통 이 두개를 구현하지만 필요한것은 Text를 event로 구현하기 위함이다
    // 값이 들어오는것은 문자열이지만 Integer로 변환해야한다

    @Override
    public String getAsText() {
        Event event = (Event)getValue();
        return event.getId().toString();
    }

    //서로 다른 쓰레드에게 공유가 되기 때문에 Thread safe하지 않다
    //Thread safe하지 않기 때문에 여러 쓰레드에 공유해서 사용하면 안된다
    //그냥 빈으로 Component로 등록하면 안된다
    //웬만해서 절대 사용하면 안된다
    //Bean scope로 Thread scope 빈으로 사용하면 그나마 괜찮다.
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(new Event(Integer.parseInt(text)));
    }
}
