
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayVeList {

    public static void main(String[] args) {

        //Kod Blogu calistirilirsa sonuc ne olur diye bir soru
        System.out.println("Programa Hosgeldinizz");

                int[] array = {6,9,8};
                List<Integer> list = new ArrayList<>();
                list.add(array[0]);
                list.add(array[2]);
                list.set(1, array[1]);
                list.remove(0);
                System.out.println(list);
  System.out.println("Yeni Satir Eklendi);


            }
        }
        /*
        A. [8]
        B. [9]
        C. [Ljava.lang.String;@160bc7c0 turu bir sonuc
        D. Kod calistirilirsa exception olusur.
        E. Kod calismaz.
        */

