package me.xiaochutian.jms;

import com.google.gson.Gson;
import me.xiaochutian.websocket.MyHandler;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;
import org.springframework.web.socket.TextMessage;

import java.io.IOException;

/**
 * Created by Xiaochutian on 2016/5/9.
 */

@Configuration
@EnableJms
public class CSGDReceiver {

    @Bean
    public Gson gson(){
        return new Gson();
    }

    @JmsListener(containerFactory = "simpleJmsListenerContainerFactory",destination ="warningQueue")
    public void recieveMessage(String message){
        System.out.println("CSGDReciever...");
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
