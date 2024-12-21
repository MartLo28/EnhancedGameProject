import java.util.Scanner;

public class ProgramDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = SingletonTester.getGameInstance();
        boolean running = true;

        System.out.println("Welcome to the Interactive Game Test!");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1 - Start Game");
            System.out.println("2 - Update Score");
            System.out.println("3 - End Game");
            System.out.println("4 - Quit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    game.startGame();
                    break;
                case 2:
                    System.out.print("Enter points to add: ");
                    int points = scanner.nextInt();
                    game.updateScore(points);
                    break;
                case 3:
                    System.out.print("Enter player name: ");
                    String playerName = scanner.next();
                    Player player = new Player(playerName, game.hashCode()); // Simple unique ID
                    game.endGame(player);
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting the game. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
                    break;
            }
        }

        scanner.close();
    }
}