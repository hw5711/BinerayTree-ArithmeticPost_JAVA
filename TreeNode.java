package Prog1;

public class TreeNode implements Node, Cloneable {

	public String data;
	public TreeNode leftChild;
	public TreeNode rightChild;

	public TreeNode(String d) {
		this.data = d;
		this.leftChild = null;
		this.rightChild = null;
	}

	@Override
	public String getData() {
		return this.data;
	}

	@Override
	public void setData(String data) {
		this.data = data;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void displayNode() {
		System.out.print(this.data + " ");
	}

}