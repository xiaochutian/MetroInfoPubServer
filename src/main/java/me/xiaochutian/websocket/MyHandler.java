package me.xiaochutian.websocket;

import org.springframework.web.socket.*;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Xiaochutian on 2016/4/26.
 */
public class MyHandler implements WebSocketHandler {
    public static AtomicInteger count = new AtomicInteger();
    public static CopyOnWriteArraySet<WebSocketSession> sessionList = new CopyOnWriteArraySet<>();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        System.out.println("connected..."+count.addAndGet(1));
        sessionList.add(session);
        session.sendMessage(new TextMessage("{\"type\":\"1\",\"time\":\"2015/05/25 22:30:56\",\"city\":\"1\",\"line\":\"1\",\"subsystem\":\"4\",\"subsystemId\":\"10\",\"device\":\"147\",\"deviceAdd\":\"255\",\"level\":\"0\"}"));
    }

    @Override
    public void handleMessage(WebSocketSession session, WebSocketMessage<?> message) throws Exception {
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {

    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus closeStatus) throws Exception {
        sessionList.remove(session);
        System.out.println("connected..."+count.addAndGet(-1));
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }
}

