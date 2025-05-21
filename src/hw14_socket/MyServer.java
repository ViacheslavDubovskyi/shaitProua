package hw14_socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyServer {
    public static void main(String[] args) {

        int port = 8081;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started on port: " + port);

            try (Socket clientSocket = serverSocket.accept()) {
                System.out.println("Client connected");

                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                out.println("Hello from server!");
                String clientGreeting = in.readLine();
                System.out.println("Received from client: " + clientGreeting);

                if (clientGreeting.matches(".*[ёЁъЪыЫэЭ].*")) {
                    out.println("Що таке паляниця?");
                    String clientAnswer = in.readLine();
                    System.out.println("Received from client: " + clientAnswer);

                    if (clientAnswer.equalsIgnoreCase("український хліб")) {
                        LocalDateTime currentDateTime = LocalDateTime.now();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                        out.println("Current Date and Time: " + currentDateTime.format(formatter));
                        out.println("GoodBye!");
                    } else {
                        out.println("Wrong answer, russkiy spion!");
                        out.println("Server closed!");
                        clientSocket.close();
                    }
                } else {
                    out.println("Okay, you can write to server");
                }

                String message;
                while (!(message = in.readLine()).equals("exit")) {
                    System.out.println(message);
                }
            }

        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}