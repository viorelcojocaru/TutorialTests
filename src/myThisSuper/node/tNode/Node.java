package myThisSuper.node.tNode;

import java.util.ArrayList;
import java.util.List;

public class Node <T> {

	/**
	 * @param args
	 */
	
	private int value;
	 
	private Node leftNext;
	
	private Node rightNext;
	
	
	
	
	
	public Node(int value, Node leftNext, Node rightNext) {
		super();
		this.value = value;
		this.leftNext = leftNext;
		this.rightNext = rightNext;
	}

	

	public static void main(String[] args) {
	first();	
	}

	static void first(){
		Node root=new Node(0, null, null);
		Node node1=new Node(1,null,null);
		Node node2=new Node(2,null,null);
		Node node3=new Node(3,null,null);
		Node node4=new Node(4,null,null);
		Node node5=new Node(5,null,null);
		Node node6=new Node(6,null,null);
		Node node7=new Node(7,null,null);
		
		root.leftNext=node1;
		root.rightNext=node2;
		node1.leftNext=node3;
		node1.rightNext=node4;
		node2.rightNext=node6;
		node4.rightNext=node5;
		node5.leftNext=node7;	

		showLeft(root);
//		showRight(root);
		showChilds(root); 
		
		
	}
	
	public static void showChilds(Node root) {

		List<Node> ln = new ArrayList<Node>();
		ln.add(root);
		int level = 0;
		int height=0;
		while (!ln.isEmpty()) {
			// tratez primul nod
			Node n = ln.get(0);
			if (n != null) {
				ln.add(n.leftNext);
				ln.add(n.rightNext);
				if (level == 0) {
					System.out.print(" " + n.value);height++;
				} 
				else {
					System.out.print(" " + n.value);
				}
				if (level < 1) {
					level++;
					System.out.println("");
				} else {
					level = 0;
				}
			} else {
				System.out.print(" null");
				if (level < 1) {
					level++;
					System.out.println("");
				} else {
					level = 0;
				}

			}
			ln.remove(n);
//			 System.out.print("\nLIST");
//			 for (int i=0;i<ln.size();i++){
//				
//			 if(ln.get(i)!=null){
//			 System.out.print("  "+ln.get(i).value);
//			 }else System.out.print("  null");
//			 }
		}System.out.println("height="+height);
		
//		Node ref=root;
//		while(ref!=null){			
//		if(ref.leftNext!=null){
//			System.out.println (space("   ")+ref.leftNext.value);
//			
//		}else if(ref.rightNext!=null){			
//			System.out.print(ref.rightNext.value);		
//		}else{
//			System.out.println("null");
//		}
//		ref=ref.leftNext;
//		System.out.print("    ");	
//		}
//		
		
//		ref=ref.rightNext;
	}
	
	public static boolean hasRightNext(Node node) {
		if (node.rightNext != null) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean hasLeftNext(Node node) {
		if (node.leftNext != null) {
			return true;
		} else {
			return false;
		}
	}
	
	static String space(String add){
		String space="";
		return space+add;
	}
	
	public static void showRight(Node root){
		Node ref=root;
		if(ref!=null){
			System.out.println("node "+ref.value);
			ref=ref.rightNext;
			showRight(ref);
		}		
	}

	public static void showLeft(Node root){
		Node ref=root;
		while(ref!=null){
			System.out.println("node "+ref.value);
			ref=ref.leftNext;
		}	
	}

}
