
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayVeList {

    public static void main(String[] args) {

        //Kod Blogu calistirilirsa sonuc ne olur
        System.out.println("Programa Hosgeldinizz");

                int[] array = {6,9,8};
                List<Integer> list = new ArrayList<>();
                list.add(array[0]);
                list.add(array[2]);
                list.set(1, array[1]);
                list.remove(0);
                System.out.println(list);

        System.out.println("Verilen Arrayin Reversesisini bulma");
        int[] array1 = {1,2,3,4,5,6,7,8,9,0};
        List<Integer>list2=new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            list2.add(array1[i]);

        }
        System.out.println("Array = "+list2);
        Collections.reverse(list2);

        System.out.println("Reverse array ="+list2);



            }
        }
        /*
        A. [8]
        B. [9]
        C. [Ljava.lang.String;@160bc7c0 turu bir sonuc
        D. Kod calistirilirsa exception olusur.
        E. Kod calismaz.
        */

