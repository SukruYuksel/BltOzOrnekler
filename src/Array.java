import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array {

    public static void main(String[] args) {
        System.out.println("Verilen Arrayin Reversesisini bulma");
        int[] array1 = {1,2,3,4,5,6,7,8,9,0};
        List<Integer>list2=new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            list2.add(array1[i]);

        }
        Collections.reverse(list2);
        System.out.println("Reverse array ="+list2);

    }
}
