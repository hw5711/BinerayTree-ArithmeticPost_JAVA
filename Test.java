package Prog1;

import java.io.IOException;

public class Test {

	public static void main(String args[]) throws IOException {

		System.out.println("This is tree 1: ");
		String a = "1 23 4 + * 5 +";
		String postfix1[] = a.split(" ");
		System.out.println();
		BinaryTree tree1 = new BinaryTree();
		TreeNode root1 = tree1.buildTree(postfix1);
		tree1.traverse(root1);
		int result1 = tree1.eval(postfix1);
		System.out.println();
		System.out.println("Evaluation of input is: " + result1 + "\n");
		int lay1 = tree1.calc_tree_layers(root1);
		System.out.println("Here is the tree: ");
		for (int i = 1; i <= lay1; i++) {
			System.out.print("layer" + i + " ");
		}
		tree1.print(root1, 0);

		// clone a tree
		System.out.println("This is tree 2: ");
		BinaryTree tree2 = (BinaryTree) tree1.clone();
		String b = "2 46 8 * + 10 *";
		String postfix2[] = b.split(" ");
		TreeNode root2 = tree2.buildTree(postfix2);
		tree1.traverse(root2);
		int result2 = tree2.eval(postfix2);
		System.out.println();
		System.out.println("Evaluation of input is: " + result2 + "\n");
		int lay2 = tree2.calc_tree_layers(root2);
		System.out.println("Here is the tree: ");
		for (int i = 1; i <= lay2; i++) {
			System.out.print("layer" + i + " ");
		}
		tree2.print(root2, 0);

	}

}
