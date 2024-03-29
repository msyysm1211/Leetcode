package com.Problem.Q1_Q499;

//101. Symmetric Tree
public class Solution0101 {
    public boolean isSymmetric(TreeNode root) {
        return check(root.left, root.right);
    }

    boolean check(TreeNode l, TreeNode r) {
        if (l == null && r == null) {
            return true;
        } else if (l == null && r != null || l != null && r == null) {
            return false;
        } else if (l.val != r.val) {
            return false;
        } else {
            return check(l.left, r.right) && check(l.right, r.left);
        }
    }
}

