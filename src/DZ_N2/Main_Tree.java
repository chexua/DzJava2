package DZ_N2;

public class Main_Tree {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        tree1.getInfo();
        System.out.println("============");
        Tree tree2 = new Tree("Береза");
        tree2.getInfo();
        System.out.println("============");
        Tree tree3 = new Tree("Ёлка", 300);
        tree3.getInfo();
        System.out.println("============");
        Tree tree4 = new Tree(50, 333, "White");
        tree4.getInfo();
    }

}
