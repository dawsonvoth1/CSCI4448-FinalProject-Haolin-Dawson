public class AddAnimalNamesCommand implements RaceCommand{
    private RaceSystem raceSystem;
    public AddAnimalNamesCommand(RaceSystem raceSystem) {
        this.raceSystem = raceSystem;
    }

    @Override
    public void execute() {
        for(int i=0; i< raceSystem.teams.size(); i++){
            Team t = new AddOnAnimalName(raceSystem.teams.get(i));
            raceSystem.teams.set(i, t);
        }
    }
}
