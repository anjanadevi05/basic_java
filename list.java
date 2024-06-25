import java.util.Scanner;
public class list {
    
    static class node
    {
        String data;
        node next;
        node(String data)
        {
            this.data = data;
            next=null;
        }
    }
    static node head;
    public static list addinitial(String data)
    {
        node newnode=new node(data);
        list newlist=new list();
        newnode.next=head;
        newlist.head=newnode;
        return newlist;
    }
    public static void insert(String data)
     {
        node newNode = new node(data);
        if (head == null) 
        {
            head = newNode;
        } 
        else 
        {
            node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        list l=new list();
        insert("a");
        insert("n");
        insert("j");
        insert("a");
        insert("n");
        insert("a");
        System.out.println("Original list:");
        node temp=head;
        while (temp != null) 
        { 
            System.out.print(temp.data + " ");
            temp = temp.next; 
        } 
        System.out.println("\nEnter intial");
        String s=in.next();
        l=addinitial(s);
        temp=l.head;
        while (temp != null) 
        { 
            System.out.print(temp.data + " ");
            temp = temp.next; 
        } 
    }

}
