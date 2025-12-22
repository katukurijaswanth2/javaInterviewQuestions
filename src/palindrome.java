
// to check the string is palindrome?

// A palindrome is a word, phrase, number, or other
// sequence of characters that reads the same backward as forward,
// such as "madam" or "racecar"
public class palindrome {
    String original;
    String reverse = "";

    public boolean checkPalindrome(String str) {
        original = str;
        for (int j = str.length() - 1; j >= 0; j--) {
            reverse = reverse + str.charAt(j);
        }
        return original.equals(reverse);

    }

    public static void main(String[] args) {
        palindrome p = new palindrome();
        boolean end=p.checkPalindrome("java");
        System.out.println("the original string "+p.original);
        System.out.println("the reverse string "+p.reverse);
        if(end==true){
            System.out.println("the "+p.original+" is palindrome");
        }
        else {
            System.out.println("the "+p.original+" is not palindrome");
        }
//        System.out.println("the result is "+end);
    }
}
