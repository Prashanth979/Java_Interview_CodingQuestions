import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeUnsortedLists {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(30);
        list1.add(20);
        list1.add(10);

        List<Integer> list2=new ArrayList<>();
        list2.add(50);
        list2.add(60);
        list2.add(40);

        list1.addAll(list2);

        Collections.sort(list1);
        System.out.println(list1);
    }
}
