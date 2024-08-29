import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Student> arrayList = new ArrayList<Student>();

        Student student = new Student(24,"Gregory");
        Student student2 = new Student(27, "Larry");
        Student student3 = new Student(29, "Jimmy");
        Student student4 = new Student(28, "Ivan");
        Student student5 = new Student(27, "Juarez");
        arrayList.add(student);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);


        for (Student x : arrayList) {
            System.out.println(x);
        }

        LinkedList<Student> linkedList = new LinkedList<Student>();

        linkedList.add(student3);
        linkedList.add(student4);
        linkedList.add(student5);
        linkedList.add(student);
        linkedList.add(student2);
        linkedList.addLast(student3);
        linkedList.removeFirst();

        System.out.println(linkedList);

        Stack<Integer> stack = new Stack<>();
        stack.push(23);
        stack.push(31);
        stack.pop();
        stack.push(12);

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        Vector<String> vector = new Vector<String>();
        vector.add("ABBA");
        vector.add("EBEDEBE");
        vector.add("ELELLELE");
        vector.add("UBUSBSUS");
        vector.add("OLELELELE");


        System.out.println("Vector: " + vector);

        System.out.println("The Object that is replaced is: "
                + vector.set(0, "ARABABA"));

        System.out.println("The Object that is replaced is: "
                + vector.set(3, "PEPSI"));

        System.out.println("The new Vector is:" + vector);


        Deque<Integer> deque = new ArrayDeque<Integer>(5);

        deque.add(5);
        deque.add(6);
        deque.add(7);
        deque.add(8);
        deque.add(9);
        deque.addFirst(33);
        deque.addLast(99);

        for (Integer e : deque) {
            System.out.println("Element : " + e);
        }

        System.out.println("Using clear() ");
        deque.clear();

        deque.add(9);

        System.out.println("After clearing queue:");

        for (Integer e : deque) {
            System.out.println("Element : " + e);
        }



        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.insert(90); // 90
        customLinkedList.insert(54); // 54
        customLinkedList.insertAtStart(24); // 24 54 90
        customLinkedList.insertAt(1, 984); // 24 984 54 90
        customLinkedList.deleteAt(3); // 24 984 90
        System.out.println("Custom linked list print:");
        customLinkedList.show();
    }
}