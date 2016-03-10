package Hello;

import java.io.IOException;

/**
 * Created by yourfinger on 16/1/18.
 */
public class ExceptionUseTest {
    public static void main(String[] args){
        try{
            Test(false);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void Test(boolean b) throws Exception {
        if (b){
            throw new Exception("Throw exception");
        }
        else{
            throw new IOException("Throw ioexception");
        }
    }
}
