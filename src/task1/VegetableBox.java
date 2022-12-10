package task1;

public class VegetableBox<K, T extends Vegetable> {
    private K key;
    private T obj;

    public VegetableBox(K key, T obj) {
        this.key = key;
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public K getKey() {
        return key;
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