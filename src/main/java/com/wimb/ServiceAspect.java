package com.wimb;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * @Author: meng.wu01
 * @DateTime: 2021/8/22
 */
@Aspect
@Component
public class ServiceAspect {
    private Logger log = (Logger) LoggerFactory.getLogger(ServiceAspect.class);

    @Around("execution(* src.main.java.com.wimb.*())")
    public Object arroudInvoke(ProceedingJoinPoint point) throws Throwable {
        log.info("执行参数" + point.getArgs());
        Object obj = point.proceed(point.getArgs());
        log.info("结果：" + obj);
        return obj;
    }
}
