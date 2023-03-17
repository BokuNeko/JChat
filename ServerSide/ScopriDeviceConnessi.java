package ServerSide;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class ScopriDeviceConnessi
{
    private ArrayList<String> deviceRaggiungibili;

    /*
     * Cerca sulla rete dove è connessio il mio pc
     * Altri indirizzi Ip che potrebbero essere interessati a "chattare" con me
     * Salvandoli su una lista.
     */
    /*TODO: Dovendo utilizzare questi indirizzi IP posso verificare se sono pronti a comunicare magari verificando con il socket 
    *se va la connessione
    */
    public ArrayList<String> trovaDeviceSullaRete(String args[])
    {
        ArrayList<String> deviceRaggiungibili = new ArrayList<>();
        int timeout = 100;

        try
        {
            String currentIP = InetAddress.getLocalHost().toString();

            String subnet = getSubnet(currentIP);
            System.out.println("subnet: " + subnet);

            //Quindi il mio indirizzo IP è dato dalla maschera della rete e un numero?
            for(int i = 1; i < 254; i++)
            {
                String host = subnet + i;
                //System.out.println("Checking: " + host);

                if(InetAddress.getByName(host).isReachable(timeout) )
                {
                    //System.out.println(host + " is reachable");
                    deviceRaggiungibili.add(host);
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        //System.out.println(deviceRaggiungibili.size() );
        return deviceRaggiungibili;
    }//end TrovaDeviceSullaRete method

    /*
     * Crea la "maschera" della mia connessione
     * a internet.
     */
    public static String getSubnet(String currentIP)
    {
        int firstSeparator = currentIP.lastIndexOf("/");
        int lastSeparator = currentIP.lastIndexOf(".");

        return currentIP.substring(firstSeparator+1, lastSeparator+1);
    }
}//end ScopriDeviceConnessi class