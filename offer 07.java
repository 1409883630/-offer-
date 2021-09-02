//剑指 Offer 07. 重建二叉树
//输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。
//假设输入的前序遍历和中序遍历的结果中都不含重复的数字、
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
          int n = preorder.length;
        if (n == 0)
            return null;
        int rootVal = preorder[0], rootIndex = 0;
        for (int i = 0; i < n; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }
        TreeNode root = new TreeNode(rootVal);
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, 1 + rootIndex), Arrays.copyOfRange(inorder, 0, rootIndex));
        root.right = buildTree(Arrays.copyOfRange(preorder, 1 + rootIndex, n), Arrays.copyOfRange(inorder, rootIndex + 1, n));

        return root;
    }
}
