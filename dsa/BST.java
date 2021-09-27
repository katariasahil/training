package dsa;

public class BST {
    public static void main(String[] args)
    {
    	BST b = new BST();
    	b.insert(5);
    	b.insert(4);
    	b.insert(9);
    	b.insert(1);
    	b.insert(7);
    	b.insert(2);
    	b.insert(8);
    	
    }
	Node root;
    public BST()
    {
        this.root=null;
    }
class Node{
    int value;
    Node left,right;
    public Node(int value)
    {
        this.value=value;
        this.left=null;
        this.right=null;
    }
}
public void insert(int data)
{
    if(this.root==null)
    {
        //System.out.println(data);
        this.root = new Node(data);
    }
    else 
    add(data,root);
    
}

public void add(int data,Node curr)
{
    
    if(data<curr.value)
    {
        if(curr.left!=null)
            add(data,curr.left);
        else
            curr.left=new Node(data);
        
                //System.out.println(curr.left.value);
    }
    else if(data>curr.value)
    {
        if(curr.right!=null)
            add(data,curr.right);
        else
            curr.right=new Node(data);
        
                  //      System.out.println(curr.right.value);
    }
}
 void delete(int data){
	 if(root==null)
	 {
		 
	 }
	 else if(root.value==data)
	 {
		 
	 }
	
	 else if(root.value>data)
        remove(root.left,data,root);
	 else if(root.value<data)
	        remove(root.right,data,root);
	 
    }
    void remove(Node curr,int data,Node prev){
        
        if(curr.value>data)
        {
        	prev = curr;
        	remove(curr.left,data,prev);
        }
        else if(curr.value<data)
        {
        	prev = curr;
        	remove(curr.right,data,prev);
        }
        else if(curr.value==data)
        {
        	if(curr.left==null || curr.right==null)
        	{
        		prev.next = curr.left;
        	}
        }
    }

    int minValue(Node root){
        int minV = root.value;
        while(root.left !=null){
            minV = root.left.value;
            root = root.left;
        }
        return minV;
    }
 public void inOrder(Node node){
        if(node !=null){
            inOrder(node.left);
            System.out.print(" "+node.value);
            inOrder(node.right);
        }
    }

    public void postOrder(Node node){
        if(node !=null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(" "+node.value);
        }
    }

    public void preOrder(Node node){
        if(node !=null){
            System.out.print(" "+ node.value);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
}
