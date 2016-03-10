package Hello;


/**
 * Created by yourfinger on 16/1/19.
 */
public class GenericUseTest {
    private static<T> void puts(T item){
        put(item);
    }

    private static void put(Object item){
        System.out.println("Ojbect : " + item);
    }

    public static void main(String[] args){
        System.out.println("Generic use test");
        GenericUseTest.<String>puts("bb");
        put("bb");
    }
}
