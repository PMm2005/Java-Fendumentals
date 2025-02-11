import java.util.HashMap;
import java.util.Map;

public class SongOrganizer {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();
        
        trackList.put("Track 1", "Lyrics for track 1...");
        trackList.put("Track 2", "Lyrics for track 2...");
        trackList.put("Track 3", "Lyrics for track 3...");
        trackList.put("Track 4", "Lyrics for track 4...");
        
        String songTitle = "Track 2";
        System.out.println("Lyrics for '" + songTitle + "': " + trackList.get(songTitle));
        
        System.out.println("\nAll Tracks:");
        for (Map.Entry<String, String> entry : trackList.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}