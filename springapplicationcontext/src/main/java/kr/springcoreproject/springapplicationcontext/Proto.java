package kr.springcoreproject.springapplicationcontext;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Component
@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Proto {

    @PostConstruct
    public void postConstruct() {
//        log.info("getProto={}",single.getProto());
        log.info("Proto=postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("Proto=PreDestroy");
    }
}
