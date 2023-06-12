package org.chat.server;

import org.network.TCPConnection;
import org.network.TCPConnectionListener;

import java.io.IOException;
import java.net.ServerSocket;

public class ChatServer implements TCPConnectionListener{
    public static void main(String[] args) {
        new ChatServer();
    }

    public ChatServer(){
        System.out.println("Server running...");
        try {
            ServerSocket serverSocket = new ServerSocket(8189);
            while(true){
                try {

                    new TCPConnection(this, serverSocket.accept());
                } catch (IOException e){
                    System.out.println("TCPConnection exeption: " + e);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void onConnectionReady(TCPConnection tcpConnection) {

    }

    public void onReceiveString(TCPConnection tcpConnection, String value) {

    }

    public void onDisconnect(TCPConnection tcpConnection) {

    }

    public void onException(TCPConnection tcpConnection, Exception e) {

    }
}