/*
 Given a root node, find out if this tree is a Binary Search Tree.
*/
 public static ArrayList<Integer> list = new ArrayList<Integer>();
    public boolean duplicates = false;
    boolean checkBST(Node root) {
      //go inOrder
      makeList(root);
      for(int i=0;i<(list.size())-1;i++)
      {
         if(list.get(i)<list.get(i+1))
         {
             continue;
         }   
         else
             return false;
      }
      return true && !duplicates;
    }
   
    void makeList(Node root) {
      if(root !=  null) {  
         makeList(root.left);  
         if(!list.contains(root.data))
             list.add(root.data);
         else
         {
             duplicates = true;
         }
         makeList(root.right); 
      }
    }
    
