package DSAProjectF;
import java.util.Scanner;



public class simpleQueueSLL {

		static Scanner sc = new Scanner(System.in);
		static int choice;
		static class Node{
			int info;
			Node next;
			Node(int info){
				this.info = info;
				this.next = null;
			}
		}
		static Node R = null;
		static Node F = null;

		
		
	/**************************************************************/			
	/******************** Queue Insertion ****************/		
	/**************************************************************/		

	public	static void EnqueueSLL(Scanner sc) {
		System.out.println("enter item");
		int item=sc.nextInt();	
		Node ptr = new Node(item);
			ptr.info = item;
			ptr.next = null;
			if(R==null) {
				F= ptr;
				R = ptr;
			}
			else {
				R = R.next;
				R = ptr;
			}
			
		}
		
	/**************************************************************/			
	/******************** Stack deletion ****************/		
	/**************************************************************/		

		public static void DequeueSLL() {
			if(F==null) {
				System.out.println("Queue Empty!");
				return;
			}
			F = F.next;
			System.out.println("Item deleted Successfully!");
		}
		
	/**************************************************************/			
	/******************** Stack Display ****************/		
	/**************************************************************/		

	public	static void TraverseSQSLL() {
			Node ptr = F;
			while(ptr!=null) {
				System.out.println(ptr.info);
				ptr = ptr.next;
			}
		}

}