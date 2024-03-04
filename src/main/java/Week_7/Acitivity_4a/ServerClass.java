package Week_7.Acitivity_4a;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerClass {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(12345);

        System.out.println("Server waiting for client...");

        Socket clientSocekt = serverSocket.accept();

        System.out.println("client connected");



//        BufferedReader input = new BufferedReader(new InputStreamReader(clientSocekt.getInputStream()));
//
//        PrintWriter output = new PrintWriter(clientSocekt.getOutputStream(), true);

//        String message = input.readLine();
//        System.out.println("Client :"+ message);
//
//        output.println("Hello from server");
//
//        input.close();
//        output.close();
//        clientSocekt.close();
//        serverSocket.close();

        DataInputStream input = new DataInputStream(clientSocekt.getInputStream());
        DataOutputStream output = new DataOutputStream(clientSocekt.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String message1 = "";
        String  message2 = "";

        while(!message1.equalsIgnoreCase("stop")){
            message1 = input.readUTF();
            System.out.println("Client says :"+ message1);

            message2 =br.readLine();
            output.writeUTF(message2);
        }

        input.close();
        serverSocket.close();
        clientSocekt.close();
    }
}
