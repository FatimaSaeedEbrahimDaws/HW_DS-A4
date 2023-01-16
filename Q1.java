public class Q1 {
    public static void main(String[] args) {
        singleLinkedList<Integer>L=new singleLinkedList<>();
        singleLinkedList<Integer>M=new singleLinkedList<>();
        singleLinkedList<Integer>K=new singleLinkedList<>();
        L.addFirst(11);
        L.addLast(12);

        M.addFirst(16);
        M.addLast(17);

        K.addFirst(11);
        K.addLast(12);

        if (L.equals(L,M))
        System.out.println("list M and list L equals" );
else
            System.out.println("list M and list L not equals" );

        if (K.equals(L,K))
            System.out.println("list M and list L equals" );
else
        System.out.println("list K and list L not equals" );
}
}
