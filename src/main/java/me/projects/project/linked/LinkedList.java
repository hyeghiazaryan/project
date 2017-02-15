package me.projects.project.linked;

/**
 *
 * @author hrachyay
 */
public class LinkedList {
    private Node head = null;

    public LinkedList() {
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    public Node getHead() {
        return head;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addToEnd(int value){
        if(head == null){
            head = new Node(value);
            return;
        }
        
        Node tmp = head;
        
        while(tmp.getNext() != null){
            tmp = tmp.getNext();
        }
        
        tmp.setNext(new Node(value));
    }
    
    public void addToStart(int value){
        if(head == null){
            head = new Node(value);
            return;
        }
        
        head = new Node(value, head);
    }
    
    public void addToSorted(int value){
        if (head == null || value < head.getValue()) {
            addToStart(value);
        }
        
        Node tmp = head;
        
        while((tmp.getNext() != null) && (value < tmp.getNext().getValue())){
            tmp = tmp.getNext();
        }
        
        Node node = new Node(value, tmp.getNext());
        tmp.setNext(node);
    }
    
    public void print(){
        Node tmp = this.getHead();
        while(tmp != null){
            System.out.println(tmp.getValue());
            tmp = tmp.getNext();
        }
    }
    
    public void reverse(){
        if (this.isEmpty()) {
            return;
        }
        
        Node prev = null;
        Node current = this.getHead();
        Node next = null;
        
        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        
        head = prev;
    }
}
