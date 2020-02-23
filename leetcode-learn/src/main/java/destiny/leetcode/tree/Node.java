package destiny.leetcode.tree;

/**
 * @Author: weiwanmin
 * @Date: 2020/2/18 14:15
 * @Version 1.0
 */
public class Node {
    Node left;
    int value;
    Node right;

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
