class Node {
    int data ;
    Node next;
    Node(int d)
    {
this.data =d;
this.next=null;
    }
    }
   public class Traversal      {
    public static void main(String[] args) {
    Node first= new Node(10);
    Node second= new Node(20);
    Node third =new Node(30);
    Node fourth =new Node(40);
    //Make connection amongs nodes
    first.next=second;
    second.next=third;
    third.next=fourth;
    //Tracersal 
    Node temp=first; //Starting point of traversal
    while(temp !=null)
    {
System.out.print(temp.data+ " ->");
temp=temp.next;
    }
    System.out.println("null");
    }
    
}
