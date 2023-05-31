import java.io.IOException;
import java.util.Scanner;

public class Ping {
    public String ping(String ip, Integer bytes) {
        String resposta = "";
        String comando = "ping " + ip + " -l " + bytes + " -t";
        try {
            Scanner sc = new Scanner(Runtime.getRuntime().exec(comando).getInputStream());
            while (sc.hasNextLine()) {
                resposta += sc.nextLine() + "\n";
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return resposta;
    }
}