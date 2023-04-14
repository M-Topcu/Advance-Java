package generics;

public class G06doubleParameterGenerics {
    public static void main(String[] args) {
        //1 iki pm li generic class create din
        //2 getter seter const crete edin
        //3 main methoddan farkli tiplerde obj ler create ederek key value tipinde obj leri yazdirin

        DPGenClass<Integer,String> obj1 = new DPGenClass<>(1,"Mami");
        DPGenClass<Integer,String> obj2 = new DPGenClass<>(2,"Engin");

        System.out.println(obj1);
        System.out.println(obj2);

    }
}

class DPGenClass <T,V> {
    T key;
    V value;

    public DPGenClass(T key, V value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "DPGenClass{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}


