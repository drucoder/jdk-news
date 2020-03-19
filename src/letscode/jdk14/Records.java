package letscode.jdk14;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Records {
    public static void demo() {
        var videos = new ArrayList<Video>() {{
            add(new Video(42l, "JDK 14 news"));
            add(new Video(43l, "Spring 6 news"));
        }};

        var playlist = new Playlist(12l, "Java news", videos);

        System.out.println(playlist);

        System.out.println(new Video(0l, "First one") == new Video(0l, "First one"));
        System.out.println(new Video(0l, "First one").equals(new Video(0l, "First one")));
    }
}

interface Indexable {
    long id();
}

// Но не могут быть сущностями Hibernate! потому что final
record Video(long id, String name) {
    public Video {
        var date = 0;
    }
}

record Playlist(
        long id,
        String name,
        List<Video> videos
) implements Indexable {
    public int length() {
        return videos.size();
    }
}
