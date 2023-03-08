import java.net.*;

public class Server
{
    public static void main(String args[])
    {
        Socket socket;
        ServerSocket serverSocket = new ServerSocket(6000);
        //Loop infinito per ascolto connessioni
        while(true)
        {
            socket = serverSocket.accept();
        }//end while
    }//end main
}//end class