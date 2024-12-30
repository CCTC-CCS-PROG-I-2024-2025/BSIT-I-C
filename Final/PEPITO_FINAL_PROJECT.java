import java.util.ArrayList;
import java.util.Scanner;

public class PEPITO_FINAL_PROJECT {
    
public class Main{
    static class Song {
        private String title;
        private String artist;

        public Song(String title, String artist) {
            this.title = title;
            this.artist = artist;
        }

        public String getTitle() {
            return title;
        }

        public String getArtist() {
            return artist;
        }

        public String toString() {
            return title + " by " + artist;
        }
    }

    static class MusicPlayer {
        private ArrayList<Song> playlist;

        public MusicPlayer() {
            this.playlist = new ArrayList<>();
        }

        public void addSong(Song song) {
            playlist.add(song);
        }

        public void displayPlaylist() {
            System.out.println("Available Songs:");
            for (int i = 0; i < playlist.size(); i++) {
                System.out.println((i + 1) + ". " + playlist.get(i));
            }
        }

        public void playSong(int songIndex) {
            if (songIndex >= 0 && songIndex < playlist.size()) {
                Song song = playlist.get(songIndex);
                System.out.println("Now playing: " + song);
                simulatePlayback(song);
            } else {
                System.out.println("Invalid selection. Please try again.");
            }
        }

        private void simulatePlayback(Song song) {
            try {
                System.out.println("Playing " + song.getTitle() + "...");
                Thread.sleep(3000); // Simulate 3 seconds of playback
                System.out.println("Finished playing: " + song.getTitle());
            } catch (InterruptedException e) {
                System.out.println("Playback interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MusicPlayer player = new MusicPlayer();

        // Adding some songs to the playlist
        player.addSong(new Song("Blinding Lights", "The Weeknd"));
        player.addSong(new Song("Shape of You", "Ed Sheeran"));
        player.addSong(new Song("Bohemian Rhapsody", "Queen"));
        player.addSong(new Song("Yesterday", "The Beatles"));

        boolean running = true;

        while (running) {
            System.out.println("\nOnline Music Player");
            System.out.println("1. View Playlist");
            System.out.println("2. Play a Song");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

        switch (choice) {
                case 1:
                    player.displayPlaylist();
                    break;
                case 2:
                    player.displayPlaylist();
                    System.out.print("Select a song number to play: ");
                    int songIndex = scanner.nextInt() - 1;
                    player.playSong(songIndex);
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting Online Music Player. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    scanner.close();
                }
            }
        }
   }
}