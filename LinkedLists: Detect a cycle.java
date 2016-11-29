/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.
*/

public static ArrayList<Node> seenNodes = new ArrayList<Node>();

boolean hasCycle(Node head) {
    if(head!=null){
        if(seenNodes.contains(head)){
            seenNodes.clear();
            return true;
        }
        else{
            seenNodes.add(head);
            return (hasCycle(head.next) && !false);
        }
    }
    else{
        seenNodes.clear();
        return false;

    }
        
}
