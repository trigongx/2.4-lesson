import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 5 любых строк");
        a.add(sc.nextLine());
        a.add(sc.nextLine());
        a.add(sc.nextLine());
        a.add(sc.nextLine());
        a.add(sc.nextLine());
        System.out.println(a);
        ArrayList<String> b = new ArrayList<>();
        System.out.println("Введите еще 5 любых строк");
        b.add(sc.nextLine());
        b.add(sc.nextLine());
        b.add(sc.nextLine());
        b.add(sc.nextLine());
        b.add(sc.nextLine());
        System.out.println(b);
        Collections.reverse(b);
        ArrayList<String> c = new ArrayList<>();
        Integer size = Math.min(a.size(),b.size());
        for (int i = 0; i < size; i++) {
            c.add(a.get(i));
            c.add(b.get(i));
        }
        System.out.println(c);
        c.sort(Comparator.comparingInt(String::length));
        System.out.println(c);
    }
}
