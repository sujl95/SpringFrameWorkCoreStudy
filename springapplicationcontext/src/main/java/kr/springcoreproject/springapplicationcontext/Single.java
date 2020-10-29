package kr.springcoreproject.springapplicationcontext;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@Component
public class Single {

    @PostConstruct
    public void postConstruct() {
        log.info("getProto={}",getProto());
        log.info("Single=postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("Single=PreDestroy");
    }

    @Autowired
    private Proto proto;

    public Proto getProto() {
        return proto;
    }
}
