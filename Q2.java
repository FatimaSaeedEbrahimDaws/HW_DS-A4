import org.w3c.dom.Node;

public class Q2 {
    public static void main(String[] args) {
        singleLinkedList<Integer>list=new singleLinkedList<>();

        list.addFirst(11);
        list.addLast(12);
        list.addLast(13);
        list.addLast(14);
        list.addLast(15);
  singleLinkedList.Node<Integer>i= list.getSecondLast();
        System.out.println(i.getElement());
        System.out.println(i);
    }
}