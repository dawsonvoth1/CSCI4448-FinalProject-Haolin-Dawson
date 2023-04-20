import java.util.ArrayList;
import java.util.List;

public abstract class RaceSystem {
    protected int numOfTeams;
    protected int numOfDays;
    protected int gameDuration;
    protected List<RaceObserver> observers;
    protected String schedule;

    public RaceSystem(int numOfTeams, int numOfDays, int gameDuration) {
        this.numOfTeams = numOfTeams;
        this.numOfDays = numOfDays;
        this.gameDuration = gameDuration;
        this.observers = new ArrayList<>();
    }
    public void addObserver(RaceObserver observer) {
        this.observers.add(observer);
    }

    public void notifyObservers() {
        for (RaceObserver observer : observers) {
            observer.update(schedule);
        }
    }

    public abstract void generateSchedule();

    public static RaceSystem createRaceSystem(String type, int numOfTeams, int numOfDays, int gameDuration) {
        if (type.equalsIgnoreCase("league")) {
            return new LeagueSystem(numOfTeams, numOfDays, gameDuration);
        } else if (type.equalsIgnoreCase("knockout")) {
            return new KnockoutSystem(numOfTeams, numOfDays, gameDuration);
        } else if (type.equalsIgnoreCase("swiss")) {
            return new SwissRoundSystem(numOfTeams, numOfDays, gameDuration);
        } else {
            throw new IllegalArgumentException("Invalid race system type");
        }
    }
}

class LeagueSystem extends RaceSystem {
    public LeagueSystem(int numOfTeams, int numOfDays, int gameDuration) {
        super(numOfTeams, numOfDays, gameDuration);
    }

    @Override
    public void generateSchedule() {
        StringBuilder sb = new StringBuilder();
        System.out.println("Simulation for " + numOfTeams + " teams over " + numOfDays + " days.");
        // Create an array of team names
        String[] teamNames = new String[numOfTeams];
        for (int i = 0; i < numOfTeams; i++) {
            teamNames[i] = "team" + (i + 1);
        }

        // Generate the schedule
        for (int day = 1; day <= numOfDays; day++) {
            System.out.println("Day " + day + ":");

            for (int i = 0; i < numOfTeams / 2; i++) {
                int leftIndex = i;
                int rightIndex = numOfTeams - i - 1;
                System.out.println(teamNames[leftIndex] + " vs " + teamNames[rightIndex]);
            }

            // Rotate the team names to create the next day's schedule
            String temp = teamNames[numOfTeams - 1];
            System.arraycopy(teamNames, 0, teamNames, 1, numOfTeams - 1);
            teamNames[0] = temp;
        }
        notifyObservers();
    }
}

class KnockoutSystem extends RaceSystem {
        public KnockoutSystem(int numOfTeams, int numDays, int gameDuration) {
            super(numOfTeams, numDays, gameDuration);
        }

        @Override
        public void generateSchedule() {
            System.out.println("Simulation for " + numOfTeams + " teams over " + numOfDays + " days.");

            // Create an array of team names
            String[] teamNames = new String[numOfTeams];
            for (int i = 0; i < numOfTeams; i++) {
                teamNames[i] = "team" + (i+1);
            }

            int numOfRounds = (int) Math.ceil(Math.log(numOfTeams) / Math.log(2));
            int numOfGames = numOfTeams / 2;

            for (int day = 1; day <= numOfRounds; day++) {
                System.out.println("Day " + day + ":");

                for (int i = 0; i < numOfGames; i++) {
                    int leftIndex = i * 2;
                    int rightIndex = leftIndex + 1;
                    System.out.println(teamNames[leftIndex] + " vs " + teamNames[rightIndex]);
                }

                // Reduce the number of matches by half for the next round
                numOfGames /= 2;
            }
            notifyObservers();
        }
    }


class SwissRoundSystem extends RaceSystem {
        public SwissRoundSystem(int numTeams, int numDays, int gameDuration) {
            super(numTeams, numDays, gameDuration);
        }

        @Override
        public void generateSchedule() {
            System.out.println("Simulation for " + numOfTeams + " teams over " + numOfDays + " days.");

            // Create an array of team names
            String[] teamNames = new String[numOfTeams];
            for (int i = 0; i < numOfTeams; i++) {
                teamNames[i] = "team" + (i+1);
            }

            int numOfGames = numOfTeams / 2;
            for (int day = 1; day <= numOfDays; day++) {
                System.out.println("Day " + day + ":");

                // Pair up teams based on their current ranking
                for (int i = 0; i < numOfGames; i++) {
                    int leftIndex = i;
                    int rightIndex = numOfTeams - i - 2;
                    System.out.println(teamNames[leftIndex] + " vs " + teamNames[rightIndex]);
                }

                // Rotate the team names to create the next round's pairings
                String temp = teamNames[numOfTeams - 1];
                System.arraycopy(teamNames, 0, teamNames, 1, numOfTeams - 1);
                teamNames[1] = temp;
            }
            notifyObservers();
        }
    }

