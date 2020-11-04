package kr.springcoreproject.springapplicationcontext;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class EventValidator implements Validator {

    @Override
    public boolean supports(Class<?> c) {
        return Event.class.equals(c);
    }

    @Override
    public void validate(Object target, Errors errors) {
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title","notEmpty","title이 비어있습니다.");

        // Generic 을 지원하지 않기 때문에 형변환을 직접 해줘야한다
        Event event = (Event)target;
        if (event.getTitle() == null) {
            // 여러 필드를 종합해서 봤을때 reject()
            // 특정 필드에 관해서 rejectValue()
            errors.rejectValue("title","notEmpty","title이 비어있습니다.");
        }
    }
}
