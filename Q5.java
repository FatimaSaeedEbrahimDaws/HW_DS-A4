public class Q5 {
    public static void main(String[] args) {
        singleLinkedList<Integer>L=new singleLinkedList<>();
        singleLinkedList<Integer>M=new singleLinkedList<>();
        L.addFirst(11);
        L.addLast(12);
        L.addLast(13);
        L.addLast(14);
        L.addLast(15);
        M.addFirst(16);
       M.addLast(17);
        M.addLast(18);
        M.addLast(19);
        M.addLast(20);
        L=L.margin(L,M);
        while (!L.isEmpty()){
            System.out.print("  "+L.removeFirst()+" ");
        }

    }
}
