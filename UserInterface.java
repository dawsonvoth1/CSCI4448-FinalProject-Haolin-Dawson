import java.util.Scanner;

public class UserInterface {

    public void run() {

        int numTeams = 0;
        int numDays = 0;
        int gameDuration = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of teams participate in the events(max: 100): ");
        numTeams = scanner.nextInt();
        System.out.print("Please enter the number of days for the whole events(max: 1000): ");
        numDays = scanner.nextInt();
        System.out.print("Please enter the duration of a single game(minute): ");
        gameDuration = scanner.nextInt();

        System.out.println("\nAvailable race systems:");
        System.out.println("1. League system");
        System.out.println("2. Knockout system");
        System.out.println("3. Swiss round system");
        System.out.print("Please enter the number to choose a race system");
        int raceSystem = 0;
        if (scanner.hasNextInt()) {
            raceSystem = scanner.nextInt();
        } else {
            System.out.println("Invalid input. Please enter an integer value.");
            return;
        }

        switch (raceSystem) {
            case 1:
                LeagueSystem league = new LeagueSystem(numTeams, numDays, gameDuration);
                league.generateSchedule();
                break;
            case 2:
                KnockoutSystem knockout = new KnockoutSystem(numTeams, numDays, gameDuration);
                knockout.generateSchedule();
                break;
            case 3:
                SwissRoundSystem swiss = new SwissRoundSystem(numTeams, numDays, gameDuration);
                swiss.generateSchedule();
                break;
            default:
                System.out.println("Invalid input. Please enter a number from 1 to 3.");
                break;
        }
    }
}