package com.ayane.services;

import jakarta.websocket.ClientEndpoint;
import jakarta.websocket.*;

@ClientEndpoint
public class MyWebSocket {
    private Session session;

    @OnOpen
    public void OnOpen(Session session) {
        this.session = session;
        System.out.println("connection established!");
    }

    @OnMessage
    public void OnMessage(String message) {
        System.out.println("message : " + message);
    }

    @OnClose
    public void OnClose(Session session) {
        System.out.println("disconnected!");
    }
}
