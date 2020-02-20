
package advanced.two;

import seven.abstraction.Shape;


public class ShapePair<K extends Number, V extends Shape> implements Pair<K, V>{
    
    private K key;
    private V value;

    public ShapePair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
    
}
