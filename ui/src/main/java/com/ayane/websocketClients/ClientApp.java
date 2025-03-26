package com.ayane.websocketClients;

import jakarta.websocket.*;
import java.net.URI;
import java.util.*;

@ClientEndpoint
public class ClientApp {
    private static Session session;

    @OnOpen
    public void OnOpen(Session session) {
        ClientApp.session = session;
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

    public void main() {
        WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        try {
            container.connectToServer(ClientApp.class, new URI("ws://ayane-web-api.onrender.com/chat"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
