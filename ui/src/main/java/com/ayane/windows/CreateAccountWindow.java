package com.ayane.windows;

import com.ayane.helpers.UITools;
import com.ayane.repositories.AccountRepository;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateAccountWindow extends JFrame {
    public CreateAccountWindow(String name) {
        setLayout(null);
        setTitle(name);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel h1Label = new JLabel("Create an Account");
        h1Label.setBounds(20, 0, 500, 50);
        h1Label.setFont(new Font("Serif", Font.BOLD, 30));
        add(h1Label);

        JLabel nameLabel = new JLabel("username:");
        nameLabel.setBounds(20, 60, 100, 20);
        add(nameLabel);

        JTextField nameTextField = new JTextField();
        nameTextField.setBounds(110, 60, 200, 20);
        add(nameTextField);

        JLabel emailLabel = new JLabel("email:");
        emailLabel.setBounds(20, 80, 100, 20);
        add(emailLabel);

        JTextField emailTextField = new JTextField();
        emailTextField.setBounds(110, 80, 200, 20);
        add(emailTextField);

        JLabel passwordLabel = new JLabel("password:");
        passwordLabel.setBounds(20, 100, 100, 20);
        add(passwordLabel);

        JTextField passwordTextField = new JTextField();
        passwordTextField.setBounds(110, 100, 200, 20);
        add(passwordTextField);

        JButton submitButton = new JButton("create");
        submitButton.setBounds(40, 140, 100, 20);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String email = emailTextField.getText();
                String password = passwordTextField.getText();
                boolean result = false;

                if (!(name.trim().isEmpty() || email.trim().isEmpty() || password.trim().isEmpty())) {
                    AccountRepository repository = new AccountRepository(name, email, password);
                    result = repository.createNewAccount();
                }

                if (result) {
                } else {
                }

                UITools tools = new UITools();
                tools.clearTextFields(nameTextField, emailTextField, passwordTextField);
            }
        });
        add(submitButton);

        JButton resetButton = new JButton("clear");
        resetButton.setBounds(200, 140, 100, 20);

        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UITools tools = new UITools();
                tools.clearTextFields(nameTextField, emailTextField, passwordTextField);
            }
        });
        add(resetButton);

        setVisible(true);
    }
}
