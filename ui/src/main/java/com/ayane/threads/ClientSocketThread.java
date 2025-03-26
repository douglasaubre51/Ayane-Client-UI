package com.ayane.threads;

import java.net.URI;

import com.ayane.services.MyWebSocket;

import jakarta.websocket.ContainerProvider;
import jakarta.websocket.WebSocketContainer;

public class ClientSocketThread implements Runnable {
    
    private volatile boolean running=true;

    @Override
    public void run(){
        try{
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
