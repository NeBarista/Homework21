public class Main {
    public static void main(String[] args) {
        checkaggregateState(56);
        checkaggregateState(101);
        checkaggregateState(-15);
    }

    public static void checkaggregateState(int temp) {
        if (temp > 100) {
            System.out.println("steam");
        } else if (temp > 0) {
            System.out.println("water");
        } else {
            System.out.println("ice");
        }
    }
}