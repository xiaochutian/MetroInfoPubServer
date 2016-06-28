package me.xiaochutian.jms;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;

/**
 * Created by Xiaochutian on 2016/5/9.
 */
@Configuration
//@EnableJms
public class MyJmsListenerContainerFactory {
    @Bean
    public SimpleJmsListenerContainerFactory simpleJmsListenerContainerFactory(){
        SimpleJmsListenerContainerFactory simpleJmsListenerContainerFactory = new SimpleJmsListenerContainerFactory();
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
        activeMQConnectionFactory.setBrokerURL("tcp://10.108.104.238:61616");
        activeMQConnectionFactory.setUserName("admin");
        activeMQConnectionFactory.setPassword("admin");
        simpleJmsListenerContainerFactory.setConnectionFactory(activeMQConnectionFactory);
        System.out.println("simpleJmsListenerContainerFactory set ...");
        return simpleJmsListenerContainerFactory;
    }
}
