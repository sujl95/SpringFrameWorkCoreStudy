package kr.springcoreproject.springapplicationcontext.AOP;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Annotation을 만들때 주의점은 RetentionPolicy를 CLASS이상으로 줘야한다
@Retention(RetentionPolicy.CLASS)
// Retention : Annotation 정보를 얼마나 유지할것인지?
// CLASS : CLASS 파일에서만 적용 @PerLogging 적용시 Annotation 정보가 바이트 코드까지 남아있는다
// SOURCE : 컴파일시 사라진다
// RUNTIME : RUNTIME시 사라진다
public @interface PerLogging {
}
