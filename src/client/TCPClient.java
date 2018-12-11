package client;

import java.io.*;
import java.net.Socket;
import java.util.Properties;

/**
 * @author Michał Kamiński
 */
public class TCPClient {

    private int socket = 6789;

    public TCPClient() {
        Properties properties = new Properties();
        try (FileInputStream inputStream = new FileInputStream(".properties")){
            properties.load(inputStream);
            socket = Integer.parseInt(properties.getProperty("Socket"));
        }catch (IOException exception){}
    }

    public void runClient() throws Exception {

        String modifiedSentence;
        Socket clientSocket = new Socket("localhost", 6789);
        PrintWriter pw = new PrintWriter(clientSocket.getOutputStream(), true);
        pw.println("HELP");
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        modifiedSentence = inFromServer.readLine();
        System.out.println("FROM SERVER: " + modifiedSentence);
        clientSocket.close();
        shutDownClient();
    }

    private void shutDownClient(){
        Properties properties = new Properties();
        properties.setProperty("Socket",String.valueOf(socket));
        try (FileOutputStream outputStream = new FileOutputStream(".properties")){
            properties.store(outputStream,"--Config--");
        }catch (IOException exception){}
    }
}
