package ServerSide;

import java.io.IOException;
import java.net.*;

public class Server
{
    public static void main(String args[])
    {
        Socket socket;
        try
        {
            ServerSocket serverSocket = new ServerSocket(6000);
            System.out.println(serverSocket.getInetAddress().getHostAddress() );
            System.out.println(serverSocket.getInetAddress().getAddress() );
            //Loop infinito per ascolto connessioni
            while(true)
            {
                socket = serverSocket.accept();
                
                if(socket.isConnected() )
                {
                    System.out.println("Ho ricevuto una richiesta di connessione queste sono le info sulla connessione");
                    System.out.println("LocalPort = " + socket.getLocalPort() );
                    System.out.println("Port = " + socket.getPort() );
                    System.out.println("LocalAddress = " + socket.getLocalAddress());
                }

            }//end while
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }//end main
}//end class