package me.projects.project.linked;

/**
 *
 * @author hrachyay
 */
public class Util {
    public static boolean isPolindrome(List list){
        if (list.isEmpty()) {
            return true;
        }
        
        Node tmp = list.getHead();
        
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }
    }
    
    public static int lengthOfLongestPolindrome(List list){
        return 0;
    }
}
