package Prog1;

import java.util.Stack;
import Prog1.TreeNode;

public class BinaryTree implements Cloneable {

	public TreeNode root;
	public int layer;
	public Stack<TreeNode> TreeNodeNum;

	public BinaryTree() {
		root = null;
		TreeNodeNum = null;
	}

	// Calculate total layers of tree
	public int calc_tree_layers(TreeNode root) {
		int left_way_layers, right_way_layers;
		if (root == null)
			return 0;
		else {
			left_way_layers = 1 + calc_tree_layers(root.leftChild);
			right_way_layers = 1 + calc_tree_layers(root.rightChild);
			if (left_way_layers > right_way_layers)
				return left_way_layers;
			else
				return right_way_layers;
		}
	}

	public void print(TreeNode root, int layer) {
		int i;
		System.out.println("");
		if (root == null) {
			return;
		}
		print(root.rightChild, layer + 1);
		for (i = 0; i < layer; i++) {
			System.out.print("  	");
		}
		System.out.print(root.getData());
		print(root.leftChild, layer + 1);
	}

	public Object clone() {
		BinaryTree tree2 = null;
		try {
			tree2 = (BinaryTree) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return tree2;
	}

	// display tree in post order
	public void traverse(TreeNode root) {
		if (root != null) {
			traverse(root.leftChild);
			traverse(root.rightChild);
			root.displayNode();
		}
	}

	// check input data and build a tree
	public TreeNode buildTree(String[] s) {
		TreeNodeNum = new Stack<TreeNode>(); // store number
		int i = 0;
		String symbol;
		TreeNode newNode;
		while (i < s.length) {
			symbol = s[i];
			if (symbol.equals("+") || symbol.equals("-") || symbol.equals("/")
					|| symbol.equals("*")) {
				if (TreeNodeNum.size() >= 2) {
					TreeNode ptr1 = TreeNodeNum.pop();
					TreeNode ptr2 = TreeNodeNum.pop();
					newNode = new TreeNode(symbol);
					newNode.leftChild = ptr2;
					newNode.rightChild = ptr1;
					TreeNodeNum.push(newNode);
				}
				// if input is number, push into stack
			} else {
				newNode = new TreeNode(symbol);
				TreeNodeNum.push(newNode);
			}
			i++;
		}
		return TreeNodeNum.pop();
	}

	// Calculate the arithmetic result
	public int eval(String[] postfix) {
		Stack<Integer> TreeNodeNum = new Stack<Integer>();
		int len = postfix.length;
		String temp;

		for (int i = 0; i < len; i++) {
			temp = postfix[i];
			if (!isOperator(temp)) {
				TreeNodeNum.push(Integer.parseInt(temp));
			} else {
				int val = 0;
				int num1 = TreeNodeNum.pop();
				int num2 = TreeNodeNum.pop();
				switch (temp.charAt(0)) {
				case '+':
					val = num2 + num1;
					break;

				case '-':
					val = num2 - num1;
					break;

				case '*':
					val = num2 * num1;
					break;

				case '/':
					val = num2 / num1;
					break;

				default:
					break;
				}
				TreeNodeNum.push(val);
			}
		}
		return TreeNodeNum.pop();
	}

	private boolean isOperator(String temp) {
		String[] oper = { "+", "-", "*", "/" };
		for (String anOper : oper)
			if (temp.equals(anOper))
				return true;
		return false;
	}
}
