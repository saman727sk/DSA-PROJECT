package DSAProjectF;
import java.util.Scanner;
public class simpleQueueArray{
    static Scanner sc = new Scanner(System.in);

    static int choice, F, R,CF,CR, item, size;
    static final int lb = 0;
    static int[] Q;
    static int[] CQ;
   public static void Queue() {
        System.out.print("\033[H\033[2J");
        System.out.println("YOU HAVE SELECTED  QUEUE");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER SIZE OF THE QUEUE"+" ");
        size = scanner.nextInt();
        Q = new int[size];
        CQ = new int[20];
        F  = lb - 1;
        R  = lb - 1;
        CF = lb-1;
        CR = lb-1;}
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

public static void EnqueueA() {
  
        char ch = 'y';
        do{
        System.out.print("\033[H\033[2J");
        System.out.println("YOU HAVE SELECTED INSERTION");
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        if (R == size + lb - 1) {
            System.out.println("QUEUE IS FULL");
            System.out.println("RETURNING.....");
            return;
        }

        if (R == (lb - 1)) {
            R = lb;
            F = lb;
        } else {
            R++;
        }

        System.out.print("ENTER THE VALUE U WANT TO INSERT"+" ");
        item = scanner.nextInt();
        Q[R] = item;
        System.out.println("\nPRESS 'Y' to INSERT AGAIN");
        ch= scanner.next().charAt(0);
    }
    while(ch =='y' || ch =='Y');
    System.out.println("RETURNING....");
    } 
     
    
	

public static void DequeueA() {
    char ch = 'y';
    do{
    System.out.print("\033[H\033[2J");
    System.out.println("YOU HAVE SELECTED DELETION");
    System.out.println();
    Scanner scanner = new Scanner(System.in);
    if (F == lb - 1) {
        System.out.println("QUEUE IS EMPTY");
        return;
    }

    item = Q[F];

    if (F == R) {
        F = lb - 1;
        R = lb - 1;
    } else {
        F++;
    }

    System.out.println("["+item+"]" + " DELETED");
    System.out.println();
    if (F == lb - 1) {
        System.out.println("QUEUE IS EMPTY");
        System.out.println("RETURNING....");
        return;
    }
    System.out.println("\nPRESS 'Y' to DELETE AGAIN");
    ch= scanner.next().charAt(0);
}
while(ch=='y' || ch=='Y');
System.out.println("RETURNING....");
}
public static void TraverseSQA(){
    System.out.print("\033[H\033[2J");
    System.out.println("YOU HAVE SELECTED TRAVERSE");
    System.out.println();
    if (F == lb - 1) {
        System.out.println("QUEUE IS EMPTY");
        System.out.println("\nRETURNING.....");
        return;
    }

    for (int i = F; i <= R; i++) {
        System.out.print("[" + Q[i] + "]");
    }

    System.out.println();
    }

}
