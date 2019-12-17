
public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(5);
        list.addLast(10);
        list.addLast(15);
        list.addFirst(2);
        list.addFirst(1);
        list.removeFirst();
        list.removeLast();
        System.out.println(list.indexOf(10));
        System.out.println(list.contains(35));

    }
}