package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class duplicatesWithHashset {
    public static void main(String[] args) {

        Integer n;
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        ArrayList<Integer> list = new ArrayList<>(arr.length);

        for (int a : arr) {
            list.add(a);
        }
        System.out.println("array " + list);

        Integer[] arr1 ={1,2,3,4,5,6,7,1,2,3,4,5,100,6,7,1,2,3,4,5,6,7,1};

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr1));
        System.out.println("hh"+list1);
        HashSet<Integer> set = new HashSet<>(list1);
        System.out.println("hh"+set);
    }
}

//
//        ArrayList<String> arrayList1 = new ArrayList<String>();
//        arrayList1.add("a");
//        arrayList1.add("b");
//        arrayList1.add("c");
//        arrayList1.add("d");
//        arrayList1.add("a");
//        arrayList1.add("a");
//        arrayList1.add("b");
//        arrayList1.add("c");
//        arrayList1.add("d");
//        arrayList1.add("a");
//        arrayList1.add("a");
//        arrayList1.add("b");
//        arrayList1.add("c");
//        arrayList1.add("d");
//        arrayList1.add("a");
//        System.out.println(arrayList1);
//        ArrayList<String> dup = new ArrayList<>();
//
//        System.out.println("after removing the duplicates with the help of hashset");
//        for (String s : arrayList1) {
//            if (!dup.contains(s))
//                dup.add(s);
//        }
//        System.out.println(dup);
//
//    }
//}
