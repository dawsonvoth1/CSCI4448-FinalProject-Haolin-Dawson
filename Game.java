public class Game {

    private String gameName;
    private int duration; // in minutes

    public Game(String gameName, int duration) {
        this.gameName = gameName;
        this.duration = duration;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

