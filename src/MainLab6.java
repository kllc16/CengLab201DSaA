public class MainLab6 {

    public static void main(String[] args) {
        QueueL6 qA = new QueueL6();
        QueueL6 qB = new QueueL6();
        QueueL6 qC = new QueueL6();

            // 1. Kuyrukları doldurma (Enqueue)
        System.out.println("--- 1. ADD QUEUE (Enqueue) ---");
        qA.enqueue(10);
        qA.enqueue(20);
        qA.enqueue(30);



        qB.enqueue(10);
        qB.enqueue(20);
        qB.enqueue(30);



        qC.enqueue(10);
        qC.enqueue(30); // Different element
        qC.enqueue(20);



        qA.display();
        qB.display();
        qC.display();
        System.out.println();



        // 2. FOUND İF THE METHOD İS EQUAL (areEqual)
        System.out.println("--- 2. QUEUE COMPARISON ---");
        System.out.println(" is qA and qB the same? (Expected: true): " + qA.areEqual(qA,qB));
        System.out.println(" is qA and qC the same? (Expected: false - Different order): " + qA.areEqual(qA,qC));




        qC.enqueue(40); // Different Size
        System.out.println("New Size of qC size: " + qC.size);
        System.out.println("is qA and qC the same? (Expected: false - Different size): " + qA.areEqual(qA,qC));
        System.out.println();

        // 3. Remove node from Queue (Dequeue)
        System.out.println("--- 3. Remove node from Queue (Dequeue) ---");
        int dequeuedVal = qA.dequeue(); // FIFO: deleted 10
        System.out.println("Deleted node from qA: " + dequeuedVal);
        qA.display();



        dequeuedVal = qB.dequeue(); // FIFO: deleted 10
        System.out.println("Deleted node from qB: " + dequeuedVal);


        // qA and qB QUEUE COMPARISON
        System.out.println("is qA and qB the same? (Expected: true)" + qA.areEqual(qA,qB));
    }

}
