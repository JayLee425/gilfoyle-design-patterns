package com.gilfoyle.design.structural.composite;

public class Tree {
    
    TreeNode root = null;
    
    public Tree(String name) {
        root = new TreeNode(name);
    }
    
    //测试
    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        
        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("build the tree finished!");
    }
}  