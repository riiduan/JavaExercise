

import java.io.DataOutputStream;
        import java.io.IOException;
        import java.io.OutputStream;
        import java.net.ServerSocket;
        import java.net.Socket;

public class SimpleServer {

    public static void main(String args[]) throws IOException {
        //register service on port 1254
        ServerSocket s=new ServerSocket(1254);
        Socket s1=s.accept();//Wait and accept a connection
        //get a communication stream associated with socket
        OutputStream S1Out=s1.getOutputStream();
        DataOutputStream Dos=new DataOutputStream(S1Out);
        //Send a String;
       // Dos.writeUTF("Hi there");
        Dos.writeUTF("i am server taking to you");



        //close  the connection, but not the server socket

        Dos.close();
        S1Out.close();
        s1.close();


    }


}