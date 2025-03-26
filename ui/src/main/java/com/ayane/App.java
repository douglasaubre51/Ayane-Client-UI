package com.ayane;

import java.net.URI;

import com.ayane.threads.ClientSocketThread;
import jakarta.websocket.ContainerProvider;
import jakarta.websocket.WebSocketContainer;

import com.ayane.services.*;
import com.ayane.windows.LoginWindow;

/**
 * ayane says hi!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        try{
        WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        container.connectToServer(MyWebSocket.class, new URI("ws://localhost:8080/chat"));

        LoginWindow login = new LoginWindow("ayane - login");
        }
        catch(Exception e){e.printStackTrace();}
    }
}
