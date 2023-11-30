// UC1: hashtable class using linkedlist
public class HashTable<K extends Comparable<K>, V> extends LinkedList<K, V> {
    public HashTable() {
        super();
    }

    // similar to put method of hashmap
    public void put(K key, V value) {
        MyMapNode<K, V> node = super.search(key);
        if (node != null) {
            node.setValue(value);
            return;
        } else {
            super.add(key, value);
        }
    }

    // similar to get method of hashmap
    public V get(K key) {
        MyMapNode<K, V> node = super.search(key);
        if (node == null) {
            return null;
        }
        return node.getValue();
    }

    // similar to getordefault method of hashmap
    public V getOrDefault(K key, V default_value) {
        return this.get(key) == null ? default_value : this.get(key);
    }

    // similar to containskey method of hashmap
    public boolean containsKey(K key) {
        return super.search(key) != null;
    }
}
