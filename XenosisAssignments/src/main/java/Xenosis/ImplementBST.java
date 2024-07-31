package Xenosis;

public class ImplementBST {
  
	  static class Node{
		   int data;
		   Node left;
		   Node right;
		   
		   Node(int data){
			    this.data=data;
		   }
		   
	  }
	  
	  public static Node insert(Node root,int val) {
		   if(root==null) {
			    return root=new Node(val);
		   }
		   if(root.data>val) {
			    root.left=insert(root.left,val);
		   }
		   else {
			    root.right=insert(root.right,val);
		   }
		   return root;
	  }
	  // INORDER 
	  public static void inorder(Node root) {
		   if(root==null) {
			    return;
		   }
		   inorder(root.left);
		   System.out.print(root.data+" ");
		   inorder(root.right);
	  }
	  // PREORDER 
	  public static void preorder(Node root) {
		   if(root==null) {
			    return;
		   }
		   System.out.print(root.data+" ");
		   inorder(root.left);
		   inorder(root.right);
	  }
	  // POSTORDER 
	  public static void postorder(Node root) {
		   if(root==null) {
			    return;
		   }
		   inorder(root.left);
		   inorder(root.right);
		   System.out.print(root.data+" ");
	  }
	  
	  // SEARCH IN BINARY SEARCH
	  public static boolean search(Node root,int key) {
		   if(root==null) {
			    return false;
		   }
		   if(root.data==key) {
			    return true;
		   }
		   if(root.data>key) {
			   return search(root.left,key);
		   }else {
			    return search(root.right,key);
		   }
	  }
	  // delete a node'
	  public static Node delete(Node root,int val) {
	   if(root.data<val) {
		    root.right=delete(root.right,val);
	    }
	   else if(root.data>val) {
		    root.left=delete(root.left,val);
	   }
	   else {
		    
		     // case 1
		     if(root.left ==null && root.right==null) {
		    	  return null;
		     }
		     // case 2 single child
		     if(root.left==null) {
		    	  return root.right;
		     }
		     else if(root.right==null) {
		    	  return root.right;
		     }
		     // case 3
		     
		     Node Is=findInorderSuccessor(root.right);
		     root.data=Is.data;
		     delete(root.right,Is.data);
		  
          return delete(root.right,Is.data);

	   }
	   return root;
	 }
	  public static Node findInorderSuccessor(Node root) {
		   while(root.left!=null) {
			    root=root.left;
		   }
		  return root;
	  }
	  public static void main(String args[]) {
		   int nodes[]= {5,1,3,4,2,7};
		   Node root=null;
		   
		    for(int i=0;i<nodes.length;i++) {
		    	 root=insert(root,nodes[i]);
		    }
		    inorder(root);
		    System.out.println();
		    
		    if(search(root,1)) {
		    	 System.out.print("found");
		    }
		    else {
		    	 System.out.println("Not found");
		    }
	  }
}
