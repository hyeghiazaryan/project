package me.projects.project.linked;

/**
 *
 * @author hrachyay
 */
public class List {
    private Node head = null;

    public List(Node head) {
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
}
