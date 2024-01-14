package DSAProjectF;
import java.util.Scanner;

public class QueueDLL {

    static class NodeDLL {
        int info;
        NodeDLL next;
        NodeDLL prev;

        NodeDLL(int value) {
            info = value;
            next = null;
            prev = null;
        }
    }

    static NodeDLL F, R;
    static int choice, item;

   public static void enqueueDLL() {
        NodeDLL ptr = new NodeDLL(0);
        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER THE VALUE FOR INSERTION\t");
        item = scanner.nextInt();

        ptr.info = item;
        ptr.next = null;
        ptr.prev = null;

        if (R == null) {
            F = ptr;
            R = ptr;
        } else {
            R.next = ptr;
            ptr.prev = R;
            R = ptr;
        }
    }

 public static void dequeueDLL() {
        if (F == null) {
            System.out.println("QUEUE IS EMPTY");
            return;
        }

        NodeDLL ptr = F;

        if (F.next == null) {
            F = null;
            R = null;
        } else {
            F = F.next;
            F.prev = null;
        }

        ptr = null; // free memory
    }

 public static void TraverseSQDLL(){
        if (F == null) {
            System.out.println("QUEUE_LL IS EMPTY");
            return;
        }

        NodeDLL ptr = F;
        System.out.println("LIST IS :");

        while (ptr != null) {
            System.out.print(ptr.info + "  ");
            ptr = ptr.next;
        }
        System.out.println();
    }
}
