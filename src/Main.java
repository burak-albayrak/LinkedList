public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        DLL dlist = new DLL();
        CLL clist = new CLL();

        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);

        list.insertLast(98);
        list.insertLast(99);

        list.insert(55, 3);
        list.insert(44, 4);

        list.deleteFirst();
        list.deleteLast();
        list.delete(3);

        System.out.println(list.find(55));

        list.display();

        dlist.insertFirst(3);
        dlist.insertFirst(4);
        dlist.insertFirst(5);
        dlist.insertFirst(6);

        dlist.insertLast(98);
        dlist.insertLast(99);

        dlist.insert(6, 55);

        dlist.display();

        clist.insert(3);
        clist.insert(4);
        clist.insert(5);
        clist.insert(6);

        clist.delete(6);

        clist.display();
    }
}