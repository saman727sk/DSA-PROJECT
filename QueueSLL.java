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



}
