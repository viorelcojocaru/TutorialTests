package myThisSuper.node;

public class Node {

	private int value;
	private Node next;

	public Node(int value, Node next) {
		this.value = value;
		this.next = next;

	}

	public static void main(String[] args) {
		
		Node tail=generateToMaxRec(10);
		System.out.println(toStringRec(tail));
		System.out.println(toStringItc(tail));	
		Node rootList=generateFromMaxRec(10);System.out.println("second");
		printBackward(rootList);//System.out.println("toStringRec "+toStringRec(rootList));
		printBackward(rootList);//System.out.println("toStringItc "+toStringItc(rootList));	
		System.out.println("size= "+size(rootList));
		System.out.println("max= "+max(rootList));
		System.out.println("         \n      Add one");	
		add(rootList,29);	
		System.out.println("size= "+size(rootList));
		System.out.println("max= "+max(rootList));
		System.out.println(toStringRec(rootList));
		printBackward(rootList);//
		
		remove(rootList);System.out.println("          \n     remove one ");
		System.out.println("size= "+size(rootList));
		System.out.println("max= "+max(rootList));
		System.out.println("toStringItc "+toStringRec(rootList));
		printBackward(rootList);//
		
		System.out.println("             \n  Add one, index= 2, value= 111 ");
		add(rootList,2,111);
		add(rootList,4,111);
		System.out.println("size= "+size(rootList));
		System.out.println("max= "+max(rootList));
		System.out.println("toStringItc "+toStringRec(rootList));
		printBackward(rootList);//
		
		System.out.println("     \n          remove one, index= 2, value= 111 ");
		remove(rootList,4);
		remove(rootList,2);
		
		System.out.println("size= "+size(rootList));
		System.out.println("max= "+max(rootList));
		System.out.println("toStringItc "+toStringRec(rootList));
		printBackward(rootList);//
		
		System.out.println("     \n          printBackward ");
		
		printBackward(rootList);
		
		System.out.println("size= "+size(rootList));
		System.out.println("max= "+max(rootList));
		System.out.println("toStringItc "+toStringRec(rootList));
	}
	
	public static void printBackward (Node list) {
        if (list == null) return;
        Node head = list;
        Node tail = list.next;
        printBackward (tail);
        System.out.print (head.value+" ");
    } 
	
	public static void remove(Node node,int index){
		Node temp;
		int i=size(node);
		while(i>index+2){
			node=node.next;
			i--;
		}		
		node.next=node.next.next;
	}
	
	public static void add(Node node, int index, int value){
	Node temp;
	int i=size(node);

		while(i>index+1){
			node=node.next;
			i--;
		}
		temp=new Node(value,node.next);
		node.next=temp;

	
	}
	
	public static void remove(Node tail){
		for(int i=size(tail);i>2;i--){
			tail=tail.next;
		}
		tail.next=null;
	}

	public static void add(Node tail, int one){
		Node addNode = new Node(one, null);
		while (tail.next != null) {
			tail = tail.next;
		}
		tail.next = addNode;
	}
	public static int max(Node ref){
		int max =0;
		while(ref!=null){
			if (max < ref.value){
				max=ref.value;
			}			
		ref=ref.next;
		}
		
		return max;
	}
	public static int size(Node tail){
		int result=0;
		while(tail!=null){
			result++;
		tail=tail.next;
		}
		return result;
	}
	
	private static Node generateToMaxRec(int max){
		//for0 to max
		Node result = null;
		for (int i = 0; i <= max; i++) {
			result = new Node(i, result);
		}
		return result;
	}
	
	private static Node generateFromMaxRec(int max){
		//from max to 0
		Node result=new Node(max, null);
		Node ref = result;
		for (int i = max; i >0; i--) {
			ref.next=new Node (i-1,null);
			ref=ref.next;
		}
		return result;
	}
	

	private static String toStringRec(Node ref){
		if (ref==null) {
			return "null";
		} else {			
			return "("+ref.value+")-> "+toStringRec(ref.next);
		}		
	}
	
	private static String toStringItc(Node ref) {
		String result="";
		while (ref != null) {
			result +="("+ref.value+")-> "; 
			ref= ref.next;			
		}
		result+="null";
		return result;
	}

	private static void first() {
		Node node0 = new Node(0, null);
		Node node1 = new Node(1, null);
		Node node2 = new Node(2, null);
		Node node3 = new Node(3, null);

		node0.next = node1;
		node1.next = node2;
		node2.next = node3;

		Node ref = node0;

		while (ref != null) {
			System.out.print(ref.value + " ");
			ref = ref.next;

		}
	}

}
