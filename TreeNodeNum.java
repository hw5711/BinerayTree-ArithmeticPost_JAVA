package programOne;
//
import java.util.*;

public class TreeNodeNum {
	Stack <Integer> numStack = new Stack<Integer>();
	int capacity;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public TreeNodeNum(Stack<Integer> numStack) {
		super();
		this.numStack = numStack;
	}
	
	public void addNum(int number)
	{
		this.numStack.push(number);
	}
	
	public int popNum()
	{
		if(this.capacity != 0)
			return this.numStack.pop();
		return -1;
	}

}
