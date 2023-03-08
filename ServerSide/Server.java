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
            //Loop infinito per ascolto connessioni
            while(true)
            {
                socket = serverSocket.accept();
            }//end while
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }//end main
}//end class