package MockPrepLLD1;

import java.util.HashMap;
import java.util.LinkedList;

public class CHashMap<K, V> {

        class HashNode {
            K key;
            V val;

            public HashNode(K key, V val) {
                this.key = key;
                this.val = val;
            }
        }

        private LinkedList<HashNode> buckets[];
        private int size;
        private final int dSize = 10;
        private final double thresoldVa = 0.7;

        public CHashMap() {
            buckets = new LinkedList[dSize];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
            size = 0;
        }

        public void put(K key, V val) {
            int hIndx = getHashIndx(key);
            HashNode hNode = checkHNodeExist(buckets[hIndx], key);
            if (hNode == null) {
                buckets[hIndx].addLast(new HashNode(key, val));
                size++;
            } else {
                hNode.val = val;
            }
            double loadFactor = (size * 1.0) / buckets.length;
            if (loadFactor > thresoldVa) {
                reHash();
            }
        }

        public boolean containsKey(K key) {
            int hIndx = getHashIndx(key);
            HashNode hNode = checkHNodeExist(buckets[hIndx], key);
            if (hNode == null) {
                return false;
            }
            return true;
        }

        public V get(K key) {
            int hIndx = getHashIndx(key);
            HashNode hNode = checkHNodeExist(buckets[hIndx], key);
            if (hNode != null) {
                return hNode.val;
            }
            return null;
        }

        public V remove(K key) {
            int hIndx = getHashIndx(key);
            HashNode hNode = checkHNodeExist(buckets[hIndx], key);
            if (hNode != null) {
                V val = hNode.val;
                buckets[hIndx].remove(hNode);
                size--;
                return val;
            }
            return null;
        }

        private int getHashIndx(K key) {
            int hashVal = Math.abs(key.hashCode());
            return (hashVal % buckets.length);
        }

        private HashNode checkHNodeExist(LinkedList<HashNode> list, K key) {
            for (HashNode hNode : list) {
                if (hNode.key.equals(key)) {
                    return hNode;
                }
            }
            return null;
        }

        private void reHash(){
            LinkedList<HashNode> oldBuckets[]=buckets;
            buckets=new LinkedList[oldBuckets.length *2];
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
            this.size=0;
            for(int i=0;i<oldBuckets.length;i++){
                for(HashNode hNode:oldBuckets[i]){
                    this.put(hNode.key,hNode.val);
                }
            }
        }


    /**
     *
     * @param <K>
     * @param <V>
     */
    class SimpleHashMap<K, V> {
        private static final int SIZE = 16;
        private LinkedList<Entry<K, V>>[] buckets;

        public SimpleHashMap() {
            buckets = new LinkedList[SIZE];
            for (int i = 0; i < SIZE; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int getBucketIndex(K key) {
            return key.hashCode() % SIZE;
        }

        public void put(K key, V value) {
            int index = getBucketIndex(key);
            LinkedList<Entry<K, V>> bucket = buckets[index];
            for (Entry<K, V> entry : bucket) {
                if (entry.key.equals(key)) {
                    entry.value = value;
                    return;
                }
            }
            bucket.add(new Entry<>(key, value));
        }

        public V get(K key) {
            int index = getBucketIndex(key);
            LinkedList<Entry<K, V>> bucket = buckets[index];
            for (Entry<K, V> entry : bucket) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
            return null;
        }

        public void remove(K key) {
            int index = getBucketIndex(key);
            LinkedList<Entry<K, V>> bucket = buckets[index];
            bucket.removeIf(entry -> entry.key.equals(key));
        }

        public boolean containsKey(K key) {
            int index = getBucketIndex(key);
            LinkedList<Entry<K, V>> bucket = buckets[index];
            for (Entry<K, V> entry : bucket) {
                if (entry.key.equals(key)) {
                    return true;
                }
            }
            return false;
        }

        private static class Entry<K, V> {
            K key;
            V value;

            Entry(K key, V value) {
                this.key = key;
                this.value = value;
            }

        }
    }

}



