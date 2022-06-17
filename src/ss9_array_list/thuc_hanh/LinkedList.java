package ss9_array_list.thuc_hanh;

public class LinkedList {
private Node head;
private int numNodes;

   public LinkedList(Object data) {
      head = new Node(data);
   }

   public   class Node {
   private Node next;
   private  Object data;

      public void setData(Object data) {
         this.data = data;
      }

      public Node(Object data) {
         this.data= data;
      }
      public  void add(int index, Object data){
         Node temp = head;
         Node holder;
         for (int i = 0; i < index -1 && temp.next != null ; i++) {
            temp = temp.next;
         }
         holder = temp.next;
      }
   }

   public static void main(String[] args) {
      LinkedList linkedList = new LinkedList(10);
     ;
   }


}
