import java.net.*;
import java.io.*;

public class server {

	public static void main(String[] args) throws IOException {

	     ServerSocket sockets = new ServerSocket(6800);
	     Socket serSoc = sockets.accept();
	
             System.out.println("Waiting for client on port: " + serSoc.getLocalPort());
	     
             System.out.println("Just connected to: " + serSoc.getRemoteSocketAddress());

             BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       
             OutputStream ostream = serSoc.getOutPutStream();

             PrintWriter writer = new PrintWriter(ostream, true);
	     writer.println("Hello Client!");

             InputStream input = serSoc.getInputStream();

             BufferedReader recvRead = new BufferedReader(new InputStreamReader(input));
             
             String receiveMessage, sendMessage;
             
             While(true)
             {
                if((receiveMessage = recvRead.readLine()) != null)
                {
                  System.out.println("Server connected!");
                  System.out.println(receiveMessage);
                }
  
             sendMessage = reader.readLine();
             writer.println(sendMessage);
             writer.flush();
}
}
}
