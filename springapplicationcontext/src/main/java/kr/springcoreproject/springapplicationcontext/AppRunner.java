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

    @Autowired
    ApplicationContext resourceLoader;


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
        System.out.println("ApplicationContext = " + resourceLoader.getClass());
//        Resource resource = resourceLoader.getResource("classpath:test.txt");
        Resource resource = resourceLoader.getResource("test.txt");
        System.out.println("Resource = "+ resource.getClass());
        System.out.println("resource.exists=" + resource.exists());
        System.out.println("resource.getDescription = " + resource.getDescription());
        System.out.println("Files.readString(Path.of(resource.getURI())) = " + Files.readString(Path.of(resource.getURI())));

    }
}
