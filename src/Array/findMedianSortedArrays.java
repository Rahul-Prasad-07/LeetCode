package Array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class findMedianSortedArrays {
    public static void main(String[] args) {
        int num1 [] = {1,3};
        int num2 [] = {2};

        FindMidArray(num1,num2);
    }
    public static double FindMidArray(int [] num1, int [] num2){
        double res = 0.0;
        List<Integer> list = new ArrayList<>();
        for (int element : num1) {list.add(element);}
        for (int element : num2) {list.add(element);}

        list.sort(Comparator.naturalOrder());
        int mid = list.size()/2;

        if(list.size()%2 == 0){
            res = (double) (list.get(mid) + list.get(mid-1))/2;
            System.out.println(res);
        }else {
            res = (double) list.get(mid);
            System.out.println(res);
        }
        return  res;

        }
}
