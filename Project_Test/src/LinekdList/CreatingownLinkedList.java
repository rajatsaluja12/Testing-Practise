package LinekdList;

public class CreatingownLinkedList {

	Node head;

	class Node{

		int data;
		Node next;
		//constructor creation below

		Node(int data){

			this.data=data;
			next=null;

		}

	}


	public static void main(String[] args) {

		CreatingownLinkedList ll = new CreatingownLinkedList();

		Node first = ll.new Node(10);

		ll.head=first;

		Node second = ll.new Node(20);

		first.next=second;

		Node third = ll.new Node(30);

		second.next=third;

		ll.PrintmyLinkedList();

	}


	public void PrintmyLinkedList() {

		Node n = head;

		while (n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}

}
