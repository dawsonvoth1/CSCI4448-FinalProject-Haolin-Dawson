public class GenerateCommand implements RaceCommand {
    private RaceSystem raceSystem;

    public GenerateCommand(RaceSystem raceSystem) {
        this.raceSystem = raceSystem;
    }

    @Override
    public void execute() {
        raceSystem.generateSchedule();
    }
}
