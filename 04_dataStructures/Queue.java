// Enque : Add element
// Dequeue :Remove element
// Front : Peek the font element

public class Queue {
    static class queueclass {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front;
        // no need front=-1, since in array default is 0;

        queueclass(int n) {
            arr = new int[n];
            size = n;
        }

        public static boolean isEmpty() {
            return (rear == -1);
        }

        public static boolean isFilled() {
            return (rear == size-1);
        }

        public static void addElement(int data) {
            if (isFilled()) {
                System.out.println("Queue is full");
                return;
            }
            rear+=1;
            arr[rear]=data;
            System.out.println(arr[rear]+" added");

        }

        public static int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            front=arr[0];
            // now for removal we will just move all the emenemts to left so that the its dequed!
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty..Nothing to peek! ");
                return -1;
            }
            return arr[front];
        }

       
    }
    public static void main(String args[]) {
        queueclass qc = new queueclass(5);
        queueclass.addElement(1);
        queueclass.addElement(2);
        queueclass.addElement(3);
        queueclass.addElement(4);
        queueclass.addElement(5);
        
        System.out.println(queueclass.dequeue());
        System.out.println(queueclass.dequeue());
        System.out.println(queueclass.dequeue());
        System.out.println(queueclass.dequeue());
        System.out.println(queueclass.dequeue());
        System.out.println(queueclass.peek());
    }


    
}
