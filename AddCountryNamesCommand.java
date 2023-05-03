public class AddCountryNamesCommand implements RaceCommand{
    private RaceSystem raceSystem;
    public AddCountryNamesCommand(RaceSystem raceSystem) {
        this.raceSystem = raceSystem;
    }

    @Override
    public void execute() {
        for(int i=0; i< raceSystem.teams.size(); i++){
            Team t = new AddOnCountryName(raceSystem.teams.get(i));
            raceSystem.teams.set(i, t);
        }
    }
}
