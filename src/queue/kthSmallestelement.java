package queue;

import java.util.Collections;
import java.util.Scanner;
import java.util.*;


public class kthSmallestelement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={22,33,1,4,5,5,3,388,8};
        System.out.println("Enter the number");
        int k=sc.nextInt();
        PriorityQueue<Integer> max= new PriorityQueue<>(Collections.reverseOrder());
        for(Integer i:arr){
            max.offer(i);
            if(max.size()>k){
                max.poll();
            }
//            System.out.print(max.peek());
        }
        System.out.println(max);
        System.out.println(max.peek());


    }
}
