import java.util.*;
class Node
{
int data;
Node left;
Node right;
int height;
}
class height
{
Node root;
void insert1(int data)
{
this.root=insert(this.root,data);
System.out.println(root.height);
}
Node insert(Node node,int data)
{
if(node==null)
{
Node nn=new Node();
nn.data=data;
nn.height=1;
return nn;
}
if(data>node.data)
{
node.right=insert(node.right,data);
}
else if(data<node.data)

node.left=insert(node.left,data);
}
node.height=Math.max(height(node.left),height(node.right))+1;
}
int height(Node node)
{
if(node==null)
return 0;
else 
return node.height;
}
}
class main
{
public static void main(String args[])
{
height h=new height();
h.insert1(20);
h.insert1(21);

h.insert1(22);
h.insert1(1);
h.insert1(11);
h.insert1(10);
}
}

