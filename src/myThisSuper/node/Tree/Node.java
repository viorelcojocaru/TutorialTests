package myThisSuper.node.Tree;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {

	private int value;
	
	private Node<T> root;
	private Node<T> parent;
	private T child;
	private List<Node<T>> children =new ArrayList<Node<T>>();
	
	

	public Node(T child) {
		setRoot(null);
		setParent(null);
		setItem(child);
	}		

	public Node(Node<T> parent, Node<T> child) {
		this.parent=parent;
		this.children.add(child);
	}
	
	public Node(Node<T> parent) {
		this.setParent(parent);
	}
	
	public Node<T> getRoot() {
		return root;
	}	
	
	public void setRoot(Node<T> root) {
		this.root = root;
	}

	public Node<T> getParent() {
		return parent;
	}

	public void setParent(Node<T> parent) {
		this.parent = parent;
	}

	public List<Node<T>> getChildren() {
		return children;
	}

	public void setChildren(List<Node<T>> children) {
		this.children = children;
	}	
	public T getItem() {
        return child;
    }

    public void setItem(T child) {
        this.child = child;
    }
	
}
