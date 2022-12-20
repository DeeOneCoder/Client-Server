import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try(Socket socket = new Socket("127.0.0.1", 5000)){
            socket.setSoTimeout(5000);

            BufferedReader echo = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);
            String echoString;
            String response;

            do{
                System.out.println("Enter String to be echoed: ");
                echoString = scanner.nextLine();

                writer.println(echoString);
                if(!echoString.equals("exit")){
                    response = echo.readLine();
                    System.out.println(response);
                }
            } while (!echoString.equals("exit"));

        } catch (IOException e){
            System.out.println("Client couldn't connect " + e.getMessage());
        }
    }
}