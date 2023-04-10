package DZ_N2;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ArrMetod {
     // 1) Написать метод, принимающий в качестве параметра массив целых чисел. И выводит на экран все четные числа списком,
    //   а также нечетные числа списком.
    public static int[] even(int[] raw) {
        return IntStream.of(raw).filter(x->x%2==0).toArray();
    }
    public static int[] odd(int[] raw) {
        return IntStream.of(raw).filter(x->x%2!=0).toArray();
    }

    public static void getev () {
        int[] arr = new Random().ints(20, 1, 100).toArray();
        System.out.println("принятый массмв: " + Arrays.toString(arr));
        System.out.println("все чётные числа: " + Arrays.toString(even(arr)));
        System.out.println("все НЕчётные числа: " + Arrays.toString(odd(arr)));

    }

   }
