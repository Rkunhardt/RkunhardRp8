package h2;

public class H2_main {
    public static void main(String[] args) {
        SimpleList myList = new SimpleList();
        myList.append(12);
        myList.append(45);
        myList.append(66);
        myList.append(12);
        myList.append(45);
        myList.append(60);

        System.out.println("InsertAfter 45, 4: " + myList.insertAfter(45, 4));
        
        Node n = myList.findFirst(45);
        if(n != null) System.out.println("Gefunden: " + n.value);

        System.out.println("Delete 45: " + myList.delete(45));

        Node current = myList.getFirst();
        while(current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }
}