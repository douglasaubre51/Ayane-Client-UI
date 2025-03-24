package com.ayane.windows;

import java.awt.BorderLayout;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class PopUpWindow extends JFrame {
    PopUpWindow(String name) {
        setLayout(null);
        setTitle(name);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("account created successfully!");
        label.setBounds(30, 0, 250, 20);
        add(label);

        JButton loginButton = new JButton("login");
        loginButton.setBounds(30, 60, 100, 20);

        add(loginButton);

        setVisible(true);
    }
}
