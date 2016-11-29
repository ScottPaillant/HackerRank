/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.
*/

public static ArrayList<Node> list = new ArrayList<Node>();

boolean hasCycle(Node head) {
    if(head!=null){
        if(list.contains(head)){
            list.clear();
            return true;
        }
        else{
            list.add(head);
            return (hasCycle(head.next) && !false);
        }
    }
    else{
        list.clear();
        return false;

    }
        
}
