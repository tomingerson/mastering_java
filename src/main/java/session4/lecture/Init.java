package session4.lecture;

class Init {

    static {
        System.out.println("1st static init");
    }

    static {
        System.out.println("2nd static init");
    }

    {
        System.out.println("1st instance init");
    }

    {
        System.out.println("2nd instance init");
    }

    Init(int x) {
        System.out.println("1-arg const");
    }

    Init() {
        System.out.println("no-arg const");
    }

    public static void main(String[] args) {
        new Init();
        System.out.println();
        new Init(7);
    }
}
