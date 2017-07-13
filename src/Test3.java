import java.util.ArrayList;

/**
 * Created by Administrator on 2017/7/12.
 */
public class Test3 {
    public static void main(String[] args) {

        int[] pre = {1,2,3,4,5,6,7};
        int[] in = {3,2,4,1,6,5,7};

        TreeNode t = reConstructBinaryTree(pre,in);

        System.out.println(t.val);
        System.out.println(t.left.val);
        System.out.println(t.right.val);
        System.out.println(t.left.left.val);
        System.out.println(t.left.right.val);
        System.out.println(t.right.left.val);
        System.out.println(t.right.right.val);


    }

    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre == null || in == null || pre.length != in.length)
            return null;
        int length = pre.length;
        return reConstructBinaryTree(pre,0,length-1,in,0,length-1);
    }
    private static TreeNode reConstructBinaryTree(int [] pre,int s1,int e1,int [] in ,int s2, int e2){

        if(s1 > e1)
            return null;

        TreeNode treeNode = new TreeNode(pre[s1]);

        int i = s2;
        while(i <= e2){
            if(in[i] == pre[s1])
                break;
            i++;
        }
            treeNode.left = reConstructBinaryTree(pre, s1 + 1, s1 + (i-s2), in, s2, i-1);
            treeNode.right = reConstructBinaryTree(pre, s1 + i - s2 + 1, e1, in, i + 1, e2);

        return treeNode;
    }
}
