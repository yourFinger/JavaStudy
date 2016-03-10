package Hello;

/**
 * Created by yourfinger on 16/1/16.
 */
public class LabelUseTest {
    public static void main(String[] args){

        task:{
            int age = 24;

            System.out.print("start...");

            if (age < 30){
                break task;
            }

            System.out.print("end!");
        }
    }
}
