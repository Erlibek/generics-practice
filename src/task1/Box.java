package task1;

public class Box<K, T extends Fruit> {
    private K key;
    private T obj;

    public Box(K key, T obj) {
        this.key = key;
        this.obj = obj;
    }

    public K getKey() {
        return key;
    }

    public T getObj() {
        return obj;
    }

    @Override
    public String toString() {
        return "Box{" +
                "key=" + key +
                "; keyType = " + key.getClass().getName() +
                ", obj=" + obj +
                "; objType = " + obj.getClass().getName() +
                '}';
    }
}