package lecture;

enum CoffeeSizeExtended {
    BIG(8), HUGE(10), OVERWHELMING(16) {
        @Override
        public String getLidCode() {
            return "A";
        }
    };

    private int ounces;

    CoffeeSizeExtended(int ounces) {
        this.ounces = ounces;
    }

    public int getOunces() {
        return ounces;
    }

    public String getLidCode() {
        return "B";
    }
}

public class CoffeeExtended {
    CoffeeSizeExtended size;

    public static void main(String[] args) {
        CoffeeExtended drink1 = new CoffeeExtended();
        drink1.size = CoffeeSizeExtended.BIG;

        CoffeeExtended drink2 = new CoffeeExtended();
        drink2.size = CoffeeSizeExtended.OVERWHELMING;

        System.out.println(drink1.size.getOunces());
        System.out.println();
        for (CoffeeSizeExtended cse : CoffeeSizeExtended.values()) {
            System.out.println(cse + " " + cse.getOunces());
        }
    }
}
