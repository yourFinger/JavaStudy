package Hello;

/**
 * Created by yourfinger on 16/1/16.
 */
public class LongArgsUseTest {
    public static void main(String[] args){
        Printf("I ", "am ", "yourfinger!!");
        Printf(new String[]{ "I ", "am ", "yourfinger!!"});
    }

    private static void Printf(String... strings){
        for (String str : strings){
            System.out.print(str);
        }
        System.out.println();
    }
}
