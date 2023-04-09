package DZ_N2;

public class Peregruz {

    //2) Написать перегруженный метод, который может:
    //  - не принимать никаких значений, тогда он будет выводить на консоль сообщение типа:
    //    "Я пустой".
    //  - Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
    //  - Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения
    //    через пробел.
    //  - Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов
    //    массива.
    //  - Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа:
    //    "Ваше сообщение - "%%%%%%%%", ваше число -  $",
    //    где "%%%%%%%%" и $ ваши введенные строка и число соответственно.

    public String[] strArr;
    public int[] numArr;
    public void peregruz() {
        String string;
        System.out.println("Я пустой");
    }

    public void peregruz(String string) {
        System.out.println(string);
    }

    public void peregruz(String[] strArr) {
        System.out.println(strArr[0]+" "+strArr[1]);
    }

    public void peregruz(int[] numArr) {
        int s = 0;
        for (int i = numArr[0]; i < numArr.length; i++) {
            s += numArr[i];
        }
        System.out.println("Сумма элементов массива = " + s);
    }

    public void peregruz( String string, int number) {
        System.out.println("Ваше сообщение - " + string + " , " + "ваше число - " + number);

    }
}

