package Q5;

public class MyHashMap {
    private LinkedList[] buckets;
    private int amount;

    public MyHashMap() {
        this.amount = 10000;
        this.buckets = new LinkedList[amount];
        for(int i = 0; i < amount; i++){
            buckets[i] = new LinkedList();
        }
    }

    public void put(int key, int value) {
        int bucketId = hashCode(key);
        buckets[bucketId].get(key);
    }

    public int hashCode(int key) {
        return Integer.hashCode(key) % amount;
    }
}
