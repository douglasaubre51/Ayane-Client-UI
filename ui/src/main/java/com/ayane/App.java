package com.ayane;

import com.ayane.helpers.UITools;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ayane says hi!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        JFrame frame = new JFrame("Ayane");
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel h1Label = new JLabel("Create an Account");
        h1Label.setBounds(20, 0, 500, 50);
        h1Label.setFont(new Font("Serif", Font.BOLD, 30));
        frame.add(h1Label);

        JLabel nameLabel = new JLabel("username:");
        nameLabel.setBounds(20, 60, 100, 20);
        frame.add(nameLabel);

        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(110, 60, 200, 20);
        frame.add(nameTextField);

        JLabel emailLabel = new JLabel("email:");
        emailLabel.setBounds(20, 80, 100, 20);
        frame.add(emailLabel);

        JTextField emailTextField = new JTextField();
        emailTextField.setBounds(110, 80, 200, 20);
        frame.add(emailTextField);

        JLabel passwordLabel = new JLabel("password:");
        passwordLabel.setBounds(20, 100, 100, 20);
        frame.add(passwordLabel);

        JTextField passwordTextField = new JTextField();
        passwordTextField.setBounds(110, 100, 200, 20);
        frame.add(passwordTextField);

        JButton submitButton = new JButton("create");
        submitButton.setBounds(40, 140, 100, 20);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UITools tools = new UITools();
                tools.clearTextFields(nameTextField, emailTextField, passwordTextField);
            }
        });
        frame.add(submitButton);

        JButton resetButton = new JButton("clear");
        resetButton.setBounds(200, 140, 100, 20);

        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UITools tools = new UITools();
                tools.clearTextFields(nameTextField, emailTextField, passwordTextField);
            }
        });
        frame.add(resetButton);

        frame.setVisible(true);
    }
}
