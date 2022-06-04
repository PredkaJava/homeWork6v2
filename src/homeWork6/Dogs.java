package homeWork6;

public class Dogs extends Animals {
    private static int dogCount;
    public Dogs(String name, int run, int swim) {
        super(name, run, swim, "Пёс");
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }
}
