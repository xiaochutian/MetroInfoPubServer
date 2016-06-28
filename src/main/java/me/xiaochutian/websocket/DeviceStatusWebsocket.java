package me.xiaochutian.websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * Created by Xiaochutian on 2016/4/25.
 */

@Configuration
@EnableWebSocket
public class DeviceStatusWebsocket implements WebSocketConfigurer{
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
//        registry.addHandler(myHandler(),"/myHandler").setAllowedOrigins("http://localhost").addInterceptors(new HandshakeInterceptor() {
//            @Override
//            public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> attributes) throws Exception {
//                System.out.println("before handshake...");
//                return true;
//            }
//
//            @Override
//            public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Exception exception) {
//                System.out.println("after handshake...");
//            }
//        });
        registry.addHandler(myHandler(),"/myHandler").setAllowedOrigins("*");
    }
    @Bean
    public WebSocketHandler myHandler(){
        return new MyHandler();
    }
}
