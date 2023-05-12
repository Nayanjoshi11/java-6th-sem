import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        System.out.println("Server is open");

        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            Socket socket=serverSocket.accept();
            System.out.println("Client is connected");


            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter  = new PrintWriter(outputStream,true);
            System.out.println("write a message here");

            Scanner input = new Scanner(System.in);

            while(true) {
                String userInput = input.nextLine();
                printWriter.println(userInput);

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}