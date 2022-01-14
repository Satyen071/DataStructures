//import java.util.* ;
//
//interface Node {
//
//    List<Node> getChildren();
//
//}
//
//class Solution {
//
//    public int count(Node node) {
//
//        int s = 0;
//
//        if(node == null){ return 0 ; }
//
//        Queue<Node> que = new LinkedList<Node>() ;
//        que.add(node);
//        while(!que.isEmpty()){
//            int n = que.size();
//            while(n>0){
//                Node x = que.peek();
//                que.remove();
//                if(x.getChildren().size() > 1){
//                    s++ ;
//                }
//                for(int k=0; k<x.getChildren().size() ; k ++ ){
//                    que.add(x.getChildren().get(k));
//                }
//                n--;
//            }
//        }
//        return s ;
//    }
//}