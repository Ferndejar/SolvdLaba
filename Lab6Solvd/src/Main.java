public class Main {
    public static void main(String[] args)
    {
        CustomLinkedList customLinkedList = new CustomLinkedList();
        customLinkedList.insert(90); // 90
        customLinkedList.insert(54); // 54
        customLinkedList.insertAtStart(24); // 24 54 90
        customLinkedList.insertAt(1, 984); // 24 984 54 90
        customLinkedList.deleteAt(3); // 24 984 90
        customLinkedList.show();
    }
}