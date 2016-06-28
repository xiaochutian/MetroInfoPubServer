package me.xiaochutian.jms;

import me.xiaochutian.websocket.MyHandler;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;

import java.io.IOException;

/**
 * Created by Xiaochutian on 2016/4/27.
 */

@Configuration
@EnableJms
public class Receiver {

    @JmsListener(containerFactory = "simpleJmsListenerContainerFactory",destination ="oldWarningQueue")
    public void recieveMessage(String message){
        System.out.println("Recieved  <"+message+">");
        MyHandler.sessionList.forEach(webSocketSession -> {
            try {
                webSocketSession.sendMessage(new TextMessage(message));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
