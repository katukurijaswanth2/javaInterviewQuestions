package arrayList;

import java.util.ArrayList;


public class duplicatesWithoutHashset {
    public static void main(String[] args) {
//        creating arraylist and adding values to it
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("jaswanth");
        arrayList1.add("katukuri");
        arrayList1.add("JASWANTH");
        arrayList1.add("KATUKURI");
        arrayList1.add("thrisha");
        arrayList1.add("katukuri");

//        creating arraylist and adding values to it.
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("jaswanth");
        arrayList2.add("katukuri");
        arrayList2.add("sanjeeve");
        arrayList2.add("rao");
        arrayList2.add("krishnaveni");
//        printing values from both array list
        System.out.println("arraylist2 elements " + arrayList2);
        System.out.println("arrayslist1 elements " + arrayList1);
//        merging all arraylist elements into new arraylist
        ArrayList<String> arrayList3 = new ArrayList<>(arrayList1);
        arrayList3.addAll(arrayList2);
        System.out.println("arraylist3 elements " + arrayList3);

        ArrayList<String> merged = new ArrayList<>();
        for (String s : arrayList1) {
//      here s store first value by default and checking that value in newly created arraylist " merged ";
            if (!merged.contains(s)) {
                merged.add(s);
            }
        }
        for (String s : arrayList2) {
            if (!merged.contains(s)) {
                merged.add(s);
            }
        }

        System.out.println(merged);

    }
}
