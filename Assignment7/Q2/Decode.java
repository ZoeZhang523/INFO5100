package Q2;
import java.util.Stack;
import java.io.*;

public class Decode{
    public static String decodeString(String s) {
        if (s.length() == 0 || s == null) {
            return s;
        }
        Stack<String> strs = new Stack<String>();
        Stack<Integer> nums = new Stack<Integer>();
        StringBuilder decode = new StringBuilder();
        int index = 0;
        while (index < s.length()){
            if(Character.isDigit(s.charAt(index))){
                int num = 0;
                while (Character.isDigit(s.charAt(index))){
                    num = num * 10 +(s.charAt(index) - '0');
                    index++;
                }
                nums.push(num);
            } else if (s.charAt(index) == '['){
                strs.push(decode.toString());
                decode = new StringBuilder("");
                index++;
            } else if (s.charAt(index) == ']'){
                StringBuilder sb = new StringBuilder(strs.pop());
                int rt = nums.pop();
                for(int  i = 0; i < rt; i++){
                    sb.append(decode);
                }
                decode = sb;
                index++;
            }else {
                decode.append(s.charAt(index++));
            }
        }
        return decode.toString();
    }

    public static void main(String[] args){
        try {
            InputStream fi = new FileInputStream("src/Q2/encoded.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fi));
            String si = br.readLine();
            br.close();
            fi.close();
            String rsi = decodeString(si);

            File fo = new File("src/Q2/decoded.txt");
            FileWriter fw = new FileWriter(fo);
            BufferedWriter br2 = new BufferedWriter(fw);
            br2.write(rsi);
            br2.close();
            //fo.close();

            System.out.println("The sentence after decoding: " + rsi);
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
