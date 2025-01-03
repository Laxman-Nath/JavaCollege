/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package treeexample;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class TreeExample {
    public static void main(String[] args) {
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("Root");
        
        DefaultMutableTreeNode child1=new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2=new DefaultMutableTreeNode("Child 2");
        
        root.add(child1);
        root.add(child2);
        DefaultTreeModel treeModel=new DefaultTreeModel(root);
        
        JTree tree=new JTree(treeModel);
              // Create a frame to hold the tree
        JFrame frame = new JFrame("JTree Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.add(new JScrollPane(tree)); // Add the tree to a scroll pane
        frame.setVisible(true);
    }
}