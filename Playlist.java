import java.util.ArrayList;

public class Assessment {
    private final ArrayList<String> playlist;
    private final int capacity;

    public Playlist(int capacity) {
        this.capacity = capacity;
        this.playlist = new ArrayList<>();
    }
    public void addSong(String song) {
        if (playlist.size() >= capacity) {
            playlist.remove(0);
        }
        playlist.add(song);
    }
    public void printPlaylist() {
        System.out.println("Current playlist: " + playlist);
    }

    public static void main(String[] args) {
        int capacity = 3;
        Playlist playlist = new Playlist(capacity);
        playlist.add("song1");
        playlist.add("song2");
        playlist.add("song3");
        playlist.printPlaylist(); 
        String[] newSongs = {"song4", "song1", "song2", "song3"};
        for (String newSong : newSongs) {
            System.out.println("Adding: " + newSong);
            playlist.add(newSong);
            playlist.printPlaylist();
        }
    }
}
