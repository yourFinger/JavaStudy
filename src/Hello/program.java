package Hello;

/**
 * Created by yourfinger on 16/1/13.
 */
public class program {
    public static void main(String[] arg){
        float val = 0.22f;
        System.out.println("val = " + val);

        int val1 = 4 >>> 1;
        System.out.println("val1 = " + val1);

        String str1 = "yourfinger";
        String str2 = new String("yourfinger");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        StringBuffer strBuffer = new StringBuffer();
        strBuffer
                .append("I ")
                .append("am ")
                .append("yourfinger!");

        System.out.println(strBuffer.toString());

        String[] strArray = { "I ", "am ", "yourfinger!!"};
        for (String str : strArray){
            System.out.print(str);
        }
        System.out.println();


    }
}
