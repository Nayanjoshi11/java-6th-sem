import java.io.*;
import java.net.Socket;

public class Client
{
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1",12345);

            //asking user input with buffer
            BufferedReader userInputBuffer  = new BufferedReader(new InputStreamReader(System.in));

            //taking the input from socket
            BufferedReader socketInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            //to send a message i need a pen
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);

            String sendingMessage, receivingMessage;

            while(true){
                receivingMessage = socketInput.readLine();
                System.out.println("Message from Client: "+ receivingMessage);
                sendingMessage = userInputBuffer.readLine();
                //print writer
                printWriter.println(sendingMessage);

                printWriter.flush();

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
