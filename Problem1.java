public class Problem1 {
    public static void main(String[] args){
        String text1 = "abc";
        String text2 = "abc";
        System.out.println("Input: text1 = " + text1 + ", text2 = " + text2);
        System.out.println("Output: " + common_Subsequence(text1, text2));

        String text3 = "almanacs";
        String text4 = "albatross";
        System.out.println("Input: text3 = " + text3 + ", text4 = " + text4);
        System.out.println("Output: " + common_Subsequence(text3, text4));

        String text5 = "almanac";
        String text6 = "ferris";
        System.out.println("Input: text5 = " + text5 + ", text6 = " + text6);
        System.out.println("Output: " + common_Subsequence(text5, text6));

    }
    public static int common_Subsequence(String text1, String text2){
        String commonString = "";
        if(text1.length() >= text2.length()){
            for(int i = 0; i < text2.length(); i++){
                if(text1.charAt(i) == text2.charAt(i)) {
                    commonString += text2.charAt(i);
                }
            }
        }
        else{
            for(int i = 0; i < text1.length(); i++){
                if(text1.charAt(i) == text2.charAt(i)) {
                    commonString += text1.charAt(i);
                }
            }
        }
        return commonString.length();
    }
}
