class Solution {
    //int ans=0;
    public int maxDepth(TreeNode root) 
    {
        int[] ans=new int[3];
        return helper(root,0,ans);
      
    }

    public int helper(TreeNode root, int d,int[] ans)
    {
        if(root==null)
        {
            
            return ans[0];
        }
        return Math.max(helper(root.left,d+1,ans),helper(root.right,d+1,ans));   
    }
}//