public class Song {
  private String songName;
  private String songGenre;
  private String songWriter;
 
  public Song(String a, String b, String c) {
    songName = a;
    songGenre = b;
    songWriter = c;
  }

  public String getSongInfo() {
    return "Song: " + songName + "\n" + "Genre: " + songGenre + "\n" + "Writer: " + songWriter + "\n";
  }

}
