package com.spring.fm.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/***
 * @Author: jiyang
 * @Date: 2018-07-31 15:48
 */
public class LinuxConditional implements Condition{

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String osName = context.getEnvironment().getProperty("os.name");
        System.out.println(osName);
        return osName.equals("linux");
    }
}
