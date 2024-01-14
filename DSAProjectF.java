import java.util.*;
import DSAProjectF.SingleLL;
import DSAProjectF.DoubleLL;
import DSAProjectF.stackArray;
import DSAProjectF.stackLL;
import DSAProjectF.stackDLL;
import DSAProjectF.simpleQueueArray;
import DSAProjectF.circularQueueArray;
import DSAProjectF.QueueDLL;
import DSAProjectF.QueueSLL;
import org.w3c.dom.Node;
public class DSAProjectF {
    private static int A[] ;
    private static int N;
    private static int LB=0;
    private static int size;
    private static int stackChoice;
    // private static int top;
    private static int x;
  private static int top = LB-1;
   // private static int start;
    private static Node start=null;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            mainMenuDisplay();
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    arrayOperations(sc);
                    break;
                case 2:
                    stackOperations(sc);
                    break;
                case 3:
                    QueueOperations(sc);
                    break;
                case 4:
                    linkedListOperations(sc);
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (true);
    }

    private static void mainMenuDisplay() {
        System.out.println("1-Array");
        System.out.println("2-Stack ");
        System.out.println("3-Queue ");
        System.out.println("4-Linked List");
        System.out.println("5-Exit");
    }
    private static void arrayOperations(Scanner sc) {
        System.out.println("enter the size");
        size=sc.nextInt();
        A = new int[size];
        N = 0;
        LB = 0;

        do {
            arrayMenuDisplay();
            int arraychoice = sc.nextInt();

            switch (arraychoice) {
                case 1:
                    Traverse(sc);
                    break;
                case 2:
                    insert(sc);
                    break;
                case 3:
                    deletion(sc);
                    break;
                case 4:
                    searchMenu(sc);
                    break;
                case 5:
                    sortMenu(sc);
                    break;
                case 6:
                    System.out.println("Exiting array operations. Returning to the main menu.");
                    return; // This will exit the arrayOperations loop
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (true);
    }
    private static void arrayMenuDisplay() {
        System.out.println("1-Traversing");
        System.out.println("2-Insertion");
        System.out.println("3-Deletion");
        System.out.println("4-Searching");
        System.out.println("5-Sorting");
        System.out.println("6-Exit");
        System.out.print("Enter your choice: ");
    }
    private static void Traverse(Scanner sc) {
        // Implement the Traverse method
        for(int i=LB;i<=N+LB-1;i++){
            System.out.println("values after traversing="+A[i]);
    
      }
    }
    private static void insert(Scanner sc) {
        // Implement the insert method
        System.out.println("Enter the index");
               int k= sc.nextInt();
                System.out.println("Enter the value you want to insert");
               int item=sc.nextInt();
               if(N==size){
                System.out.println("array is full");
                return;
               }
      if(k<LB||k>N+LB-1)
        {
          System.out.println("INSERT position is invalid");
         // return;
        }
      for(int i=N+LB-1;i>=k;i--)
      {
         A[i+1]=A[i];
      }
      A[k]=item;
       N=N+1;
  System.out.println("after insertion="+N);
    }
    private static void deletion(Scanner sc) {
        // Implement the deletion method
        System.out.println("the element before deletion in an array="+N);
        System.out.println("enter the  index where you want to delete a value");
       int k=sc.nextInt();
       if(N==0){
        System.out.println("array is empty");
    return;
    }
        if(k<LB||k>N+LB-1){
            System.out.println("deletion position is not valid");
            return;
        }
            for(int i=k+1;i<=N+LB-1;i++)
            {
                A[i-1]=A[i];
                System.out.println(A[i]);
            }
        N=N-1;
       System.out.println("values after deletion"+N); 
    }
private static void searchMenu(Scanner sc) {
        do {
            System.out.println("Which type of searching do you want?");
            System.out.println("1-Linear searching");
            System.out.println("2-Binary searching");
            System.out.println("3-Exit");
            int searchChoice = sc.nextInt();

            switch (searchChoice) {
                case 1:
                    linearSearchMenu(sc);
                    break;
                case 2:
                    binarySearchMenu(sc);
                    break;
                case 3:
                    System.out.println("Exiting searching operations.");
                    return; // This will exit the searchMenu loop
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (true);
    }
    private static void linearSearchMenu(Scanner sc) {
        do {
            System.out.println("Which type of linear search do you want?");
            System.out.println("1-Linear single search");
            System.out.println("2-Linear multiple search");
            System.out.println("3-Exit");
            int linearSearchChoice = sc.nextInt();

            switch (linearSearchChoice) {
                case 1:
                    linearSingleSearch(sc);
                    break;
                case 2:
                    linearMultiSearch(sc);
                    break;
                case 3:
                    System.out.println("Exiting linear search operations.");
                    return; // This will exit the linearSearchMenu loop
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (true);
    }
    private static void linearSingleSearch(Scanner sc) {
        // Implement the linearSingleSearch method  
        System.out.println("Enter the element you want to search:");
        x = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < N; i++) {
            if (A[i] == x) {
                found = true;
                break; 
            }
        }

        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
   }
    private static void linearMultiSearch(Scanner sc) {
        // Implement the linearMultiSearch method
        int count=0;
        System.out.println("enter the item you want to search:");
        x=sc.nextInt();
        for(int i=LB; i<N+LB-1;i++){
            if(A[i]==x){
                count=count+1;
        }}
       if (count==0){
            System.out.println("element not found");}
        
            System.out.println(x+"found"+count+"times");
       
    }
    private static void binarySearchMenu(Scanner sc) {
        do {
            System.out.println("Which type of binary search do you want?");
            System.out.println("1-Binary single search");
            System.out.println("2-Binary multiple search");
            System.out.println("3-Exit");
            int binarySearchChoice = sc.nextInt();

            switch (binarySearchChoice) {
                case 1:
                    binarySingleSearch(sc);
                    break;
                case 2:
                    binaryMultiSearch(sc);
                    break;
                case 3:
                      System.out.println("Exiting searching operations.");
                    return;}}
                while(true);}
     private static void binarySingleSearch(Scanner sc)  {
 System.out.println("enter the element you want to search:");
    x=sc.nextInt();
    int L=LB;
    int H=N+LB-1;
    int mid;
 while(L<=H){
   mid=(L+H)/2;
    if (A[mid]==x){
        System.out.println(x+"found");
        return;
    }
    else if(x<A[mid]){
        H=mid-1;
    }
    else{
        L=mid+1;
    }  }
    System.out.println("element not found");
     } 
     private static void binaryMultiSearch (Scanner sc)   {
        int L=LB;
        int count=0;
        int H=N+LB-1;
        System.out.println("enter the element you want to search:");
        x=sc.nextInt();
        int mid;
        while(L<=H){
             mid=(L+H)/2;
            if(A[mid]==x){
               count= count+1;
               int i=mid+1;
                while(i<=H&&A[i]==x){
                    count=count+1;
                    i=i+1; 
                }
                i=mid-1;
                while(i>L&&A[i]==x){
                    count=count+1;
                    i=i-1;
               }
            }
            
            if(A[mid]<x){
                L=mid+1;
            }
            else{
                H=mid-1;
            }

        }
         System.out.print(x+"found"+count+"times");
               return;
     } 
    private static void sortMenu(Scanner sc)  {
        do{
         System.out.println("Which type of sorting do you want?");
            System.out.println("1-bubble sort");
            System.out.println("2-insertion sort");
            System.out.println("3-selection sort");
            System.out.println("4-shell sort");
            System.out.println("5-merge sort");
            System.out.println("6-quick sort");
            System.out.println("7-Exit");
            int sortChoice = sc.nextInt();

            switch (sortChoice) {
                case 1:
                    bubbleSort(sc);
                    break;
                case 2:
                    insertionSort(sc);
                    break;
                case 3:
                    selectionSort(sc); 
                    break; 
                case 4:
                    shellSort(sc);
                    break;
                case 5:
                    mergeSort(sc) ;
                    break;
                case 6:
                    quickSort(sc);
                    break;  
                case 7:
                    System.out.println("Exiting searching operations.");
                    return; // This will exit the searchMenu loop
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (true);   
        
    }        
    private static void bubbleSort(Scanner sc){
         do {
            System.out.println("Which type of bubble sort do you want?");
            System.out.println("1-bubble sort in ascending order");
            System.out.println("2-bubble sort in descending order");
            System.out.println("3-Exit");
            int bubblesortChoice = sc.nextInt();

            switch (bubblesortChoice) {
                case 1:
                    bubbleSortInAscendingOrder(sc);
                    break;
                case 2:
                   bubbleSortInDescendingOrder(sc);
                    break;
                case 3:
                    System.out.println("bubble operations.");
                    return; // This will exit the linearSearchMenu loop
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (true);
    }
    private static void bubbleSortInAscendingOrder(Scanner sc){
        for(int i=0;i<N-1;i++){
    for(int j=0; j<N-1;j++){
        if(A[j]>A[j+1]){
            int temporary=A[j];
            A[j]=A[j+1];
            A[j+1]=temporary;
        }
    }
}
System.out.println("array in ascending order:");
for(int i=0;i<N;i++){
    System.out.println(A[i]+"");
}
    }
 private  static void bubbleSortInDescendingOrder(Scanner sc){
for(int i=N+LB-1; i>=LB;i--){
            for(int j=LB;j<N+LB-1;j++){
                if(A[j]>A[j+1]){
                    int temporary=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temporary;
                }
            }
        }
       System.out.println("array in descending order:");
        for(int i=N-1;i>=LB;i--){
           System.out.println(A[i]+"");
        }
    }
  private static void insertionSort(Scanner sc)  {
         do {
            System.out.println("Which type of insertion sort do you want?");
            System.out.println("1-insertion sort in ascending order");
            System.out.println("2-insertion sort in descending order");
            System.out.println("3-Exit");
            int insertionSortChoice = sc.nextInt();

            switch (insertionSortChoice) {
                case 1:
                    insertionSortInAscendingOrder(sc);
                    break;
                case 2:
                   insertionSortInDescendingOrder(sc);
                    break;
                case 3:
                    System.out.println("insertion sort operations.");
                    return; // This will exit the linearSearchMenu loop
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (true);
  }
  private static void insertionSortInAscendingOrder(Scanner sc){
  int LB=0;
        int last=LB+1;
        for(int i=last;i<=N+LB-1;i++){
            int min=A[last];
           int j=last-1;
            while(j>=LB&&A[j]>min){
                A[j+1]=A[j];
                j=j-1;
            }
            A[j+1]=min;
            last=last+1;}
            System.out.println("sorted array");
        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
  }  
private static void insertionSortInDescendingOrder(Scanner sc){
        int LB=0;
        int last=LB+1;
        for(int i=last;i<=N+LB-1;i++){
            int max=A[last];
             int j=last-1;
            while(j>=LB && A[j]<max){
                A[j+1]=A[j];
                j=j-1;
            }
            A[j+1]=max;
           last=last+1;
        }
      
      for(int i=0;i<N;i++)
        {
           System.out.println("sorted array="+A[i]+" ");
        }
    }
      private static void selectionSort(Scanner sc)  {
         do {
            System.out.println("Which type of selection sort do you want?");
            System.out.println("1-selection sort in ascending order");
            System.out.println("2-selection sort in descending order");
            System.out.println("3-Exit");
            int selectionSortChoice = sc.nextInt();

            switch (selectionSortChoice) {
                case 1:
                    selectionSortInAscendingOrder(sc);
                    break;
                case 2:
                   selectionSortInDescendingOrder(sc);
                    break;
                case 3:
                    System.out.println("selection sort operations.");
                    return; // This will exit the linearSearchMenu loop
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (true);
  }
  private static void selectionSortInAscendingOrder(Scanner sc){
       for(int i=LB;i<N-1;i++){
 int minloc=i;
 for(int k=i+1;k<N;k++){
     if (A[k]<A[minloc]){
         minloc=k;
     }}
   int temporary=A[minloc];
   A[minloc]=A[i];
   A[i]=temporary;
 }
 System.out.println("print sorted array");
 for(int i=0;i<N;i++){
     System.out.println(A[i]+" ");
 }
  }
 private static void selectionSortInDescendingOrder(Scanner sc){
        for(int i=LB;i<N-1;i++){
 int maxloc=i;
 for(int k=i+1;k<N;k++){
    if(A[maxloc]<A[k]){
        maxloc=k;
    }
 }
 int temporary=A[maxloc];
 A[maxloc]=A[i];
 A[i]=temporary;
}
 System.out.println("print sorted array");
 for(int i=0;i<N;i++){
     System.out.println(A[i]+" ");
 
 }}
 private static void shellSort(Scanner sc){
   do {
            System.out.println("Which type of shell sort do you want?");
            System.out.println("1-shell sort in ascending order");
            System.out.println("2-shell sort in descending order");
            System.out.println("3-Exit");
            int shellSortChoice = sc.nextInt();

            switch (shellSortChoice) {
                case 1:
                    shellSortInAscendingOrder(sc);
                    break;
                case 2:
                   shellSortInDescendingOrder(sc);
                    break;
                case 3:
                    System.out.println("shell sort operations.");
                    return; // This will exit the linearSearchMenu loop
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (true);
  }
 private static void shellSortInAscendingOrder(Scanner sc){
    int gap=(int)(N/2);
    while(gap!=0){
        for(int Last=LB+gap;Last<=N+LB-1;Last++){
            int max=A[Last];
            int j=Last-gap;
            while(j>=LB&&A[j]>max){
                A[j+gap]=A[j];
                j=j-gap;
            }
            A[j+gap]=max;
    }
    gap=(int)(gap/2);
}
for(int i =0; i<=N-1;i++){
    System.out.println(A[i]);
}}
private static void  shellSortInDescendingOrder(Scanner sc){
   int gap=(int)(N/2);
    while (gap!=0) {
    for(int last=LB+gap;last<=N+LB-1;last++){
        int max=A[last];
        int j=last-gap;
        while(j>=LB&&A[j]<max){
            A[j+gap]=A[j];
            j=j-gap;
        }
        A[j+gap]=max; 
    }
          gap=(int)(gap/2);
        }
    
    for(int j =0; j<N;j++){
        System.out.println(A[j]);
    }
}
private static void mergeSort(Scanner sc){
   do {
            System.out.println("Which type of merge sort do you want?");
            System.out.println("1-merge sort in ascending order");
            System.out.println("2-merge sort in descending order");
            System.out.println("3-Exit");
            int mergeSortChoice = sc.nextInt();

            switch (mergeSortChoice) {
                case 1:
                    mergeSortInAscendingOrder(sc);
                    break;
                case 2:
                   mergeSortInDescendingOrder(sc);
                    break;
                case 3:
                    System.out.println("merge sort operations.");
                    return; // This will exit the linearSearchMenu loop
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (true);
}
private static void mergeSortInAscendingOrder(Scanner sc){
    mergeSort_sub(A,0,N-1);
    for(int i=0;i<N;i++)
    {
System.out.println(A[i]);
    }
    System.out.println();
 }
public static void merge(int A[], int low, int mid, int high) {
 int merged[]=new int[high-low+1];
 int nL=low;
 int nR=mid+1;
 int k=0;
 while(nL<=mid && nR<=high){
     if (A[nL]<=A[nR]){
         merged[k++]=A[nL++];
     }
     else{
         merged[k++]=A[nR++];
     }
 }
 while (nL<=mid) {
   merged[k++]=A[nL++];  
 }
 while(nR<=high){
     merged[k++]=A[nR++];
 }
 for(int i=0, j=low; i<merged.length;i++,j++){
     A[j]=merged[i];
 }}
public static void mergeSort_sub(int A[], int low, int high) {
 if (low >= high) {
     return;
 }
     int mid = low + (high - low) / 2;
     mergeSort_sub(A, low, mid);
     mergeSort_sub(A, mid + 1, high);
     merge(A, low, mid, high);
 }
private static void mergeSortInDescendingOrder(Scanner sc){

    mergeSort_sb(A,0,N-1);
    for(int i=0;i<N;i++)
    {
System.out.println(A[i]);
    }

}
public static void mergD(int A[], int low, int mid, int high) {
 int mergeR[]=new int[high-low+1];
 int nL=low;
 int nR=mid+1;
 int k=0;
 while(nL<=mid && nR<=high){
     if (A[nL]>=A[nR]){// change can convert as/ds
         mergeR[k++]=A[nL++];
     }
     else{
         mergeR[k++]=A[nR++];
     }
 }
 while (nL<=mid) {
   mergeR[k++]=A[nL++];  
 }
 while(nR<=high){
     mergeR[k++]=A[nR++];
 }
 for(int i=0, j=low; i<mergeR.length;i++,j++){
     A[j]=mergeR[i];
 }}
public static void mergeSort_sb(int A[], int low, int high) {
 if (low >= high) {
     return;
 }
     int mid = low + (high - low) / 2;
     mergeSort_sb(A, low, mid);
     mergeSort_sb(A, mid + 1, high);
     mergD(A, low, mid, high);
 }
private static void quickSort(Scanner sc){
   do {
            System.out.println("Which type of quick sort do you want?");
            System.out.println("1-quick sort in ascending order");
            System.out.println("2-quick sort in descending order");
            System.out.println("3-Exit");
            int quickSortChoice = sc.nextInt();

            switch (quickSortChoice) {
                case 1:
                    quickSortInAscendingOrder(sc);
                    break;
                case 2:
                   quickSortInDescendingOrder(sc);
                    break;
                case 3:
                    System.out.println("quick sort operations.");
                    return; // This will exit the linearSearchMenu loop
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (true);
}
private static void quickSortInAscendingOrder(Scanner sc){
    quickSortA(A, 0, N-1);
    for(int i=0;i<N;i++){
        System.out.println(A[i] +"");
    }
System.out.println();
}
public static int partition (int A[],int low ,int high){
    int pivot=A[high];
    int i=low-1;
    for(int j=low;j<high;j++){
if(A[j]<pivot){
i++;
int tem=A[i];
A[i]=A[j];
A[j]=tem;
}
    }
    i++;
    int tem=A[i];
    A[i]=pivot;
    A[high]=tem;
    return i;
}
public static void quickSortA(int A[],int low,int high){
if(low<high){
int pivot=partition(A,low,high);
quickSortA(A, low, pivot-1);
quickSortA(A, pivot+1, high);
}
}
private static void quickSortInDescendingOrder(Scanner sc){
    quickSortInD( 0, N-1);
    for(int i=0;i<N;i++){
        System.out.println(A[i] +"");
    }
System.out.println();
}
static void quickSortInD(int low,int high){
if(low<high){
int index=partitionD(low,high);
quickSortInD(low, index-1);
quickSortInD( index+1, high);
}
}
public static int partitionD (int low ,int high){
    int pivot=A[high];
    int i=low-1;
    for(int j=low;j<high;j++){
if(A[j]>=pivot){
i++;
int tem=A[i];
A[i]=A[j];
A[j]=tem;
}
    }
    int tem=A[i+1];
    A[i+1]=pivot;
    A[high]=tem;
    return i+1;
}
 public static void stackOperations(Scanner sc) {
    // System.out.println("enter the size of stack");
    // N=sc.nextInt();
    do {
         
        displayStackMenu();
        stackChoice = sc.nextInt();

        switch (stackChoice) {
            case 1:
               stackArray(sc);
           // StackTraverse(sc);
                break;

            case 2:
               stackLL(sc);
            //stackPush(sc);
                break;

            case 3:
                // Traverse/Display stack
               // StackPop(sc);
               stackDLL(sc);
                break;

            case 4:
                System.out.println("Exiting stack operations.");
                break;

            default:
                System.out.println("Invalid choice. Please choose again.");
        }
    } while (stackChoice != 4);
}

public static void displayStackMenu() {
    System.out.println("Stack Operations Menu");
    System.out.println("1. Stack Implemented on array");
    System.out.println("2. stack implemented on Single linkedlist");
    System.out.println("3. stack implemented on Double Linkedlist");
    System.out.println("4. Exit");
    System.out.println("Enter your choice: ");
}
public static void stackArray(Scanner sc){

    stackArray.Stackarray ();
   do{
        stackArrayDisplay();
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
            stackArray.stackPushA();
                break;
            case 2:
            stackArray.stackPopA();
                break;
            case 3:
            stackArray.stackTraverseA();
                break;
            case 4:
            System.out.println("Exiting stack operations.");
                break;
            default:
            System.out.println("Invalid choice. Please choose again.");
                
        }
    }while(true);
}
public static void stackArrayDisplay(){
System.out.println(" stack implemented on array");
System.out.println("1- push in stack");
System.out.println("2-pop in stack");
System.out.println("3-traverse");
System.out.println("4-exit");
System.out.println("enter your choice");
}
public static void stackLL(Scanner sc){
    do{
        stackLLDisplay();
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
            stackLL.stackPushSLL(sc);
                break;
            case 2:
            stackLL.stackPopSLL();
                break;
            case 3:
            stackLL.stackTraverseSLL();
                break;
            case 4:
            System.out.println("Exiting stack operations.");
                break;
            default:
            System.out.println("Invalid choice. Please choose again.");
                
        }
    }while(true);
}
public static void stackLLDisplay(){
    System.out.println(" stack implemented on single linkedlist");
    System.out.println("1- push in stack");
    System.out.println("2-pop in stack");
    System.out.println("3-traverse");
    System.out.println("4-exit");
    System.out.println("enter your choice");
    }
    public static void stackDLL(Scanner sc){
        do{
            stackDLLDisplay();
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                stackDLL.stackPushDLL(sc);
                    break;
                case 2:
                stackDLL.stackPopDLL();
                    break;
                case 3:
                stackDLL.stackTraverseDLL();
                    break;
                case 4:
                System.out.println("Exiting stack operations.");
                    break;
                default:
                System.out.println("Invalid choice. Please choose again.");
                    
            }
        }while(true);
    }
    public static void stackDLLDisplay(){
        System.out.println(" stack implemented on DOUBLE linkedlist");
        System.out.println("1- push in stack");
        System.out.println("2-pop in stack");
        System.out.println("3-traverse");
        System.out.println("4-exit");
        System.out.println("enter your choice");
        }
public static void QueueOperations(Scanner sc){
do{
    QueueOperationsDisplay();
    int choice=sc.nextInt();
    
        switch (choice) {
            case 1:
            QueueArray(sc);
                break;
        case 2:
           QueueSLL(sc);
           break;
        case 3:
           QueueDLL(sc);
           break;
        case 4:
           System.out.println("exit to back menu");
            default:
                break;
        
    }
}while(true);
} 
public static void QueueOperationsDisplay(){
System.out.println("1-queue implemented on Array");
System.out.println("2-queue implemented on SINGLE Linkedlst");
System.out.println("3-queue implemented on double linkedlist");
System.out.println("4-exit");
}
    public static void QueueArray(Scanner sc) {
        do {
            queueArrayDisplay();
            int queuechoice = sc.nextInt();

            switch (queuechoice) {
                case 1:
                 simpleQueueArray(sc);
                    break;
                case 2:
                  circularQueueArray(sc);
                    break;
                case 3:
                    System.out.println("Exiting queue operations. Returning to the main menu.");
                    return; // This will exit the queueOperations loop
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (true);
    }
    public static void queueArrayDisplay() {
        System.out.println("1-simple queue");
        System.out.println("2-circular queue");
        System.out.println("3-exit");
    }
 public static void simpleQueueArray(Scanner sc){
    simpleQueueArray.Queue() ;
    do{
        simpleQueueADisplay();
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
            simpleQueueArray.TraverseSQA();
                //SqueueATraverse(sc);
                break;
            case 2:
            simpleQueueArray.EnqueueA( );
               // SqueueAPush(sc);
                break;
            case 3:
            simpleQueueArray.DequeueA(); 
            //SqueueAPop(sc);
            break;
            case 4:
            System.out.println("exit");
            return;
            default:
            System.out.println("invalid choice");
                break;
        }
    }
    while(true);
 }
 public static void simpleQueueADisplay(){
        System.out.println("1-traverse queue");
        System.out.println("2-push queue");
        System.out.println("3-pop queue");
        System.out.println("4-exit");
 }
 public static void circularQueueArray(Scanner sc){
    circularQueueArray.Queue();
    do{
        circularQueueADisplay();
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
            circularQueueArray.TraverseCQA();
                break;
            case 2:
            circularQueueArray.EnqueueCQA( );
                break;
            case 3:
            circularQueueArray.DequeueCQA(); 
            break;
            case 4:
            System.out.println("exit");
            return;
            default:
            System.out.println("invalid choice");
                break;
        }
    }
    while(true);
    
 }
 public static void circularQueueADisplay(){
        System.out.println("1-traverse queue");
        System.out.println("2-push queue");
        System.out.println("3-pop queue");
        System.out.println("4-exit");
 }

public static void  QueueSLL(Scanner sc){
    
        
    do{
        QueueSLLDisplay();
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
            QueueSLL.TraverseSQSLL();
                break;
            case 2:
            QueueSLL.EnqueueSLL( );
                break;
            case 3:
            QueueSLL.DequeueSLL(); 
            break;
            case 4:
            System.out.println("exit");
            return;
            default:
            System.out.println("invalid choice");
                break;
        }
    }
    while(true);
 }
 public static void QueueSLLDisplay(){
        System.out.println("1-traverse queue");
        System.out.println("2-push queue");
        System.out.println("3-pop queue");
        System.out.println("4-exit");
 }
 

public static void QueueDLL(Scanner sc){
    System.out.print("Enter the size of the queue: ");
        size = sc.nextInt();
        A = new int[size];
        
    do{
        QueueDLLDisplay();
        int choice=sc.nextInt();
        switch (choice) {
            case 1:
            QueueDLL.TraverseSQDLL();
                //SqueueATraverse(sc);
                break;
            case 2:
            QueueDLL.enqueueDLL();
               // SqueueAPush(sc);
                break;
            case 3:
            QueueDLL.dequeueDLL(); 
            //SqueueAPop(sc);
            break;
            case 4:
            System.out.println("exit");
            return;
            default:
            System.out.println("invalid choice");
                break;
        }
    }
    while(true);
 }
 public static void QueueDLLDisplay(){
        System.out.println("1-traverse queue");
        System.out.println("2-push queue");
        System.out.println("3-pop queue");
        System.out.println("4-exit");
 }

     public static void linkedListOperations(Scanner sc) {
        do {
            linkedlistDisplay();
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    linkedlist(sc);
                    break;
                case 2:
                      Double_linkedlist(sc);
                    break;
                case 3:
                    System.out.println("Exiting linked list operations. Returning to the main menu.");
                    return; // This will exit the linkedListOperations loop
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (true);
    }
    public static void linkedlistDisplay(){
        System.out.println("1-single linked list");
        System.out.println("2-double linkedlist");
        System.out.println("3-exit");
    }
     public static void  linkedlist(Scanner sc){
        
      
        do{
            Single_linkedListDisplay();
            int choice =sc.nextInt();
            switch(choice){
                case 1:
                insertionOpertionSLL(sc);
                break;
                case 2:
                deletionOperationSLL(sc);
                break;
               case 3:
                insertion_AtMiddle_SLL(sc);
                break;
                case 4:
                    System.out.println("Exiting linked list operations. Returning to the main menu.");
                    return; // This will exit the linkedListOperations loop
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (true);
    }
    public static void Single_linkedListDisplay() {
        System.out.println("Linked list operations:");
        System.out.println("1.insertion");
        System.out.println("2. Deletion");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");}
    public static void insertionOpertionSLL(Scanner sc){
        do{
            DisplayInsertionSLL();
            int choice =sc.nextInt();
            switch(choice){
                case 1:
                SingleLL.insertion_AtFirst_SLL(sc);
                break;
                case 2:
                 SingleLL.insertion_AtLast_SLL(sc);
                break;
                case 3:
                 insertion_AtMiddle_SLL(sc);
                break;
                case 4:
                SingleLL.Traverse_SLL();
                break;
                case 5:
                    System.out.println("Exiting linked list operations. Returning to the main menu.");
                    return; // This will exit the linkedListOperations loop
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (true);
    }
    public static  void DisplayInsertionSLL(){
      System.out.println("Linked list operations:");
        System.out.println("1. insertion at first");
        System.out.println("2.insertion at last");
        System.out.println("3. insertion at middle");
        System.out.println("4. traverse");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");  
    }
    public static void insertion_AtMiddle_SLL(Scanner sc){
        do{
            DisplayInsertionMiddleSLL();
             int choice =sc.nextInt();
            switch(choice){
                case 1:
                SingleLL.insertion_AtMiddle_BGN_SLL(sc);
                break;
                case 2:
                SingleLL.insertion_AtMiddle_AGN_SLL(sc);
                break;
                case 3:
                SingleLL.insertion_AtExactMiddle_SLL(sc);
                break;
                case 4:
                SingleLL.insertion_InMiddle_Exact_Mid_AGN_SLL(sc);
                break;
                case 5:
                 SingleLL.Traverse_SLL();
                 break;
                case 6:
                    System.out.println("Exiting linked list operations. Returning to the main menu.");
                    return; // This will exit the linkedListOperations loop
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (true); 
        }
    public static  void DisplayInsertionMiddleSLL(){
      System.out.println("Linked list operations:");
        System.out.println("1. insertion in middle before given node");
        System.out.println("2.insertion in middle after  given node ");
        System.out.println("3. insertion at exact middle");
        System.out.println("4. insertion in exact  middle  after given node");
        System.out.println("5-traverse");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");  
    }
  public static void  deletionOperationSLL(Scanner sc){
      do{
           deletion_SLL_display();
            int choice =sc.nextInt();
            switch(choice){
                case 1:
                  SingleLL.Deletion_AtFirst_SLL();
                break;
                case 2:
                  SingleLL.Deletion_AtLast_SLL();
                break;
               case 3:
                    deletion_AtMiddle_SLL(sc);
                break;
                case 4:
                SingleLL.Traverse_SLL();
                break;
                case 5:
                    System.out.println("Exiting linked list operations. Returning to the main menu.");
                    return; // This will exit the linkedListOperations loop
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (true);
    }
        public static  void  deletion_SLL_display(){
      System.out.println("Linked list operations:");
        System.out.println("1. deletion at first");
        System.out.println("2. deletion at the end");
        System.out.println("3- deletion in middle");
       // System.out.println("4. deletion at exact middle");
        System.out.println("4- traverse ");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");  
    }
    public static void  deletion_AtMiddle_SLL(Scanner sc){
         do{
             deletionInMiddleDisplay_SLL();
                int choice=sc.nextInt();
                switch (choice) {
                    case 1:
                        SingleLL.Deletion_InMiddle_SearchNode_SLL(sc);
                        break;
                    case 2:
                        SingleLL.Deletion_InMiddle_ExactMiddleNode_SLL();
                    break;
                    case 3:
                     SingleLL. Traverse_SLL();
                   break;
                    case 4:
                    System.out.println("Exiting linked list operations. Returning to the main menu.");
                    return; 
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    
                }
            }while(true);
         }
        public static void  deletionInMiddleDisplay_SLL(){
            System.out.println("1-deletion in middle search node");
            System.out.println("2-deletion in  exact middle  node");
            System.out.println("3-traverse the linked list");
            System.out.println("4-returning to the back menu");
           }
    public static void  Double_linkedlist(Scanner sc){
        
       // insertionOpertionSLL(sc);
        do{
            Double_linkedListDisplay();
            int choice =sc.nextInt();
            switch(choice){
                case 1:
                insertionOpertionDLL(sc);
                break;
                case 2:
                 deletionOperationDLL(sc);
                break;
               case 3:
                insertion_AtMiddle_DLL(sc);
                break;
                case 4:
                    System.out.println("Exiting linked list operations. Returning to the main menu.");
                    return; // This will exit the linkedListOperations loop
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (true);
    }
    public static void Double_linkedListDisplay() {
        System.out.println("Linked list operations:");
        System.out.println("1.insertion");
        System.out.println("2. Deletion");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");}
    public static void insertionOpertionDLL(Scanner sc){
        //linkedlist(sc);
        do{
            DisplayInsertionDLL();
            int choice =sc.nextInt();
            switch(choice){
                case 1:
                DoubleLL.Insertion_AtFirst_DLL(sc);
                break;
                case 2:
                DoubleLL.Insertion_AtLast_DLL(sc);
                break;
                case 3:
                insertion_AtMiddle_DLL(sc);
                break;
                case 4:
                DoubleLL.Traverse_DLL();
                break;
                case 5:
                    System.out.println("Exiting linked list operations. Returning to the main menu.");
                    return; // This will exit the linkedListOperations loop
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (true);
    }
    public static  void DisplayInsertionDLL(){
      System.out.println("Linked list operations:");
        System.out.println("1. insertion at first");
        System.out.println("2.insertion at last");
        System.out.println("3. insertion at middle");
        System.out.println("4. Traverse");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");  
    }
      public static void insertion_AtMiddle_DLL(Scanner sc){
            do{
                insertInMiddleDisplay_DLL();
                int choice=sc.nextInt();
                switch (choice) {
                    case 1:
                       DoubleLL.Insertion_InMiddle_BGN(sc) ;
                        break;
                    case 2:
                    DoubleLL. Insertion_InMiddle_AGN(sc);
                     break;
                    case 3:
                        DoubleLL.Insertion_InMiddle_Exact_Mid_BGN_DLL(sc);
                    break;
                    case 4:
                        DoubleLL.Insertion_InMiddle_Exact_Mid_AGN_DLL(sc);
                    break;
                    case 5:
                       DoubleLL.Traverse_DLL();
                   break;
                    case 6:
                    System.out.println("Exiting linked list operations. Returning to the main menu.");
                    return; 
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    
                }
            }while(true);
        }
        public static void insertInMiddleDisplay_DLL(){
            System.out.println("1-insertion in middle before given node ");
            System.out.println("2- insertion in middle after given node");
            System.out.println("3-insertion in exact middle before given node");
            System.out.println("4-insertion in exact mid after given node");
            System.out.println("5-traverse linked list");
            System.out.println("6- returning to the back menu");
            System.out.println("7- exit");
        }
  public static void  deletionOperationDLL(Scanner sc){
      do{
            deletion_DLL_display();
            int choice =sc.nextInt();
            switch(choice){
                case 1:
                  DoubleLL.Deletion_AtFirst_DLL();
                break;
                case 2:
                 DoubleLL.Deletion_AtLast_DLL();
                break;
               case 3:
                deletion_AtMiddle_DLL(sc);
                break;
                case 4:
                    System.out.println("Exiting linked list operations. Returning to the main menu.");
                    return; 
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (true);
    }
        public static  void  deletion_DLL_display(){
      System.out.println("Linked list operations:");
        System.out.println("1. deletion at first");
        System.out.println("2. deletion at last");
        System.out.println("5. deletion at middle");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");  
    }

 public static void  deletion_AtMiddle_DLL(Scanner sc){
         do{
             deletionInMiddle_Display_DLL();
                int choice=sc.nextInt();
                switch (choice) {
                  //  case 1:
                   //     DoubleLL.deletionInMiddleBeforeNode_DLL();
                   //     break;
                  //  case 2:
                   //     DoubleLL.deletionInMiddleAfterNode_DLL();
                     case 1:   
                        DoubleLL.Deletion_InMiddle_ExactMiddleNode_DLL();
                    break;
                    case 2:
                    DoubleLL.Deletion_InMiddle_SearchNode_DLL(sc);
                    break;
                    case 5:
                    DoubleLL.Traverse_DLL();
                   break;
                    case 6:
                    System.out.println("Exiting linked list operations. Returning to the main menu.");
                    return; 
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    
                }
            }while(true);
         }
        public static void  deletionInMiddle_Display_DLL(){
            System.out.println("1-deletion at exact middle node");
            System.out.println("2-deletion at mid search node");
            System.out.println("3-traverse the linked list");
            System.out.println("4-returning to the back menu");
            System.out.println("5-exit");
        }
    }
