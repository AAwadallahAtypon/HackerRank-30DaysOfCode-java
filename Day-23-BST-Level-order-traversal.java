static void levelOrder(Node root){
      Queue<Node> levelOrderQueue = new LinkedList<Node>();
      levelOrderQueue.add(root);
      while(levelOrderQueue.peek() != null)
      {
        Node n = levelOrderQueue.remove();
        System.out.print(String.valueOf(n.data)+" ");
          if(n.left!=null)
              levelOrderQueue.add(n.left);
          if(n.right!=null)
              levelOrderQueue.add(n.right);
      }
}
