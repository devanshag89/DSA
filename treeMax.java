class Node{
    Node left;
    Node right;
    int val;

    Node(int v){
        val = v;
        left = null;
        right = null;
    }
}

public class treeMax {
    public static void main(String[] args) {
        
        int[] arr = {7,8,10,12,5,6};

        Node root = createTree(arr,0);

        System.out.println(findSum(root));

        System.out.println(isIdentical(root, root));
    }

    public static Node createTree(int[] arr,int i){
        if(i>=arr.length || arr[i]==-1){
            return null;
        }

        Node n = new Node(arr[i]);

        n.left = createTree(arr, i*2+1);
        n.right = createTree(arr, i*2+2);

        return n;
    }

    public static int findSum(Node root){
        if(root.left==null && root.right==null) return root.val;

        int l = root.left!=null?findSum(root.left):0;
        int r = root.right!=null?findSum(root.right):0;

        return l + r + root.val;
    }

    public static boolean isIdentical(Node root1, Node root2){
        if(root1==null && root2==null) return true;
        if(root1==null) return false;
        if(root2==null) return false;

        boolean ans = root1.val==root2.val;

        ans = ans && isIdentical(root1.left, root2.left);
        ans = ans && isIdentical(root1.right, root2.right);

        return ans;
    }
}
