import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

interface RaceObserver {
    void update(String schedule);
}

class ResultExporter implements RaceObserver {
    private String fileName;

    public ResultExporter(String fileName) {
        this.fileName = fileName;
    }

    public void update(String schedule) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write(schedule);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

