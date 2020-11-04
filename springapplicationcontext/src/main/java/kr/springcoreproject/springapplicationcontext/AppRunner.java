package kr.springcoreproject.springapplicationcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner {

//    @Autowired
//    ApplicationContext ctx;
//
//    @Autowired
//    Proto proto;
//
//    @Autowired
//    Single single;
//
//    @Value("${app.name}")
//    String appName;

//    @Autowired
//    ApplicationEventPublisher publishEvent;

//    @Autowired
//    MessageSource messageSource;

//    @Autowired
//    ApplicationContext resourceLoader;
//
//    @Autowired
//    Validator validator;
//
//    @Autowired
//    LocalValidatorFactoryBean validator1;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        System.out.println(proto);
//        System.out.println(single.getProto());
//        System.out.println("proto");
//        System.out.println(ctx.getBean(Proto.class));
//        System.out.println(ctx.getBean(Proto.class));
//        System.out.println(ctx.getBean(Proto.class));
//
//        System.out.println("single");
//        System.out.println(ctx.getBean(Single.class));
//        System.out.println(ctx.getBean(Single.class));
//        System.out.println(ctx.getBean(Single.class));
//
//        System.out.println("proto by single");
//        System.out.println(ctx.getBean(Single.class).getProto());
//        System.out.println(ctx.getBean(Single.class).getProto());
//        System.out.println(ctx.getBean(Single.class).getProto());
//        Environment environment = ctx.getEnvironment();
//        System.out.println(Arrays.toString(environment.getActiveProfiles()));
//        System.out.println(Arrays.toString(environment.getDefaultProfiles()));
//        Environment environment = ctx.getEnvironment();
//        System.out.println(environment.getProperty("app.name"));
//        System.out.println(environment.getProperty("app.about"));
//        System.out.println(appName);
//        while (true) {
//            System.out.println(messageSource.getMessage("greeting", new String[]{"sunjun"}, Locale.getDefault()));
//            System.out.println(messageSource.getMessage("greeting", new String[]{"sunjun"}, Locale.US));
//            System.out.println(messageSource.getMessage("greeting", new String[]{"sunjun"}, Locale.KOREA));
//            Thread.sleep(1000L);
//        }
//        System.out.println(messageSource.getClass());
//        publishEvent.publishEvent(new MyEvent(this,100));
//        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("configLocation.xml");
//        ApplicationContext fileSystemXml = new FileSystemXmlApplicationContext("configLocation.xml");
//        System.out.println("ApplicationContext = " + resourceLoader.getClass());
//        Resource resource = resourceLoader.getResource("classpath:test.txt");
//        Resource resource = resourceLoader.getResource("test.txt");
//        System.out.println("Resource = "+ resource.getClass());
//        System.out.println("resource.exists=" + resource.exists());
//        System.out.println("resource.getDescription = " + resource.getDescription());
//        System.out.println("Files.readString(Path.of(resource.getURI())) = " + Files.readString(Path.of(resource.getURI())));

        //어떤 validator가 출력되는지 실행
//        System.out.println(validator.getClass());
//        System.out.println(validator1.getClass());


//        // Event 객체 생성하고 에러를 고의적으로 내기 위해 값을 넣지 않는다
//        Event event = new Event();

//        Event event = new Event();
//        event.setLimit(-1);
//        event.setEmail("asdf");


//        // EventValidator 객체를 생성
//        EventValidator eventValidator = new EventValidator();
//
//        // 검증할 Event 객체를 전달하여 Errors 인스턴스를 생성한다
//        // BeanPropertyBindingResult 기본 구현체로 사용한다
//        // Spring MVC에서 자동으로 생성해주고 실질적으로 직접 사용하지는 않는다.
//       Errors errors = new BeanPropertyBindingResult(event, "event");
//
//        // event 객체를 검사한다
////        eventValidator.validate(event, errors);
//
//        validator.validate(event, errors);
//
//        // errors에 error 가 있는지 확인한다
//        System.out.println("errors.hasErrors() = "+errors.hasErrors());
//        // forEach로 에러코드와 기본 메세지 출력
//        errors.getAllErrors().forEach( e-> {
//            System.out.println("----error code-----");
//            Arrays.stream(e.getCodes()).forEach(System.out::println);
//            System.out.println("e.getDefaultMessage() = " + e.getDefaultMessage());
//        });





        //test
    }
}
