public class LinkedList {
    Node head;

    public class Node
    {
        int data;
        Node next;
    }

    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head==null)
        {
            head = node;
        }
        else
        {
            Node n = head;
            while(n.next!=null)
            {
                n = n.next;
            }
            n.next =  node;
        }

    }

    void display()
    {
        Node node = head;

        while(node.next!=null)
        {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }



    public static void main(String[] agrs)
    {
        LinkedList list=new LinkedList();
        list.insert(5);
        list.insert(15);
        list.insert(8);
        list.insert(25);
        list.insert(4);
        list.display();

    }

}
