package com.ayane.windows;

import javax.swing.JFrame;

public class LoginWindow extends JFrame {
    public LoginWindow(String name) {
        setLayout(null);
        setTitle(name);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setVisible(true);
    }

}
