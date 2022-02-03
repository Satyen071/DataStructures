package com.ds.questions.paypal;


class Node1
{
    int data;
    Node1 next;
    Node1(int d)  { data = d;  next = null; }
}

// Linked List class
class LinkedListLengthNonRecursive
{
    Node1 head;  // head of list

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node1 new_node = new Node1(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }

    /* Returns count of nodes in linked list */
    public int getCount()
    {
        Node1 temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }

    /* Driver program to test above functions. Ideally
       this function should be in a separate user class.
       It is kept here to keep code compact */
    public static void main(String[] args)
    {
        /* Start with the empty list */
        LinkedListLengthNonRecursive llist = new LinkedListLengthNonRecursive();
        llist.push(1);
        llist.push(3);
        llist.push(1);
        llist.push(2);
        llist.push(1);

        System.out.println("Count of nodes is " +
                llist.getCount());
    }
}