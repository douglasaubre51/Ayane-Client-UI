package com.ayane.repositories;

import java.net.URL;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;

public class AccountRepository {
    String name;
    String email;
    String password;
    String siteUrl = "https://ayane-web-api.onrender.com/addUser";
    String payload = "{\"name\":\"%s\",\"email\":\"%s\",\"password\":\"%s\"}";

    public AccountRepository(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public boolean createNewAccount() {
        try {
            System.out.println("connecting to ayane!");

            URL url = new URL(siteUrl);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Type", "application/json");

            try (DataOutputStream stream = new DataOutputStream(connection.getOutputStream())) {
                System.out.println("connected! sending payload");
                String.format(payload, name, email, password);
                stream.writeBytes(payload);
                stream.flush();
            }

            if (connection.getResponseCode() == HttpURLConnection.HTTP_CREATED) {
                System.out.println("account successfully created!");
            }

            else {
                System.out.println(connection.getResponseCode() + " - error:account was not created!");
                connection.disconnect();
                return false;
            }

            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
