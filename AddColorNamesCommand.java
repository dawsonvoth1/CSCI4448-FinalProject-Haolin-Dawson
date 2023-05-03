public class AddColorNamesCommand implements RaceCommand{
    private RaceSystem raceSystem;
    public AddColorNamesCommand(RaceSystem raceSystem) {
        this.raceSystem = raceSystem;
    }

    @Override
    public void execute() {
        for(int i=0; i< raceSystem.teams.size(); i++){
            Team t = new AddOnColorName(raceSystem.teams.get(i));
            raceSystem.teams.set(i, t);
        }
    }
}
