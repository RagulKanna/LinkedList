package Linkedlist;

public class Operations {

    public static LinkedList addoperation() {
        LinkedList linkedlist =new LinkedList();
        linkedlist.push(70);
        linkedlist.push(30);
        linkedlist.push(56);

        linkedlist.display();
        return linkedlist;

    }

    public static void appendoperation() {
        LinkedList linkedlist =new LinkedList();

        linkedlist.append(56);
        linkedlist.append(30);
        linkedlist.append(70);
        linkedlist.display();
    }

    public static void insertoperation() {
        LinkedList linkedlist =new LinkedList();
        linkedlist.push(70);
        linkedlist.push(56);
        linkedlist.display();
        linkedlist.insert(56,30);
        linkedlist.display();
    }

    public static void popfirstoperation() {
        LinkedList linkedlist = addoperation();
        linkedlist.popfirst();
        linkedlist.display();
    }

    public static void poplastoperation() {
        LinkedList linkedlist =addoperation();
        linkedlist.poplast();
        linkedlist.display();
    }

    public static void searchelement() {
        LinkedList linkedList=addoperation();
        System.out.print("\n Enter the value to find:");
        LinkedListMain.search=LinkedListMain.sc.nextInt();
        linkedList.searchelement(LinkedListMain.search);
    }

    public static void insertatspecificplace() {
        LinkedList linkedList = addoperation();
        System.out.println("\nBefore Inserting");
        linkedList.insert(LinkedListMain.afternode,LinkedListMain.addnode);
        linkedList.display();
        System.out.println("\nAfter inserting");
    }

    public static void deletenode(){
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(40);
        linkedList.push(30);
        linkedList.push(56);

        linkedList.delete(LinkedListMain.deletenode);

    }

    public static void sortnode(){
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(40);
        linkedList.push(30);
        linkedList.push(56);
        System.out.println("\n Before Sorting an list:");
        linkedList.display();
        linkedList.sort();
        System.out.println("\n After Sorting an list:");
        linkedList.display();
    }

    public static int searchtest(int value) {
        LinkedList linkedList=addoperation();
        int result;
        result = linkedList.searchelement(value);
        return result;
    }

    public static int inserttest(int nextnode,int newnode){
        LinkedList linkedList = addoperation();
        int result=linkedList.insert(nextnode,newnode);
        return result;
    }

    public static int deletetest(int deletenode){
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(40);
        linkedList.push(30);
        linkedList.push(56);
        int result=linkedList.delete(deletenode);
        return result;
    }
}
