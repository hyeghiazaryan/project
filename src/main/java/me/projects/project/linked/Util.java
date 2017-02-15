package me.projects.project.linked;

/**
 *
 * @author hrachyay
 */
public class Util {
    public static boolean isPolindrome(LinkedList list){
        if (list.isEmpty()) {
            return true;
        }
        
        Node tmp = list.getHead();
        
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }
        
        return true;
    }
    
    public static int lengthOfLongestPolindrome(LinkedList list){
        if (list.isEmpty()) {
            return 0;
        }
        
        int result = 0;
        Node prev = null;
        Node current = list.getHead();
        Node next = null;
        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            result = Math.max(result, 2*matchingSymbolsAtStrart(current, next));
            result = Math.max(result, 2*matchingSymbolsAtStrart(prev, next) + 1);
            prev = current;
            current = next;
        }
        
        return result;
    }
    
    private static int matchingSymbolsAtStrart(Node a, Node b){
        if (a == null || b == null || a.getValue() != b.getValue()) {
            return 0;
        }
        
        return 1 + matchingSymbolsAtStrart(a.getNext(), b.getNext());
    }
    
    public DoublePointerNode copyList(DoublePointerNode head){
        DoublePointerNode current = head;
        
        while (current != null) {
            DoublePointerNode newNode = new DoublePointerNode(current.getValue());
            newNode.setRandonNode(current.getRandonNode());
            current.setRandonNode(newNode);
            current = current.getNext();
        }
        
        current = head;
        DoublePointerNode copiedHead = head.getRandonNode();
        DoublePointerNode tmp;
        while (current != null) {
             if(current.getNext() != null){
                 current.getRandonNode().setNext(current.getNext().getRandonNode());
             }
             
             tmp = current.getRandonNode().getRandonNode();
             current.getRandonNode().setRandonNode(current.getRandonNode().getRandonNode().getRandonNode());
             current.setRandonNode(tmp);
             current = current.getNext();
         }
        
        return copiedHead;
    }
}
