package com.ayane.windows;

import java.util.ArrayList;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.ayane.websocketClients.ClientApp;

public class ChatWindow extends JFrame {
    public ChatWindow(String name) {
        setLayout(null);
        setTitle(name);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JTextField chatBox = new JTextField(100);
        chatBox.setBounds(10, 10, 400, 30);
        add(chatBox);
        TextArea area = new TextArea();
        area.setBounds(10, 40, 500, 500);
        add(area);

        JButton sendButton = new JButton("send");
        sendButton.setBounds(10, 50, 100, 20);
        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        add(sendButton);

        setVisible(true);

            }
        }
