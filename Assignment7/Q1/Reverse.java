package Q1;
import java.io.*;

public class Reverse {
    public static void main(String[] args) {
        try {
            InputStream fi = new FileInputStream("src/Q1/input.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fi));
            String si = br.readLine();
            br.close();
            fi.close();
            String rsi = reverse(si);

            File fo = new File("src/Q1/output.txt");
            FileWriter fw = new FileWriter(fo);
            BufferedWriter br2 = new BufferedWriter(fw);
            br2.write(rsi);
            br2.close();

            System.out.println("The sentence after reversing: " + rsi);
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }

    public static String reverse(String s){
        String[] SI = s.split("\\s");
        String SO = "";
        for(int i = SI.length - 1; i >= 0; i--){
            SO = SO + SI[i] + " ";
        }
        return SO;
    }

}
