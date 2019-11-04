package Q3;
import java.io.*;

public class LinesOfFiles {
    public static void linesOfFiles(String fileNanme){
        BufferedReader input;
        int count;
        try {
            input = new BufferedReader(new FileReader(fileNanme));
        }catch (Exception e){
            System.out.println("Can't open the file");
            return;
        }
        count = 0;

        try {
            String line = input.readLine();
            while (line != null){
                count++;
                line = input.readLine();
            }
        }catch(Exception e){
            System.out.println("Can't read from the file");
            return;
        }
        System.out.println(count + "lines");
    }

    public static void main(String[] args) {
        for( int i =0; i < args.length; i++){
            System.out.print(args[i] + ": ");
            linesOfFiles(args[i]);
        }
    }
}
