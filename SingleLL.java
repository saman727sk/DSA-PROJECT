package DSAProjectF;
import java.util.Scanner;
public class SingleLL{

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
			static Node start = null;
			
						public	static void Traverse_SLL() {
								if(start==null) {
									System.out.println("Sll is Empty.");
									return;
								}
								Node ptr = start;
								while(ptr!=null) {
									System.out.print(ptr.info +"\n");
									ptr = ptr.next;
								}
							}
							
				
					
						public	static void insertion_AtFirst_SLL(Scanner sc) {
								System.out.println("enter the item ");
								int item=sc.nextInt();
							Node ptr = new Node(item);
								ptr.info = item;
								ptr.next = start;
								start = ptr;
							}
							
	
				public static void insertion_AtLast_SLL(Scanner sc){
					System.out.println("enter the item");
					int item=sc.nextInt();
				Node ptr = new Node(item);
				ptr.info = item;
				ptr.next = null;
				
				if(start==null) {
					start = ptr;
					return;
				}
				
				Node ptr1 = start;
				while(ptr1.next!=null) {
					ptr1 = ptr1.next;
				}
				ptr1.next = ptr;
			}
			
		
	
		public	static void insertion_AtMiddle_BGN_SLL(Scanner sc){
				System.out.println("inter the search item");
				int SItem=sc.nextInt();
				System.out.println("enter the item");
				int item=sc.nextInt();
				Node ptr = start;
				while((ptr!=null) && (ptr.info!=SItem))
					ptr = ptr.next;
					if(ptr==null) {
						System.out.println("Required item not found.");
						return;
					}
					Node ptr1 = new Node(item);
					ptr1.info = item;
					ptr1.next = ptr;
					if(ptr==start) {
						start = ptr1;
						return;
					}
					Node ptr2 = start;
					while(ptr2.next!=ptr)
						ptr2 = ptr2.next;
					ptr2.next = ptr1;
					
				}
		
			public	static void insertion_AtMiddle_AGN_SLL(Scanner sc) {
					System.out.println("enter the search item");
					int SItem=sc.nextInt();
					System.out.println("enter the item");
					int item=sc.nextInt();
					Node ptr = start;
					while((ptr!=null) && (ptr.info!=SItem))
					ptr = ptr.next;
				if(ptr==null) {
					System.out.println("Required item not found.");
					return;
				}
				Node ptr1 = new Node(item);
				ptr1.info = item;
				
				ptr1.next = ptr.next;
				ptr.next = ptr1;
			}
			
	
	
		public	static void insertion_AtExactMiddle_SLL(Scanner sc){
				System.out.println("enter the item");
				int item=sc.nextInt();
			int count = 0;
				Node ptr1 = start;
				while(ptr1!=null) {
					count = count+1;
					ptr1 = ptr1.next;
				}
				int mid = (count/2)+1;
				Node ptr = new Node(item);
				ptr.info = item;
				
				if((count==0) || (count==1)){
					ptr.next = start;
					start = ptr;
					return;
				}
				Node ptr2 = start;
				for(int i=1;i<=(mid-2);i++) {
					ptr2 = ptr2.next;
				}
				ptr.next = ptr2.next;
				ptr2.next = ptr;
			}
					
	
		public	static void insertion_InMiddle_Exact_Mid_AGN_SLL(Scanner sc){
			System.out.println("enter the item");
			int item=sc.nextInt();	
			int count = 0;
				Node ptr1 = start;
				while(ptr1!=null) {
					count = count+1;
					ptr1 = ptr1.next;
				}
				int mid = (count/2);
				Node ptr = new Node(item);
				ptr.info = item;
				
				if(count==0) {
					ptr.next = null;
					start = ptr;
					return;
				}
				Node ptr2 = start;
				for(int i=1;i<=(mid-1);i++) {
					ptr2 = ptr2.next;
				}
				ptr.next = ptr2.next;
				ptr2.next = ptr;
			}
			
	
static void Insertion_InSortedList_Ascending_SLL(int item) {
				Node ptr = start;
				while((ptr!=null) && (ptr.info<item))
					ptr = ptr.next;
				Node ptr1 = new Node(item);
				ptr1.info = item;
				if(ptr==null) {
					ptr1.next = null;
					if(start==null) {
						start = ptr1;
						return;
					}
					Node ptr2  = start;
					while(ptr2.next != null)
						ptr2 = ptr2.next;
					ptr2.next = ptr1;
					return;
				}
				if(ptr==start) {
					ptr1.next = start;
					start = ptr1;
					return;}
					Node ptr2 = start;
					while(ptr2.next !=ptr) 
						ptr2 = ptr2.next;
					ptr2.next = ptr1;
					ptr1.next = ptr;
				}
				public static void Deletion_AtFirst_SLL(Scanner sc) {
					if(start==null) {
						System.out.println("Empty Linkedlist");
						return;
					}
					Node ptr = start;
					start = start.next;
					System.out.println("Item Deleted Successfully");
				}

		public	static void Deletion_AtLast_SLL() {
				if(start==null) {
					System.out.println("SLL is Empty");
					return;
				}
				if(start.next == null) {
					start = null;
					System.out.println("Item Deleted Successfully");
					return;
				}
				Node ptr = start;
				while(ptr.next.next!=null) {
					ptr = ptr.next;
				}
				ptr.next = null;
				System.out.println("Item Deleted Successfully");
			}
		public	static void Deletion_InMiddle_SearchNode_SLL(Scanner sc) {
				System.out.println("enter the search item");
				int SItem=sc.nextInt();
				Node ptr = start;
				while(ptr!=null && ptr.info!=SItem)
					ptr = ptr.next;
				if(ptr==null) {
					System.out.println("Required Item doesn't found");
					return;
				}
				if(ptr==start) {
					start = ptr.next;
					System.out.println("Item Deleted Successfully");
					return;
				}
				Node ptr1 = start;
				while(ptr1.next !=ptr) 
					ptr1 = ptr1.next;
				ptr1.next = ptr.next;
				System.out.println("Item Deleted Successfully");
			}
			
	
		
		public	static void Deletion_InMiddle_ExactMiddleNode_SLL() {
				int count = 0;
				Node ptr = start;while(ptr!=null) {
					count = count+1;
					ptr = ptr.next;
				}
				int mid = (count/2)+1;
				
				if(count==0) {
					System.out.println("SLL is Empty");
					return;
				}
				if(count==1) {
					start = null;
					System.out.println("Item Deleted Successfully");
					return;
				}
				ptr = start;
				for(int i=1;i<=(mid-1);i++) {
					ptr = ptr.next;
				}
				Node ptr1 = ptr.next;
				ptr.next = ptr1.next;
			}
		}
