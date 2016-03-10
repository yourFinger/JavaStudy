package Hello;

/**
 * Created by yourfinger on 16/1/19.
 */
public class GenericClassTest {


    public static void main(String[] args){
        GenericClass<Integer> t = new GenericClass<Integer>();
        t.setValue(2);

        System.out.println("generic class test..");
        System.out.println(t.getValue());

    }
}

class GenericClass<T>{
    private T _value;

    public void setValue(T value) {
        _value = value;
    }

    public T getValue() {
        return _value;
    }
}