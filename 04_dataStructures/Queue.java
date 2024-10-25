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
        // queueclass qc = new queueclass(5);
        // queueclass.addElement(1);
        // queueclass.addElement(2);
        // queueclass.addElement(3);
        // queueclass.addElement(4);
        // queueclass.addElement(5);

        // System.out.println(queueclass.dequeue());
        // System.out.println(queueclass.dequeue());
        // System.out.println(queueclass.dequeue());
        // System.out.println(queueclass.dequeue());
        // System.out.println(queueclass.dequeue());
        // System.out.println(queueclass.peek());

      circularqueue cq=new circularqueue(5);
      cq.add(2);
      cq.add(9);
      cq.add(3);
      cq.add(5);
      cq.add(4);
      cq.deque();
      cq.deque();
      cq.add(100);
      cq.add(200);
      cq.deque();
      cq.deque();
      cq.deque();
      cq.deque();
      cq.deque();
      
    //   cq.peek();

    }

    static class circularqueue{
        int size;
        int arr[];
        int rear=-1,front=-1;
        circularqueue(int n){
            arr=new int[n];
            size=n;
        }
        public void add(int data){
            if((rear+1)%size ==front){
                System.out.println("CQ is full !");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1) % size;
            arr[rear]=data;
            System.out.println(arr[rear]+" added");
        }
        public void deque(){
            if(rear==-1 && front==-1){
                System.out.println("CQ is empty !");
                return;
            }
        // System.out.println(size);
        System.out.println(arr[front]+" removed");
        if(front==rear){
            front=rear=-1;
        }
        else{
        front=(front+1)%size;
        }}
        public void peek(){
            if(front==-1){
                System.out.println("CQ is empty !");
            }
            System.out.println(arr[front]);
        }
    }

    
}
