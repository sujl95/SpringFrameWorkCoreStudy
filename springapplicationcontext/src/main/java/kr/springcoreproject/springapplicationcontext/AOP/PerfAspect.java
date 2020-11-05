package kr.springcoreproject.springapplicationcontext.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerfAspect {

    //execution으로 적용시
    //해야할 일 = Advice
//    @Around("execution(* kr.springcoreproject..*.EventService.*(..))")
    // Advice를 어떻게 적용할 것인지 메서드를 감싸고 있는 형태로 적용 된다.
    // 메서드 호출이전 이후에 적용 가능하다.
    // 다용도로 사용이 가능하다
    // 단점 execution 끼리 조합이 안된다
    // 할수는 있는데 execution advice를 두개를 만들고 중복되는 코드를 Aspect 메소드로 빼서 사용

    // 로깅시 Annotation으로 추천


    //Annotation으로 적용시 @PerLogging Annotation이 되어있는곳만 적용한다
//    @Around("@annotation(PerLogging)")

    //Bean으로 적용시
    // 빈이 가지고있는 곳 모두에 적용이 가능하다
    // @Around("bean(simpleEventService)")
    public Object logPerf(ProceedingJoinPoint pjp) throws Throwable{
        long begin = System.currentTimeMillis();
//        ProceedingJoinPoint -> 대상 적용 이벤트 필터
        Object retVal = pjp.proceed(); //proceed 메서드를 실행해주는것 사용시 throws Throwable
        System.out.println(System.currentTimeMillis() - begin);
        return retVal;
    }
}
