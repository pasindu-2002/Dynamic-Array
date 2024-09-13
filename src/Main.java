public class Main {
    public static void main(String[] args)
    {
        DArray d1=new DArray();
        d1.insert(56);
        d1.insert(78);
        d1.insert(12);
        d1.insert(89);
        d1.insert(34);
        d1.insert(11);
        d1.insert(67);
        d1.insert(32);
        d1.insert(89);
        d1.print();
        d1.remove();
        d1.remove();
        d1.remove();
        d1.remove();
        System.out.println();
        System.out.println("\nafter removing..\n");
        d1.print();
    }
}