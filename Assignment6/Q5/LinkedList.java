package Q5;

import java.util.List;

public class LinkedList {
    ListNode fakeHead;
    ListNode fakeTail;

    public LinkedList(){
        fakeHead = new ListNode(-1, -1);
        fakeTail = new ListNode(-1, -1);
        fakeHead.next = fakeHead;
        fakeTail.prev = fakeTail;
    }

    public void insertToHead(int key, int value){
        ListNode existNode = search(key);
        if(existNode != null){
            existNode.value = value;
        }else{
            ListNode newNode = new ListNode(key, value);
            ListNode nextNode = fakeHead.next;
            fakeHead.next = nextNode;
            newNode.next = nextNode;
            nextNode.prev = newNode;
            newNode.prev = fakeHead;
        }
    }

    private ListNode search(int key){
        ListNode ne = fakeHead.next;
        while(ne != fakeTail){
            if(ne.key == key){
                return ne;
            }
            ne = ne.next;
        }
        return null;
    }

    public int get(int key){
        ListNode node = search(key);
        return node == null ? -1 : node.value;
    }

    public void remove(int key){
        ListNode cuNode = search(key);
        if(cuNode != null){
            ListNode prevNode = cuNode.prev;
            ListNode nextNode = cuNode.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
        }
    }
}
