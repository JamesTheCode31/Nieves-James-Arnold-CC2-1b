/*
 *James Arnold S. Nieves
 *December 4, 2024
 *Final Challenge No. 5
*/

import java.util.Scanner;

// Class representing a song in the playlist
class Song {
    String title;
    Song next;
    Song prev;

    public Song(String title) {
        this.title = title;
    }
}

// Class representing the playlist as a circular doubly linked list
class Playlist {
    private Song head = null;
    private Song tail = null;
    private Song current = null;

    // Add a song to the playlist
    public void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) { // If the playlist is empty
            head = newSong;
            tail = newSong;
            head.next = head;
            head.prev = head;
            current = head;
        } else {
            tail.next = newSong;
            newSong.prev = tail;
            newSong.next = head;
            head.prev = newSong;
            tail = newSong;
        }
        System.out.println("Song added: " + title);
    }

    // Remove a song from the playlist
    public void removeSong(String title) {
        if (head == null) { // If the playlist is empty
            System.out.println("Playlist is empty. Cannot remove song.");
            return;
        }

        Song temp = head;
        do {
            if (temp.title.equals(title)) {
                if (temp == head && temp == tail) { // If it's the only song
                    head = null;
                    tail = null;
                    current = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;

                    if (temp == head) head = temp.next;
                    if (temp == tail) tail = temp.prev;
                    if (temp == current) current = temp.next;
                }
                System.out.println("Song removed: " + title);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("Song not found: " + title);
    }

    // Move to the next song
    public void nextSong() {
        if (current != null) {
            current = current.next;
            System.out.println("Playing next song: " + current.title);
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    // Move to the previous song
    public void previousSong() {
        if (current != null) {
            current = current.prev;
            System.out.println("Playing previous song: " + current.title);
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    // Display the current song
    public void displayCurrentSong() {
        if (current != null) {
            System.out.println("Currently playing: " + current.title);
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    // Display all songs in the playlist
    public void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist is empty.");
            return;
        }

        System.out.println("Playlist:");
        Song temp = head;
        do {
            System.out.println("- " + temp.title);
            temp = temp.next;
        } while (temp != head);
    }
}

// Main class to manage user interaction
public class MusicPlaylistManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playlist playlist = new Playlist();

        while (true) {
            System.out.println("\nMusic Playlist Manager");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Show Current Song");
            System.out.println("4. Show Playlist");
            System.out.println("5. Move to Next Song");
            System.out.println("6. Move to Previous Song");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter song title to add: ");
                    String titleToAdd = scanner.nextLine();
                    playlist.addSong(titleToAdd);
                    break;
                case 2:
                    System.out.print("Enter song title to remove: ");
                    String titleToRemove = scanner.nextLine();
                    playlist.removeSong(titleToRemove);
                    break;
                case 3:
                    playlist.displayCurrentSong();
                    break;
                case 4:
                    playlist.displayPlaylist();
                    break;
                case 5:
                    playlist.nextSong();
                    break;
                case 6:
                    playlist.previousSong();
                    break;
                case 7:
                    System.out.println("Exiting Music Playlist Manager. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
