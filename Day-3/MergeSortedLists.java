//Program to Merger 2 sorted ArrayLists and output ArrayList also should be sorted again

import java.util.ArrayList;
import java.util.List;

public class MergeSortedLists {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        List<Integer> list2=new ArrayList<>();
        list2.add(40);
        list2.add(50);
        list2.add(60);

        list1.addAll(list2);
        System.out.println(list1);
    }
}
