import java.sql.SQLOutput;

public class day1 {
    public String addStrings(String num1, String num2) {
        int n1 =Integer.parseInt(num1);
        System.out.println("i took the value fron the function ' addStrings "+ n1);
        int n2= Integer.parseInt(num2);
        System.out.println("i took the value fron the function ' addStrings "+ n2);
        int total = n1+n2;
//if(true){
//    System.out.println(total);
//}
String result = Integer.toString(total);
return result;
    }
    public static void main(String[] args){
        day1 s= new day1();
        String sum =s.addStrings("11","123");
        System.out.println("the captured value of that function is "+sum);
    }

}
