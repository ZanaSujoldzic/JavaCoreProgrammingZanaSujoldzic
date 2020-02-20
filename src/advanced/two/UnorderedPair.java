
package advanced.two;

//BOUNDED GENERIC TYPE
public class UnorderedPair<K1 extends Number, V1> implements Pair<K1, V1>{
    
    private final K1 key;
    private final V1 value;

    public UnorderedPair(K1 key, V1 value) {
        this.key = key;
        this.value = value;
    }
    

    @Override
    public K1 getKey() {
        return key;
    }

    @Override
    public V1 getValue() {
        return value;
    }
    
    
    
    
}
