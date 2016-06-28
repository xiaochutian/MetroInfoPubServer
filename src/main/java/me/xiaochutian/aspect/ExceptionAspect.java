/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.xiaochutian.aspect;

import java.util.Arrays;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author Xiaochutian
 */
@Component
@Aspect
public class ExceptionAspect {
//    private final Logger logger = LoggerFactory.getLogger(WelcomeController.class);
    
    @Pointcut("execution(* me.xiaochutian.*.*.*(..))")
    private void anyMethod() {  
    }// 定义一个切入点  
    
    @Before("me.xiaochutian.aspect.ExceptionAspect.anyMethod()")  
    public void doBefore() {  
        System.out.println("before..........");  
    }  
    
    @Around("anyMethod()")  
    public Object doBasicProfiling(ProceedingJoinPoint joinPoint) throws Throwable {  
//        System.out.println("进入环绕通知");  
//        System.out.println("目标类名称："+joinPoint.getTarget().getClass().getName());  
//        System.out.println("方法名称："+joinPoint.getSignature().getName());  
//        System.out.println("方法参数："+joinPoint.getArgs());  
//        System.out.println("staticPart:"+ joinPoint.getStaticPart().toShortString());  
//        System.out.println("kind:"+joinPoint.getKind());  
//        System.out.println("sourceLocation:"+joinPoint.getSourceLocation());  
//        Object object = joinPoint.proceed();// 执行该方法  
//        System.out.println("退出方法");  
        Logger logger = LoggerFactory.getLogger(joinPoint.getTarget().getClass());
        logger.debug("方法名称："+joinPoint.getSignature().getName());
        logger.debug("方法参数：");
        Arrays.stream(joinPoint.getArgs()).forEach(a->logger.debug(a.toString()+" "));
        Object object = joinPoint.proceed();
        logger.debug("方法完成");
        return object;  
    }  
    
}
