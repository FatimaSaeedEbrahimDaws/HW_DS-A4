public class Q6 {

    public static void main(String[] args) {
        singleLinkedList<Integer>list=new singleLinkedList<>();

        list.addFirst(11);
        list.addLast(12);
        list.addLast(13);
        list.addLast(14);
        list.addLast(15);
       list.revers(list);
        while (!list.isEmpty()){
            System.out.print("  "+list.removeFirst()+" ");
        }
    }
}
