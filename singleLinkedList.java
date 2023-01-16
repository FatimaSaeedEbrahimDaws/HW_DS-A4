public class singleLinkedList <E>{
  protected   Node<E>head=null;
 protected Node<E>tail=null;
    private  int size=0;

    public singleLinkedList() {
    }
    public  boolean isEmpty(){
        return  size==0;
    }
    public void  re(){
        Node<E>h=head;
        head=tail;
        tail=h;
    }
    public  int size()
    {return size;}
    public E first()
    {
       if( isEmpty())return  null;
       return  head.getElement();
    }
    public E last()
    {
        if( isEmpty())return  null;
        return  tail.element;
    }
    public void addFirst(E newElment)
    {
      head=new Node<E>(newElment,head);
        if (isEmpty() )
        tail=head;
        size++;

    }
    public void addLast(E newElment)
    {
        Node<E>newest=new Node<E>(newElment,null);
        if (isEmpty() )head=newest;
        else    tail.setNext(newest);

        tail=newest;
        size++;

    }
    public E removeFirst(){
        if(isEmpty())return  null;
        E del=head.element;
        head=head.next;
        size--;
        if (size==0)
            tail=null;
            return  del;


    }
    public Node<E> getSecondLast(){
        Node<E>i=head;
        while (i.next.next!=null){
            i=i.next;
        }
        return  i;
    }
    public int methodSize(singleLinkedList<E> list){
        Node<E>i=head;
        int s=0;
        while (i!=null){
            s++;
            i=i.next;
        }return  s;
    }
    public singleLinkedList<E>  margin(singleLinkedList<E> L,singleLinkedList<E> M){
     //   L.tail=M.head;
       // L.tail=M.tail;
        while (!M.isEmpty()){
       L.addLast(M.removeFirst());}


        return  L;
    }
    public boolean  equals(singleLinkedList<E> L,singleLinkedList<E> M){
      boolean f=false;
      Node<E>m=M.head;
        Node<E>l=L.head;
        if (L.size()==M.size()){
        while (m!=null&&l!=null){
            if (m.element==l.element)
                f=true;
            else {
f=false;


            }
            m=m.next;
            l=l.next;
        }
      }



        return  f;
    }
    public void revers(singleLinkedList<E> L){

if (!isEmpty()){
    Node prev=null;
    Node curr=head;
    Node next= null;
    while (curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
}


    }
    public void  rotate(){
        addLast(removeFirst());
    }
    protected static  class Node<E>{
     E element;
     Node<E>next;

     public Node(E element, Node<E> next) {
         this.element = element;
         this.next = next;
     }

     public E getElement() {
         return element;
     }

     public void setElement(E element) {
         this.element = element;
     }

     public Node<E> getNext() {
         return next;
     }

     public void setNext(Node<E> next) {
         this.next = next;
     }
 }

}
