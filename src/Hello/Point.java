package Hello;

/**
 * Created by yourfinger on 16/1/16.
 */
public class Point {
    private int _x;
    private int _y;

    public Point(int x, int y){
        this._x = x;
        this._y = y;
    }

    public Point(int x){
        this(x, x);
    }

    @Override
    public String toString(){
        return "x = " + _x + ", y = " + _y;
    }

    public static void main(String[] args){
        Point point = new Point(2, 3);

        System.out.println(point.toString());
        System.out.print(point);
    }
}
