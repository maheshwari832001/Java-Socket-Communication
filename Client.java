import java.net.Socket;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Client {
    public static void main(String[] args) throws Exception
    {
        String ip = "localhost";
        int port = 9999; // 0-1023 to 65535
        Socket s = new Socket(ip,port);

        String str = "mahe Babu";

        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
        PrintWriter out = new PrintWriter(os);
        out.print(str);
        os.flush();

        s.close();
    }
}
