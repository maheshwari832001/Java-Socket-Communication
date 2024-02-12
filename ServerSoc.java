import java.net.Socket;
import java.net.ServerSocket;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.BufferedReader;

public class ServerSoc {
    public static void main(String[] args) throws Exception
    {
        System.out.println("Server is started");
        ServerSocket ss = new ServerSocket(9999);
          
        System.out.println("Server is waiting for client request");
        Socket s = ss.accept();

        System.out.println("Client connected");

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = br.readLine();

        System.out.println("Client data " + str);

        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
        PrintWriter out = new PrintWriter(os);
        out.print(str);
        os.flush();        

    }
}
