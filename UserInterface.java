import java.util.Scanner;

public class UserInterface {
    private RaceCommand command;
    private RaceSystem race_system;

    public void setCommand(RaceCommand command) {
        this.command = command;
    }

    public void run() {
        int numTeams = 0;
        int numDays = 0;
        int gameDuration = 0;
        int countryNames = 0;
        int animalNames = 0;
        int colorNames = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of teams participate in the events(max: 100): ");
        numTeams = scanner.nextInt();
        System.out.print("Please enter the number of days for the whole events(max: 1000): ");
        numDays = scanner.nextInt();
        System.out.print("Please enter the duration of a single game(minute): ");
        gameDuration = scanner.nextInt();
        System.out.print("Do you want to add random countries to team names(Enter: 1: Yes, 0 or other integer: No): ");
        countryNames = scanner.nextInt();
        System.out.print("Do you want to add random colors to team names(Enter: 1: Yes, 0 or other integer: No): ");
        colorNames = scanner.nextInt();
        System.out.print("Do you want to add random animals to team names(Enter: 1: Yes, 0 or other integer: No): ");
        animalNames = scanner.nextInt();

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
                race_system = new LeagueSystem(numTeams, numDays, gameDuration);
//                command = new GenerateCommand(new LeagueSystem(numTeams, numDays, gameDuration));
                break;
            case 2:
                race_system = new KnockoutSystem(numTeams, numDays, gameDuration);
//                command = new GenerateCommand(new KnockoutSystem(numTeams, numDays, gameDuration));
                break;
            case 3:
                race_system = new SwissRoundSystem(numTeams, numDays, gameDuration);
//                command = new GenerateCommand(new SwissRoundSystem(numTeams, numDays, gameDuration));
                break;
            default:
                System.out.println("Invalid input. Please enter a number from 1 to 3.");
                break;
        }
        command = new GenerateCommand(race_system);
        if(countryNames == 1){
            new AddCountryNamesCommand(race_system).execute();
        }
        if(colorNames == 1){
            new AddColorNamesCommand(race_system).execute();
        }
        if(animalNames == 1){
            new AddAnimalNamesCommand(race_system).execute();
        }
        if (command != null) {
            command.execute();
        }
    }
}

