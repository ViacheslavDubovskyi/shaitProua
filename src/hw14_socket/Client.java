package hw14_socket;

import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 8081;

        try (Socket socket = new Socket(host, port)) {
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    socket.getInputStream(), StandardCharsets.UTF_8));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(
                    socket.getOutputStream(), StandardCharsets.UTF_8), true);

            Scanner scanner = new Scanner(System.in, "UTF-8");

            System.out.println("Server: " + in.readLine());
            System.out.print("Enter greeting:");
            String greeting = scanner.nextLine();
            out.println(greeting);

            String response = in.readLine();
            System.out.println("Server: " + response);

            if (response.contains("паляниця")) {
                System.out.print("Enter answer: ");
                String answer = scanner.nextLine();
                out.println(answer);

                System.out.println("Server: " + in.readLine());
                System.out.println("Server: " + in.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

