public class SingletonTester {
    public static void main(String[] args) {
        // Retrieve GameService instances (should be the same)
        GameService service1 = GameService.getInstance();
        GameService service2 = GameService.getInstance();

        // Check if both references point to the same instance
        if (service1 == service2) {
            System.out.println("Singleton pattern works! Both services are the same instance.");
        } else {
            System.out.println("Singleton pattern failed! Different instances exist.");
        }
    }
}
