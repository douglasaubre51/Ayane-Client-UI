package com.ayane.websocketClients;

import jakarta.websocket.*;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;

public class ClientApp {
    public static String chat;
    public ClientApp() throws DeploymentException, IOException, URISyntaxException {
        WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        container.connectToServer(ClientApp.class, new URI("ws://localhost:8080/chat"));
    }

    private static Session session;
    public static ArrayList<String> list = new ArrayList();


    public static String getMessage(){
        return chat;
    }
}
