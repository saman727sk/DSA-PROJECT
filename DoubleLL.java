package DSAProjectF;
import java.util.Scanner;
public class DoubleLL {
				static Scanner sc = new Scanner(System.in);
				static int choice;
				
				static class Node{
					int info;
					Node next;
					Node prev;
					Node(int info){
						this.info = info;
						this.next = null;
						this.prev = null;
					}
				}
				static Node start = null;
				
				
		
				
			public	static void Traverse_DLL() {
					if(start==null) {
						System.out.println("Dll is Empty.");
						return;
					}
					Node ptr = start;
					while(ptr!=null) {
						System.out.print(ptr.info +"\n");
						ptr = ptr.next;
					}
				}
				
			
		
			public	static void Insertion_AtFirst_DLL(Scanner sc) {
				System.out.println("enter the item");	
				int item=sc.nextInt();
				Node ptr = new Node(item);
					ptr.info = item;
					ptr.next = start;
					ptr.prev = null;
					start = ptr;
				}
				
				
			
		
			public	static void Insertion_AtLast_DLL(Scanner sc) {
				System.out.println("enter the item");
				int item=sc.nextInt();	
				Node ptr = new Node(item);
					ptr.info = item;
					ptr.next = null;
					
					if(start==null) {
						ptr.prev = null;
						start = ptr;
						return;
					}
					
					Node ptr1 = start;
					while(ptr1.next!=null) {
						ptr1 = ptr1.next;
					}
					ptr1.next = ptr;
					ptr.prev = ptr1;
				}
				
			
		
			public	static void Insertion_InMiddle_BGN(Scanner sc) {
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
					ptr1.next = ptr;
					ptr1.prev = ptr.prev;
					ptr.prev = ptr1;
					if(ptr1.prev==null) 
			        	start = ptr1;
					else
						ptr1.prev.next = ptr1;
					
				}
				
			
		
			public	static void Insertion_InMiddle_AGN(Scanner sc) {
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
					if(ptr.next!=null)
						ptr.next.prev = ptr1;
					ptr1.prev = ptr;
					ptr.next = ptr1;
				}
				
	
		
			public	static void Insertion_InMiddle_Exact_Mid_BGN_DLL(Scanner sc){
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
					
					if(count==0) {
						ptr.next = null;
						ptr.prev = null;
						start = ptr;
						return;
					}
					if(count==1) {
						ptr.next = start;
						start.prev = ptr;
						ptr.prev = null;
						start = ptr;
						return;
					}
					Node ptr2 = start;
					for(int i=1;i<mid-1;i++) {
						ptr2 = ptr2.next;
					}
					ptr.next = ptr2;
					ptr.prev = ptr2.prev;
					ptr.prev.next = ptr;
					ptr2.prev = ptr;
				}
				
		
		
			public	static void Insertion_InMiddle_Exact_Mid_AGN_DLL(Scanner sc){
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
						ptr.prev = null;
						start = ptr;
						return;
					}
					ptr1 = start;
					for(int i=1;i<mid-1;i++) {
						ptr1 = ptr1.next;
					}
					ptr.next = ptr1.next;
					if(ptr.next!=null)
						ptr.next.prev = ptr;
					ptr1.next = ptr;
					ptr.prev = ptr1;
				}

			public	static void Insertion_InSortedList_Ascending_DLL(int item) {
					Node ptr = start;
					while((ptr!=null) && (ptr.info<item))
						ptr = ptr.next;
					Node ptr1 = new Node(item);
					ptr1.info = item;
					if(ptr==null) {
						ptr1.next = null;
						if(start==null) {
							ptr1.prev = null;
							start = ptr1;
							return;
						}
						Node ptr2  = start;
						while(ptr2.next != null)
							ptr2 = ptr2.next;
						ptr2.next = ptr1;
						ptr1.prev = ptr2;
						return;
					}
					if(ptr==start) {
						ptr.prev = ptr1;
						ptr1.next = start;
						start = ptr1;
						ptr1.prev = null;
						return;
					}
					Node ptr2 = start;
					while(ptr2.next !=ptr) 
						ptr2 = ptr2.next;
					ptr.prev = ptr1;
					ptr2.next = ptr1;
					ptr1.next = ptr;
					ptr1.prev = ptr2;
				}
				
		
		
			public	static void Insertion_InSortedList_Descending_DLL(int item) {
					Node ptr = start;
					while((ptr!=null) && (ptr.info>item))
						ptr = ptr.next;
					Node ptr1 = new Node(item);
					ptr1.info = item;
					if(ptr==null) {
						ptr1.next = null;
						if(start==null) {
							ptr1.prev = null;
							start = ptr1;
							return;
						}
						Node ptr2  = start;
						while(ptr2.next != null)
							ptr2 = ptr2.next;
						ptr2.next = ptr1;
						ptr1.prev = ptr2;
						return;
					}
					if(ptr==start) {
						ptr.prev = ptr1;
						ptr1.next = start;
						start = ptr1;
						ptr1.prev = null;
						return;
					}
					Node ptr2 = start;
					while(ptr2.next !=ptr) 
						ptr2 = ptr2.next;
					ptr.prev = ptr1;
					ptr2.next = ptr1;
					ptr1.next = ptr;
					ptr1.prev = ptr2;
				}
				
		
		
			public	static void Deletion_AtFirst_DLL() {
					if(start==null) {
						System.out.println("Empty Linkedlist");
						return;
					}
					Node ptr = start;
					start = start.next;
					if(start!=null)
						start.prev = null;
					System.out.println("Item Deleted Successfully");
				}
				
			
		
			public	static void Deletion_AtLast_DLL() {
					if(start==null) {
						System.out.println("Double linkedlist is empty.");
						return;
					}
					Node ptr = start;
					if(ptr.next==null) {
						start = null;
						System.out.println("Item Deleted Successfully");
						return;
					}
					while(ptr.next.next!=null)
						ptr = ptr.next;
					ptr.next = null;
					System.out.println("Item Deleted Successfully");
				}

	
			public	static void Deletion_InMiddle_SearchNode_DLL(Scanner sc) {
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
						ptr = ptr.next;
						ptr.prev = null;
						start = ptr;
						System.out.println("Item Deleted Successfully");
						return;
					}
					Node ptr1 = start;
					while(ptr1.next !=ptr) 
						ptr1 = ptr1.next;
					ptr1.next = ptr.next;
					ptr.next.prev = ptr1;
					System.out.println("Item Deleted Successfully");
				}
				
			
			
			public	static void Deletion_InMiddle_ExactMiddleNode_DLL() {
					int count = 0;
					Node ptr = start;
					while(ptr!=null) {
						count = count+1;
						ptr = ptr.next;
					}
					int mid = (count/2)+1;
					
					if(count==0) {
						System.out.println("DLL is Empty");
						return;
					}
					if(count==1) {
						start = null;
						System.out.println("Item Deleted Successfully");
						return;
					}
					ptr = start;
					for(int i=1;i<=(mid-1);i++) {
					for(int j=1;j<=(mid-2);j++) {
						ptr = ptr.next;
					}
					Node ptr1 = ptr.next;
					ptr.next = ptr1.next;
					ptr1.next.prev = ptr;
					 if (ptr1.next != null) {
					        ptr1.next.prev = ptr;
					}
					System.out.println("Item Deleted Successfully");
				}	

}}
