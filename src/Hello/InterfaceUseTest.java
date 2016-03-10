package Hello;

import java.lang.reflect.Method;

/**
 * Created by yourfinger on 16/1/20.
 */
public class InterfaceUseTest {
    public static void main(String[] args){
        System.out.println("generic interface test..");

        TestInterface<String> t1 = new ClassImpl1();
        t1.test("baba");

        for (Method method:
             t1.getClass().getMethods()) {
            if (method.getName() == "test"){
                String parameterName = method.getParameterTypes()[0].getName();
                System.out.println("Method name is " + parameterName);
            }
        }

        TestInterface<String> t2 = new ClassImpl2<String>();
        t2.test("baba");

        for (Method method:
             t2.getClass().getMethods()) {
            if (method.getName() == "test"){
                String parameterName = method.getParameterTypes()[0].getName();
                System.out.println("Method name is " + parameterName);
            }
        }
    }
}

interface TestInterface<T>{
    void test(T t);
}

class ClassImpl1 implements TestInterface<String>{

    @Override
    public void test(String s) {
        System.out.println(s);
    }
}

class ClassImpl2<T> implements TestInterface<T>{

    @Override
    public void test(T t) {
        System.out.println(t);
    }
}