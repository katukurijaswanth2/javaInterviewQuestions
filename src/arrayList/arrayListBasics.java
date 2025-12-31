package arrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class arrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(0, 6);
        arrayList.add(5, 8);
        arrayList.add(0, 9);
        arrayList.add(0, 6);
        arrayList.add(0, 6);
        arrayList.add(9);
        arrayList.add(9);
        arrayList.add(9);
        System.out.println(arrayList);

        arrayList.removeIf(n -> n == 6);

        System.out.print(arrayList);

        HashSet<Integer> hashSet = new HashSet<>(arrayList);
        System.out.println("after removing duplicates");

        System.out.println(hashSet);
        System.out.println(hashSet.size());
        System.out.println("without using hashset");
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for(Integer integer : arrayList){
            if(!arrayList1.contains(integer)){
                arrayList1.add(integer);
            }
        }
        System.out.println(arrayList1);




    }
}


