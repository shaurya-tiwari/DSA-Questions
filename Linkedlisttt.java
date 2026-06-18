import java.util.LinkedList;
// // operations = insert , delete , check size , print linked list.

// public class Linkedlisttt {
//     // creating node class in the
//     // list___________________________________________________
//     Node head;
//     private int size;

//     Linkedlisttt() {
//         this.size = 0;
//     }

//     class Node {
//         // store data , store next.
//         String data;
//         Node next; // next node

//         // create constructor
//         Node(String data) {
//             size++;
//             this.data = data;
//             this.next = null; // the next will bebydefoly null for every node.
//         }
//         // ______________________________________________________________________________
//     }

//     // (1): add - first.
//     public void addFirst(String data) {

//         // adding element on first position.
//         // creating node
//         Node newnode = new Node(data);
//         // if node dont exist
//         if (head == null) {
//             // asign the head to the new node
//             head = newnode;
//             return;
//         }
//         // if node exists
//         newnode.next = head;
//         head = newnode;
//     }

//     // (2): add -last
//     public void addLast(String data) {

//         // adding element on last position.
//         // creating new node
//         Node newnode = new Node(data);
//         if (head == null) {
//             head = newnode;
//             return;
//         }

//         // traverse on the list then change the null node to the new node an new node
//         // travelling on the linked list then update the nodes till the value touch last
//         Node currentNode = head; // NOTE: never cahnge the head of the list and take the head as current node
//         while (currentNode.next != null) { // traverse till the last node is not null.
//             currentNode = currentNode.next; // means the next value will the current value
//         }
//         // if it raches to the null
//         currentNode.next = newnode;

//     }

//     // print node
//     public void printList() {
//         if (head == null) {
//             System.out.println("list is empty");
//             return;
//         }
//         Node currentNode = head;
//         while (currentNode != null) {
//             System.out.print("[" + currentNode.data + "]" + "-");
//             currentNode = currentNode.next;
//         }
//         System.out.println("null");

//     }

//     // delete node
//     // when we shift the head of the list to another node then the previus will be
//     // removed forever

//     // (3): delete - first
//     public void deletefirst() {
//         if (head == null) {
//             System.out.println("list is empty");
//             return;
//         }
//         size--;
//         head = head.next; // shift the head to the next node.
//     }

//     // (4): delete - last
//     public void deletelast() {
//         if (head == null) {
//             System.out.println("list is empty");
//             return;
//         }
//         size--; // above the if
//         if (head.next == null) {
//             head = null;
//         }
//         // take the secondlast node and last node then tranverse the list
//         Node secondlastnode = head;
//         Node lastNode = head.next; // if the head .next is null then lastnode will be also null
//         while (lastNode.next != null) {
//             lastNode = lastNode.next;
//             secondlastnode = secondlastnode.next;
//         }
//         secondlastnode.next = null;
//     }

//     // size
//     public int getsize() {
//         return size;
//     }

//     public static void main(String[] args) {
//         // creating object of our linked list
//         Linkedlisttt ll = new Linkedlisttt();
//         ll.addFirst("a");
//         ll.addFirst("b"); // this will point to the "a " therefore the first element will be "b"-"a"
//         ll.addFirst("newa");

//         ll.addLast("lastnode");
//         ll.printList();

//         ll.deletefirst();
//         ll.printList();
//         // output :
//         // [newa]-[b]-[a]-[lastnode]-null
//         // [b]-[a]-[lastnode]-null
//         ll.deletelast();
//         ll.printList();
//         // [newa]-[b]-[a]-[lastnode]-null
//         // [newa]-[b]-[a]-null
//         System.out.println(ll.getsize());
//     }

// in build features for linked lists (collection framworkks )
// import collection framework (1)
public class Linkedlisttt {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        // add data
        linkedList.add("a");
        linkedList.add("b");
        System.out.println(linkedList);
        // add data at first and last
        linkedList.addFirst("first");
        linkedList.addLast("last");
        System.out.println(linkedList);
        // size
        System.out.println(linkedList.size());
        // get items 
        for(int i=0; i<linkedList.size(); i++){
            System.out.print(linkedList.get(i)+"-> ");
        }
        System.out.println("null"); // print after itration is over 
        // delete last and first elements
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);

        

    }
}



// public void solveLinkedListProblem(ListNode head) {
    
//     // STEP 1: Base Case (Safety Check)
//     // Hamesha check karein ki list khali toh nahi hai. Agar haan, toh wahin se wapas laut jayein.
//     if (head == null) {
//         return; 
//     }

//     // STEP 2: Dummy / Temp Pointer Banana (Golden Rule ⭐)
//     // Asli 'head' (engine) ko KABHI aage mat badhana, warna aap list ka starting point bhool jayenge.
//     // Hamesha ek duplicate pointer banayein chalne ke liye.
//     ListNode current = head; 

//     // STEP 3: Traversal Loop (List mein aage badhna)
//     // Jab tak humari list khatam nahi hoti (null nahi aata), tab tak loop chalayein.
//     while (current != null) {
        
//         // ---> YAHAN AAPKA MAIN LOGIC AAYEGA <---
//         // (Jaise print karna, count karna, ya check karna)
//         // System.out.println(current.val);

//         // STEP 4: Aage Badhna (Sabse zaroori line)
//         // Agar yeh line bhool gaye, toh infinite loop ban jayega!
//         current = current.next; 
//     }
// }