package leetcode;

import leetcode.api.TreeNode;

/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree
 * https://leetcode.com/explore/learn/card/introduction-to-data-structure-binary-search-tree/142/conclusion/1012/
 * https://leetcode.com/explore/learn/card/data-structure-tree/133/conclusion/932/
 */
public final class Problem236LowestCommonAncestorOfABinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if (root == p || root == q) {
            return root;
        }

        final TreeNode left = lowestCommonAncestor(root.left, p, q);
        final TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left != null ? left : right;
    }

    // values instead of nodes
    public TreeNode lowestCommonAncestor2(TreeNode root, int v1, int v2) {
        if (root == null) {
            return null;
        }

        if (root.val == v1 || root.val == v2) {
            return root;
        }

        final TreeNode left = lowestCommonAncestor2(root.left, v1, v2);
        final TreeNode right = lowestCommonAncestor2(root.right, v1, v2);

        if (left != null && right != null) {
            return root;
        }

        return left != null ? left : right;
    }
}
