/* We're going to make our own Contacts application! The application must perform two types of operations:

add name, where  is a string denoting a contact name. This must store  as a new contact in the application.
find partial, where  is a string denoting a partial name to search the application for. 
  It must count the number of contacts starting with  and print the count on a new line.

Given  sequential add and find operations, perform each operation in order.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.*;

public class Solution {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Node root = new Node();
        int n = in.nextInt();
        for(int a = 0; a < n; a++){
            String op = in.next();
            String contact = in.next();
            if(op.equals("add")){
                root.add(contact);
            }
            else {
                 System.out.println(root.findCount(contact, 0));
            }
        }
    }
    public static class Node{
        private static int NUMBER_OF_CHARACTERS = 26;
        Node[] children = new Node[NUMBER_OF_CHARACTERS];
        int size= 0;
        private Node getNode(char c){
            return children[getCharIndex(c)];
        }
        
        private int getCharIndex(char c){
            return c - 'a';
        }
           
        private void setNode(char c, Node node){
           children[getCharIndex(c)] = node;
        }
        private void add(String s){
            add(s, 0);
        }
        private void add(String s, int index) {
            size++;
            if(index == s.length())
                return;
            char current = s.charAt(index);
            int arrayPos = getCharIndex(current);
            Node child = getNode(current);
            if(child== null){
                child = new Node();
                setNode(current, child);
            }
            child.add(s,index+1);
        }

        public int findCount(String s, int index){
            if(s.length() == index){
                return size;
            }
            Node child = getNode(s.charAt(index));
            if(child == null)
                return 0;
            return child.findCount(s, index+1);
        }
      }
 
}
