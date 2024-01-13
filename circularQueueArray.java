package DSAProjectF;
import java.util.Scanner;
public class circularQueueArray{
    static Scanner sc = new Scanner(System.in);
    static int choice;

 public static void TraverseCQA(){
   
    if (F == LB - 1) {
        System.out.println("Queue is Empty");
        return;
    }

    System.out.println("Queue elements:");
    if (R >= F) {
        for (int i = F; i <= R; i++) {
            System.out.print(A[i] + " ");
        }
    } else {
        // If the rear has wrapped around to the front
        for (int i = F; i <= size + LB - 1; i++) {
            System.out.print(A[i] + " ");
        }
        for (int i = LB; i <= R; i++) {
            System.out.print(A[i] + " ");
        }
    }
    System.out.println();
}
public static void EnqueueCQA(Scanner sc){
System.out.println("enter the size of circular queue");
size=sc.nextInt();
A=new int[size];
if (R == F - 1 || ((R == (N + LB - 1)) && (F == LB))) {
    System.out.println("Queue is Full");
    return;
}

if (R == LB - 1) {
    R = LB;
    F = LB;
} else {
    if (R == (N + LB - 1)) {
        R = LB;
    } else {
        R++;
    }
}

System.out.print("Enter the value you want to insert\t");
item = sc.nextInt();
A[R] = item;
}
public static void DequeueCQA(){
if (F == LB - 1) {
    System.out.println("Queue is Empty");
    return;
}

item = A[F];

if (F == R) {
    F = LB - 1;
    R = LB - 1;
} else {
    if (F == (N + LB - 1)) {
        F = LB;
    } else {
        F++;
    }
}

System.out.println(item + " has been Deleted from Queue");
}
}
