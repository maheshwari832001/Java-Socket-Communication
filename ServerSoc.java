import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSoc {
    public static void main(String[] args) throws Exception {
        System.out.println("Server is started");
        ServerSocket ss = new ServerSocket(9999);

        System.out.println("Server is waiting for client request");
        Socket s = ss.accept();

        System.out.println("Client connected");

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = br.readLine();

        System.out.println("Client data " + str);

        //from server to client
        String respond = str.substring(0, 6);
        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
        PrintWriter out = new PrintWriter(os);
        out.print(respond);
        out.flush();
        System.out.println("S: data sent from server to client");

        s.close();
        ss.close();
    }
}
