import java.net.Socket;
import java.util.Scanner;

public class Client
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ciao questo è il programma scritto da Edoardo per utilizzare una chat");
        System.out.println("Vuoi fare una prova di connessione socket?")

        String sceltaUtente = scanner.nextLine();
        if(sceltaUtente.equals("y") )
        {
            System.out.println("Hai scelto si");
            
            Socket socket = new Socket("localHost", 6000);
        }//end if
        else if(sceltaUtente.equals("n") )
        {
            System.out.println("Hai scelto no");
        }

    }//end main
}//end Client class