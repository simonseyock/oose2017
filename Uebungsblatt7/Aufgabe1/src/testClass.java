
public class testClass {
    public static void main(String[] args) {
        DoubleList liste = new DoubleList();

        liste.add(5.4);
        liste.add(3.2);
        liste.add(8.2);

        System.out.println(liste.toString());

        liste.insertFirst(9.6);
        liste.insertFirst(1.2);

        System.out.println(liste.toString());

        liste.remove(2);

        System.out.println(liste.toString());

        liste.remove(0);

        System.out.println(liste.toString());

        liste.remove(7);

        System.out.println(liste.toString());

        System.out.println(liste.get(1));
    }
}
