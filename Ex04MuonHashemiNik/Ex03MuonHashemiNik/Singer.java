public class Singer {

  private String name1;
  private String name2 = "";
  private int numberOfPerformances;
  private int numberOfPerformances2;
  private static int totalPerformances;
  private double earnings; 
  private Song favoriteSong;

  
  public void performForAudience(int a) {
    numberOfPerformances += 1;
    earnings += 100 * a;
  }

  public void performForAudience(int a, int b) {
    numberOfPerformances += 1;
    numberOfPerformances2 += 1;
    totalPerformances = numberOfPerformances + numberOfPerformances2;
    earnings = (earnings + 100*a) / b;
  }
   
  public void changeFavSong1(String a, String b, String c, String d) {
    favoriteSong = new Song(a, b, c);
    name1 = d;
    name2 = "";
  } 

  public void changeFavSong2(String a, String b, String c, String d, String e) {
    favoriteSong = new Song(a, b, c);
    name1 = d;
    name2 = e;
  } 
  

  public String getNames() {
    if (name2.equals("")) {
      return "Singer: " + name1 + "\n";
    }
    else {
      return "Singer 1: " + name1 + "\n" + "Singer 2: " + name2 + "\n";
    }
  }

  public int getNumOfPerformances() {
    return numberOfPerformances;
  }

  public static int getTotalPerformances() {
    return totalPerformances;
  }

  public double getEarnings() {
    return earnings;
  }

  public String getFavoriteSong() {
    return favoriteSong.getSongInfo();
  }
}