

import java.util.Scanner;
 class TreeNode{

     public int data;
     public TreeNode left;
     public TreeNode right;

     TreeNode(int data){
         this.data = data;
         this.left = null;
         this.right = null;
     }

     public void createBinaryTree(TreeNode root , Scanner sc){

           int data;
           System.out.println("Enter the data: ");
           data = sc.nextInt();

           if(data == -1){
            return;
           }

           root = new TreeNode(data);

           System.out.println("Enter the left child of data: "+ data);
           createBinaryTree(root.left, sc);


          System.out.println("Enter the right child of data: "+ data);
          createBinaryTree(root.right, sc);

     }


}


public class Tree {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        TreeNode root = null;
        root.createBinaryTree(root , sc);


    }
}
