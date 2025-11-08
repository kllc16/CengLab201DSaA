public class QueueL6 {

    NodeL6 front, rear;
    int size;
    QueueL6(){
        front = rear = null;
        size = 0;
    }

    void enqueue(int data){
        NodeL6 newNode = new NodeL6(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;

    }

    int dequeue() {
        if (front == null) return -1;
        int val = front.data;
        front = front.next;
        if (front == null) rear = null;
        size--;
        return val;
    }

    boolean areEqual(QueueL6 q1, QueueL6 q2) {
        if (q1.size != q2.size) return false;

        NodeL6 curr1 = q1.front;
        NodeL6 curr2 = q2.front;

        while (curr1 != null && curr2 != null) {
            if (curr1.data != curr2.data) return false;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return true;
    }

    void display() {
        NodeL6 current = front;
        System.out.print("QUEUE, Size: " + size + "): ");

        if (current == null) {
            System.out.println("[EMPTY]");
            return;
        }

        while (current != null) {
            System.out.print(current.data);
            if (current == front) {
                System.out.print("(Front)");
            }
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

}
