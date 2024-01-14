package DSAProjectF;
import java.util.Scanner;
public class circularQueueArray{
    static Scanner sc = new Scanner(System.in);
    //static int choice;
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
 public static void TraverseCQA(){
    System.out.print("\033[H\033[2J");
        System.out.println("YOU HAVE SELECTED TRAVERSE");
        System.out.println();
        if (CF == lb - 1) {
            System.out.println("QUEUE IS EMPTY");
            System.out.println("RETURNING.....");
            return;
        }

        if (CF <= CR) {
            for (int i = CF; i <= CR; i++) {
                System.out.print("[" + CQ[i] + "]");
            }
        } else {
            for (int i = lb; i <= CR; i++) {
                System.out.print("[" + CQ[i] + "]");
            }
            for (int i = CF; i <= (size + lb - 1); i++) {
                System.out.print("[" + CQ[i] + "]");
            }
        }

        System.out.println();
   
}
public static void EnqueueCQA(){
     char ch = 'y';
     do{
     System.out.print("\033[H\033[2J");
     System.out.println("YOU HAVE SELECTED INSERTION");
     System.out.println();
     Scanner scanner = new Scanner(System.in);

     if (CR == CF - 1 || ((CR == (size + lb - 1)) && (CF == lb))) {
         System.out.println("QUEUE IS FULL");
         return;
     }

     if (CR == lb - 1) {
         CR = lb;
         CF = lb;
     } else {
         if (CR == (size + lb - 1)) {
             CR = lb;
         } else {
             CR++;
         }
     }

     System.out.print("ENTER THE VALUE U WANT TO INSERT"+" ");
     item = scanner.nextInt();
     CQ[CR] = item;
     System.out.println("\nITEM INSERTED");
     System.out.println("\nPRESS 'Y' to INSERT AGAIN");
     ch= scanner.next().charAt(0);

         }
 while(ch=='y' || ch=='Y');
 System.out.println("RETURNING....");
 }
 

public static void DequeueCQA(){

char ch = 'y';
do{
System.out.print("\033[H\033[2J");
System.out.println("YOU HAVE SELECTED DELETION");
System.out.println();
Scanner scanner = new Scanner(System.in);
if (CF == lb - 1) {
    System.out.println("QUEUE IS EMPTY");
    return;
}

item = CQ[CF];

if (CF == CR) {
    CF = lb - 1;
    CR = lb - 1;
} else {
    if (CF == (size + lb - 1)) {
        CF = lb;
    } else {
        CF++;
    }
}

System.out.println("["+item+"]" + " DELETED");
if (CF == lb - 1) {
    System.out.println("\nQUEUE IS EMPTY");
    System.out.println("\nRETURNING....");
    return;
}
System.out.println("\nPRESS 'Y' to DELETE AGAIN");
ch= scanner.next().charAt(0);

    }
while(ch=='y' || ch=='Y');
System.out.println("RETURNING....");}
}
