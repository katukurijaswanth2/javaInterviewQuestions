
//q1.Reverse a String without using StringBuilder

public class reverseString {
    String original;
    public String revString(String s) {
        String str = "";
        original = s;
        for (int tem = s.length() - 1; tem >= 0; tem--) {
            str = str + s.charAt(tem);
        }
        return str;
    }
    public static void main(String[] args) {
        reverseString sobj = new reverseString();
        String result = sobj.revString("abc");
        System.out.println("the original value is " + sobj.original);
        System.out.println("the reversed value is " + result);

    }
}
