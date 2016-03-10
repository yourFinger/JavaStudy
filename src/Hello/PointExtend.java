package Hello;

/**
 * Created by yourfinger on 16/1/16.
 */
public class PointExtend {
    private int _x;
    private int _y;
    private static int val;

    public PointExtend(int x, int y){
        _x = x;
        _y = y;
    }

    static {
        val += 1;
    }

    static {
        val += 2;
    }

    {
        _x += 1;
        _y += 1;
    }

    {
        _x += 2;
        _y += 2;
    }

    @Override
    public String toString(){
        return "x = " + _x + ", y = " + _y;
    }

    public static int getVal() {
        return val;
    }

    public static void main(String[] args){
        Point point = new Point(2, 4);
        System.out.println(point);
        System.out.println(getVal());
    }
}
