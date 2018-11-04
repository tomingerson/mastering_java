package lecture;

/**
 * @author Created by tom on 06.10.2018.
 */
class CoffeeSize_PreJava5 {

    public static final CoffeeSize_PreJava5 BIG = new CoffeeSize_PreJava5("BIG", 0);
    public static final CoffeeSize_PreJava5 HUGE = new CoffeeSize_PreJava5("HUGE", 1);
    public static final CoffeeSize_PreJava5 OVERWHELMING = new CoffeeSize_PreJava5("OVERWHELMING",
            2);

    private String name;
    private int index;

    public CoffeeSize_PreJava5(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public static void main(String[] args) {
        System.out.println(CoffeeSize_PreJava5.BIG);
    }
}
