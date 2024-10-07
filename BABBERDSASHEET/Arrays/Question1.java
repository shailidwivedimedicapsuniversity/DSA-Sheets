package Arrays;
public class Question1{
    public static String reverseWord(String str)
    {
    // Reverse the string str
    // StringBuilder sb = new StringBuilder();
    // for(int i=str.length()-1; i>=0; i--){
    //     sb.append(str.charAt(i));
    // }
    // return sb.toString();
    int first = 0;
    int last = str.length()-1;
    // can not directly swap because strings are immutable in java
    StringBuilder sb = new StringBuilder(str);
    while(first<last){
        char temp = sb.charAt(first);
        sb.setCharAt(first, sb.charAt(last));
        sb.setCharAt(last, temp);
        first++;
        last--;
    }
    return sb.toString();
    // int first = 0;
    // int last = str.length() - 1;
    // StringBuilder sb = new StringBuilder(str);

    // while (first < last) {
    // char temp = sb.charAt(first);
    // sb.setCharAt(first, sb.charAt(last));
    // sb.setCharAt(last, temp);
    // first++;
    // last--;
    // }

    // return sb.toString();

    }
    public static void main(String[] args) {
        System.out.println(reverseWord("shaili"));
    }
}