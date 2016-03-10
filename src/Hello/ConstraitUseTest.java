package Hello;

import java.lang.reflect.Method;

/**
 * Created by yourfinger on 16/1/20.
 */
public class ConstraitUseTest {
    public static void main(String[] args){
        System.out.println("bound type parameters test..");
        Base<Dog> base = new Child();
        base.test(new Dog());

        for (Method method:
             base.getClass().getMethods()) {
            if (method.getName() == "test"){
                String parameterName = method.getParameterTypes()[0].getName();
                System.out.println("parameterName is " + parameterName);
            }
        }
    }
}

class Pet{

}

class Dog extends Pet{

}

class Base<T extends Pet>{
    public void test(T t){
        System.out.println("Base : " + t);
    }
}

class Child extends Base<Dog>{
    @Override
    public void test(Dog dog) {
        System.out.println("child : " + dog);
    }
}
