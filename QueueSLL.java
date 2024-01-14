package DSAProjectF;
import java.util.Scanner;



public class QueueSLL {

    static class NodeSLL {
        int info;
        NodeSLL next;

        NodeSLL(int value) {
            info = value;
            next = null;
        }
    }

    static NodeSLL F, R;
    static int choice, item;

    

public static void EnqueueSLL() {
        NodeSLL ptr = new NodeSLL(0);
        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER THE VALUE FOR INSERTION\t");
        item = scanner.nextInt();

        ptr.info = item;
        ptr.next = null;

        if (R == null) {
            F = ptr;
            R = ptr;
        } else {
            R.next = ptr;
            R = ptr;
        }
    }
 public static void DequeueSLL(){
        if (F == null) {
            System.out.println("QUEUE IS EMPTY");
            return;
        }

        NodeSLL ptr = F;

        if (F.next == null) {
            F = null;
            R = null;
        } else {
            F = F.next;
        }

        ptr = null; //free memory
    }

  public  static void TraverseSQSLL() {
        if (F == null) {
            System.out.println("QUEUE_LL IS EMPTY");
            return;
        }

        NodeSLL ptr = F;
        System.out.println("LIST IS :");

        while (ptr != R) {
            System.out.print(ptr.info + "  ");
            ptr = ptr.next;
        }

        System.out.print(ptr.info + "  ");
    }
		/*static Scanner sc = new Scanner(System.in);
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

	/*public	static void EnqueueSLL(Scanner sc) {
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

	/* 	public static void DequeueSLL() {
			if(F==null) {
				System.out.println("Queue Empty!");
				return;
			}
			F = F.next;
			System.out.println("Item deleted Successfully!");
		}*/
		
	/**************************************************************/			
	/******************** Stack Display ****************/		
	/**************************************************************/		

/* public	static void TraverseSQSLL() {
			Node ptr = F;
			while(ptr!=null) {
				System.out.println(ptr.info);
				ptr = ptr.next;
			}
		}*/

}