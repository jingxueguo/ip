package duke;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Deadlines extends Task {
    protected LocalDate deadLine;

    public Deadlines(boolean isDone, String eventName, String deadLine) {
        super(isDone, eventName, "D");
        this.deadLine = LocalDate.parse(deadLine);
    }

    @Override
    public String toString() {
        return "[D] " + super.toString() + "(by: " + deadLine.format(DateTimeFormatter.ofPattern("MMM d yyyy")) + ")";
    }
}
