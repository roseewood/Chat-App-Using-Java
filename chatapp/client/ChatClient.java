package client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import common.Constants;

public class ChatClient {

    public static void main(String[] args) {

        try {

            Socket socket = new Socket(Constants.SERVER, Constants.PORT);

            System.out.println("Connected to chat server");

            BufferedReader serverInput =
                    new BufferedReader(new InputStreamReader(socket.getInputStream()));

            PrintWriter out =
                    new PrintWriter(socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);

            Thread listener = new Thread(new MessageListener(serverInput));
            listener.start();

            while (true) {

                String message = scanner.nextLine();

                out.println(message);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}