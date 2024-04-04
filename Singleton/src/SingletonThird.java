class SingletonFirst {
    private static volatile SingletonFirst instance;
    private SingletonFirst() {};
    public static SingletonFirst getInstance() {
        if (instance == null) {
            synchronized (SingletonFirst.class) {
                if (instance == null) instance = new SingletonFirst();
            }
        }
        return instance;
    }
}

class SingletonSecond {
    private static final SingletonSecond instance;
    static {
        try {
            instance = new SingletonSecond();
        }catch (Exception e) {
            throw  new RuntimeException("Exc created due to creating singleton instance");
        }
    }

    private  SingletonSecond() {}
    public static SingletonSecond getInstance() {
        return instance;
    }
}

public enum SingletonThird {

    INSTANCE;

}

class Main {

    public static void main(String[] args) {

        SingletonFirst a = SingletonFirst.getInstance();
        SingletonFirst b = SingletonFirst.getInstance();
        System.out.println(a == b);

        SingletonSecond c = SingletonSecond.getInstance();
        SingletonSecond d = SingletonSecond.getInstance();
        System.out.println(c == d);

        SingletonThird e = SingletonThird.INSTANCE;
        SingletonThird f = SingletonThird.INSTANCE;
        System.out.println(e == f);
    }
}
