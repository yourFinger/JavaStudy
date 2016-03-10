package Hello;

/**
 * Created by yourfinger on 16/1/16.
 */
public class EnumUseTest {
    public static void main(String[] args){
        System.out.println(State.ON);
        System.out.println(State.OFF);

        for (State state :
             State.values()) {
            System.out.println(state);
            System.out.println(State.valueOf(state.name()));
        }
    }
}

enum State{
    ON(1),

    OFF(2);

    int _value;

    State(int value){
        _value = value;
    }
}

enum OpenState{
    ON, OFF
}
