package homeWork6;

public class Dogs extends Animals {
    private static int dogCount;
    public Dogs(String name) {
        super(name, 500, 10, "Пёс");
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }
}
