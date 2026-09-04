import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class StreamingWatchTracker {

    private final List<Integer> trackerStreaming = new ArrayList<>();

    // NÍVEL 1
    public int addSession(int minutes) {
        trackerStreaming.add(minutes);
        return trackerStreaming.size();
    }

    public boolean cancelSession(int minutes) {
        return trackerStreaming.remove(Integer.valueOf(minutes));
    }

    // NÍVEL 2
    public Optional<Double> calculateAdRevenue() {
        if(trackerStreaming.isEmpty()) {
            return Optional.empty();
        }

        double totalRevenue = 0.0;

        for(int i : trackerStreaming) {
            if (i > 45) {
                totalRevenue += (i * 0.05);
            }
        }

        return Optional.of(totalRevenue);

    }

    // NÍVEL 3
    public Optional<Integer> getMedianSession() {
        if (trackerStreaming.isEmpty()) {
            return Optional.empty();
        }

        List<Integer> temp = new ArrayList<>(trackerStreaming);
        Collections.sort(temp);

        int median = (temp.size() - 1) / 2;
        return Optional.of(temp.get(median));

    }

    // NÍVEL 4
    public List<Integer> getEngagedSessions(int minMinutes) {
        List<Integer> results = new ArrayList<>();

        for(int i : trackerStreaming) {
            if (i > minMinutes) {
                results.add(i);
            }
        }

        return results;
    }
}