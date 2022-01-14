import java.util.*;

public class NaryOp {

    static class Node{
        int key;
        List<Node> child = new LinkedList<>();

        Node(int key){
            this.key = key;
        }
    }

    static int nodeChildCountGT1(Node root){
        int count = 0;

        if(root == null)
            return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int currentSize = queue.size();

            while (currentSize > 0){
                Node node = queue.peek();
                queue.remove();
                if(node.child.size() > 1)
                    count++;

                queue.addAll(node.child);

                currentSize--;
            }
        }
        return count;
    }

    static int recursiveNodeChildCountGT1(Node root){
        int count = 0;
        if (root == null)
            return 0;
        else {
            if (root.child.size() > 1)
                count++;

            for (Node child: root.child)
                count += recursiveNodeChildCountGT1(child);
        }
        return count;
    }

    static int nodeCount(Node root)
    {
        int count = 1;
        if (root==null)
            return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int currentSize = queue.size();

            while (currentSize > 0)
            {
                Node node = queue.peek();
                queue.remove();

                assert node != null;
                if(!node.child.isEmpty())
                {
                    count += node.child.size();

                }
                queue.addAll(node.child);

                currentSize--;
            }
        }

        return count;
    }

     static int recursiveNodeCount(Node root)
    {
        int count = 1;
        if (root == null)
            return 0;
        else {
            for (Node child: root.child)
                count += recursiveNodeCount(child);
        }
        return count;
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        (root.child).add(new Node(2));
        (root.child).add(new Node(34));
        (root.child).add(new Node(50));
        (root.child).add(new Node(60));
        (root.child).add(new Node(70));
        (root.child.get(0).child).add(new Node(15));
        (root.child.get(0).child).add(new Node(20));
        (root.child.get(1).child).add(new Node(30));
        (root.child.get(1).child).add(new Node(30));
        (root.child.get(2).child).add(new Node(40));
        (root.child.get(2).child).add(new Node(100));
        (root.child.get(2).child).add(new Node(20));
        (root.child.get(3).child).add(new Node(1000));
        (root.child.get(3).child).add(new Node(1001));
        (root.child.get(0).child.get(0).child).add(new Node(520));
        (root.child.get(0).child.get(0).child).add(new Node(450));
        (root.child.get(0).child.get(1).child).add(new Node(520));
        (root.child.get(0).child.get(1).child).add(new Node(450));
        (root.child.get(0).child.get(1).child.get(0).child).add(new Node(54));
        (root.child.get(0).child.get(1).child.get(0).child).add(new Node(45));


        System.out.println(nodeChildCountGT1(root));
        System.out.println(recursiveNodeChildCountGT1(root));

        System.out.println(nodeCount(root));
        System.out.println(recursiveNodeCount(root));

    }
}