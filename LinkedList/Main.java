class Node{     // Creation of Node class 
    int data ;
    Node next;
    Node( int d)  //Creation of Node Constructor
    {
 this.data =d;
this.next =null;
   }
}

public class Main{  //Create Main Class
    public static void main(String[]args)
    {
//node creations
Node first=new Node(10);
Node second= new Node(20);
Node third =new Node(30);
Node fourth=new Node(40);

 //make  connection
first.next=second;
second.next=third;
third.next=fourth;

System.out.println(first.data);
System.out.println(second.data);
System.out.println(third.data);
System.out.println(fourth.data);
System.out.println(fourth.next);

    } 
}