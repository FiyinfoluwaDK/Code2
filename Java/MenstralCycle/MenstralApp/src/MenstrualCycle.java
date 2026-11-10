import java.time.LocalDate;

public class MenstrualCycle {
    private final int cycleLength;

    public MenstrualCycle(int cycleLength) {
        this.cycleLength = cycleLength;
    }

    public String calculateNextPeriod(String lastPeriodDate) {
        return format(parse(lastPeriodDate).plusDays(cycleLength));
    }

    public int calculateOvulationDate(String lastPeriodDate) {
        return lastPeriodDate.plusDays(cycleLength - 14);
    }

    public String calculateFertileWindow(String lastPeriodDate) {
        LocalDate ovulationDate = parse(lastPeriodDate).plusDays(cycleLength - 14L);
        return format(ovulationDate.minusDays(5)) + " to " + format(ovulationDate.plusDays(1));
    }

    private LocalDate parse(String date) {
        return LocalDate.parse(date);
    }

    private String format(LocalDate date) {
        return date.toString();
    }
}
