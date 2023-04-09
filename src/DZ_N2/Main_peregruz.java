package DZ_N2;

public class Main_peregruz {
    public static void main(String[] args) {
        Peregruz per = new Peregruz();
        per.strArr= new String[]{"Hello","teather!"};
        per.numArr = new int[]{1, 3, 5, 6, 8};
        per.peregruz();
        per.peregruz("Слава Украине!");
        per.peregruz(per.strArr);
        per.peregruz(per.numArr);
        per.peregruz("QA",24);
    }

}