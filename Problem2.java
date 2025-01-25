import java.util.ArrayList;
import java.util.Collections;

public class Problem2 {
    public static void main(String[] args) {
        String text1 = "spy family";
        String text2 = "jujutzu";
        System.out.println("Input: text1 = " + text1 + ", text2 = " + text2);
        System.out.println("Output: " + common_Substring(text1, text2));

        String text3 = "gears of war";
        String text4 = "History of warriors";
        System.out.println("Input: text3 = " + text3 + ", text4 = " + text4);
        System.out.println("Output: " + common_Substring(text3, text4));

        String text5 = "spy family";
        String text6 = "jujutsu kaisen";
        System.out.println("Input: text5 = " + text5 + ", text6 = " + text6);
        System.out.println("Output: " + common_Substring(text5, text6));
    }

    public static String common_Substring(String text1, String text2) {
        String result = "";
        int m = text1.length();
        int n = text2.length();
        int maxlength = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int length = 0;
                while(i + length < m && j + length < n && text1.charAt(i+length) == text2.charAt(j+length)){
                    length++;
                }
                if(length > maxlength){
                    maxlength = length;
                    result = text1.substring(i, i+length);
                }
            }
        }
        return result;

    }
}
