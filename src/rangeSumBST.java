import java.util.ArrayList;
import java.util.List;

public class rangeSumBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> res = new ArrayList<>();
        int sum = 0;
        preorder(root,res);
        for (Integer a: res){
            if (a>=low&&a<=high){
                sum+=a;
            }
        }
        return sum;
    }

    public void preorder(TreeNode root , List<Integer> res){
        if(root==null){
            return ;
        }
        res.add(root.val);
        preorder(root.left,res);
        preorder(root.right,res);

    }
}
