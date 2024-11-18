public class questions {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class createTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
    //  TC: O(1)
    
    public static int  nodeCount(Node root){
        if(root==null){return 0;}
       return 1+ nodeCount(root.left) + nodeCount(root.right);
    }

    public static int sumNodes(Node root){
        if(root==null){
            return 0;
        }
        return root.data + sumNodes(root.left) +sumNodes(root.right);
    }
    
    public static int treeHeight(Node root){
        if(root==null){
            return 0;
        }
        int lh=treeHeight(root.left);
        int rh=treeHeight(root.right);
        int max=Math.max(lh, rh);
        return 1+ max;
    }
    // TC:O(N^2)
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int diam1=diameter(root.left);
        int diam2=diameter(root.right);
        int diam3=treeHeight(root.left) +treeHeight(root.right) +1;

        return Math.max(diam3, Math.max(diam1,diam2));
    }

    static class Treeinfo{
        int ht,diam;
        Treeinfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static Treeinfo diameter2(Node root){
        if(root==null){
           return new Treeinfo(0, 0);
        }
        Treeinfo left=diameter2(root.left);
        Treeinfo right=diameter2(root.right);

        int height=Math.max(left.ht, right.ht) +1;
        int diam1 =left.diam;
        int diam2 =right.diam;
        int diam3=left.ht + right.ht +1;
        
        int diameter=Math.max(Math.max(diam1, diam2), diam3);

        Treeinfo myinfo=new Treeinfo(height, diameter);
        return myinfo;


    }
    public static boolean isIdentical(Node root, Node root2){
        if(root==null && root2 ==null){
            return true;
        }
        if(root==null || root2==null){
            return false;
        }
        if(root.data==root2.data){
        return isIdentical(root.left, root2.left) && isIdentical(root.right, root2.right);
    }
    return false;
    }

    public static boolean isSubtree(Node root, Node root2){
        if(root2==null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(root.data==root2.data){
           if(isIdentical(root,root2)){
            return true;
           }
    }
    return isSubtree(root.left, root2) || (isSubtree(root.right, root2));
    }


    public static void main(String arga[]) {
        createTree ct = new createTree();
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        int nodes2[]={ 2,4,-1,-1,5,-1,-1,3,-1,-1};
        questions qn=new questions();

        Node root=ct.buildTree(nodes);
        System.out.println(root.data);

        createTree.idx=-1;
        Node root2=ct.buildTree(nodes2);
        System.out.println(root2.data);

        System.out.println(isSubtree(root, root2));

        // qn.nodeCount(root);
        // System.out.println(nodeCount(root));
        // System.out.println(sumNodes(root));
        // System.out.println(treeHeight(root.left.left));
        // System.out.println(diameter(root));
        // System.out.println(diameter2(root).diam);

    }
}
