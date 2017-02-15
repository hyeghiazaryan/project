package me.projects.project;

import me.projects.project.linked.LinkedList;
import me.projects.project.linked.Util;

/**
 *
 * @author hrachyay
 */
public class App {
    public static void main(String ... args){
        LinkedList linkedList = new LinkedList();
        linkedList.addToEnd(5);
        linkedList.addToEnd(5);
        linkedList.addToEnd(6);
        linkedList.addToEnd(7);
        linkedList.addToEnd(4);
        System.out.println(Util.lengthOfLongestPolindrome(linkedList));
    }
}
