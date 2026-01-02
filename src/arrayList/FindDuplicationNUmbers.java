package arrayList;
import java.util.*;
import java.util.ArrayList;

public class FindDuplicationNUmbers {
    public static void main(String[] args) {
        Integer arr[]= {1,33,2,33,1,5,4,44,44,66,717,66,717};
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
         ArrayList<Integer> duplication=new ArrayList<>();
       HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (Integer num : list) {
            if (!seen.add(num)) {
//                in the above condition we can not add element to the set 
                duplicates.add(num);
            }
//            else {
//                System.out.println(num +"is not adding to duplicates");
//            }
        }
         System.out.println("duplications "+duplicates);
     System.out.println(duplicates.toString());



        }
    }

