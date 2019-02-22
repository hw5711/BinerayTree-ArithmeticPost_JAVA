# BinerayTree-ArithmeticPost-fixExpression
test a arithmetic post-fix expression with a binary tree with JAVA


Given the "Node" interface and the "TreeNode" class, complete the following:
I. Add a "clone" method to the "TreeNode" class for cloning a tree.
II. Create a "TreeNodeNum" subclass of the "TreeNode" class. Note that each "TreeNodeNum" node should
store an integer value. You need to provide a "clone" method to override the "clone" method in the
"TreeNode" class.
III. Build a tree to represent a simplified arithmetic post-fix expression from the standard input consisting
of non-negative numbers and the '+' (addition) and '*' (multiplication) operators.
IV. Add "eval" methods to the appropriate classes to evaluate the simplified arithmetic expression
represented by a tree.
V. Write a main program (which should be a class) to do the following in the specified order:
1. Read in a simplified arithmetic expression and build its binary tree representation; 2. Print its tree representation;
3. Evaluate the tree;
4. Clone the tree;
5. Swap the '+' and '*' operators in the cloned tree and double the numbers to produce a new tree; 6. Print the new tree;
7. Evaluate the new tree;
8. Re-print the original tree; and
9. Re-evaluate the orginal tree.



Simplified Arithmetic Post-fix Expression Evaluator <<< Enter a simplified arithmetic post-fix expression:
1 23 4 + * 5 +
The tree representation:
+
* 1
+ 23
4 5

Page 1 of 2
Programming assignment 1 2/4/19, 8)04 PM
The value: 32
The new tree:
*
+ 2
* 46
8 10
The value of the new tree: 3700
