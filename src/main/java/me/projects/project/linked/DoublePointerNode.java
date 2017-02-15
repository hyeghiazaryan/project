package me.projects.project.linked;


/**
 *
 * @author hrachyay
 */
public class DoublePointerNode {
    private int value = Integer.MIN_VALUE;
    private DoublePointerNode next = null;
    private DoublePointerNode randonNode = null;

    public DoublePointerNode() {
    }
    
    public DoublePointerNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DoublePointerNode getNext() {
        return next;
    }

    public void setNext(DoublePointerNode next) {
        this.next = next;
    }

    public DoublePointerNode getRandonNode() {
        return randonNode;
    }

    public void setRandonNode(DoublePointerNode randonNode) {
        this.randonNode = randonNode;
    }
    
    
}
