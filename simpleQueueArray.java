package DSAProjectF;
import java.util.Scanner;
public class simpleQueueArray{
    static Scanner sc = new Scanner(System.in);
    static int choice;
     static int F;
     static int R=-1;
      static int LB=0;
       static int A[] ;
       static int item;
   /* static class Node{
        int info;
        Node next;
        Node(int info){
            this.info = info;
            this.next = null;
        }
    }
    static Node R = null;
    static Node F = null;

  /*   Queue_Sll(){
        do {
        System.out.println("Press 1 for Enqueue");
        System.out.println("Press 2 for Dequeue");
        System.out.println("Press 3 for Display");
        System.out.println("Press 4 for Exit");
        System.out.println("Enter your choice");
        choice = sc.nextInt();
        switch(choice) {
        case 1:
            System.out.println("Enter the item value you went to insert: ");
            int item = sc.nextInt();
            Enqueue(item);
            break;
        case 2:
            Dequeue();
            break;
        case 3:
            display();
            break;
        }
        }
        while(choice!=4);
    }*/
    
/**************************************************************/			
/******************** Queue Insertion ****************/		
/**************************************************************/		

public static void EnqueueA(Scanner sc) {
    System.out.println("enter the item");
        item=sc.nextInt();
        if (F == LB - 1) {
            System.out.println("Queue is Empty");
            return;
        }
    
        System.out.println("Queue elements:");
        for (int i = F; i <= R; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
       
        
    }
	

public static void DequeueA() {
    if (F == LB - 1) {
        System.out.println("Queue is Empty");
        return;
    }

    item = A[F];

    if (F == R) {
        F = LB - 1;
        R = LB - 1;
    } else {
        F++;
    }

    System.out.println(item + " has been Deleted from Queue");
}
public static void TraverseSQA(){
    if (F == LB - 1) {
        System.out.println("Queue is Empty");
        return;
    }

    System.out.println("Queue elements:");
    for (int i = F; i <= R; i++) {
        System.out.print(A[i] + " ");
    }
    System.out.println(); 
   /*  Node ptr = F;
        while(ptr!=null) {
            System.out.println(ptr.info);
            ptr = ptr.next;
        }*/
    }

}
