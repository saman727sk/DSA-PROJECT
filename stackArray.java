package DSAProjectF;
import java.util.Scanner;
public class stackArray{
    static int size, item;
    static  int lb = 0;
    static int top = lb-1;
    static int[] A;
   // static Scanner sc = new Scanner(System.in);
  public static  void Stackarray (){
        System.out.print("\033[H\033[2J");
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE STACK SIZE:");
        size = sc.nextInt();
        A= new int[size];
        //choices();
    } 
public static void stackTraverseA() {
       // System.out.print("\033[H\033[2J");
        System.out.println("YOU HAVE SELECTED TRAVERSING.");
        if (top == lb - 1) {
            System.out.println("STACK IS EMPTY");
            return;
        }
        System.out.println("THE STACK IS :");
        for (int i = top; i >= lb; i--) {
            System.out.print("[" + A[i] + "] ");
        }
        System.out.println();
    }
public static void stackPushA () {
        char choice='y';
        do{
       // System.out.print("\033[H\033[2J");
        System.out.println("YOU HAVE SELECTED PUSH.");
        if (top == size + lb ) {
            System.out.println("STACK IS FULL");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE ITEM U WANT TO PUSH ");
        item = sc.nextInt();
        top++;
        A[top] = item;
        System.out.println("PRESS 'Y' to PUSH AGAIN");
        choice= sc.next().charAt(0);
    }
        while(choice=='y'|| choice=='Y');
        System.out.println("RETURNING TO MENU...");
    }
public static void stackPopA() {
        char choice='y';
        do{
        System.out.print("\033[H\033[2J");
        System.out.println("YOU HAVE SELECTED POP.");
        if (top == lb - 1) {
            System.out.println("STACK IS EMPTY");
            return;
        }
        item = A[top];
        top--;
        System.out.println("[" + item + "] IS POPPED");
        Scanner sc=new Scanner(System.in);
        System.out.println("PRESS 'Y' to POP AGAIN");
        choice= sc.next().charAt(0);
    }
         while(choice=='y'|| choice=='Y');
        System.out.println("RETURNING TO MENU...");
    }
}
