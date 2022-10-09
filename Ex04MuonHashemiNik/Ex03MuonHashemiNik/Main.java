import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    String singer1Name = "";
    String singer2Name = "";
    String favSong = "";
    String favSongGenre = "";
    String favSongWriter = "";
    
    char choice = 'n';
    char choice2 = 'n';
    int numOfPeople = 12;
    int performanceNumber = 1;
    int numOfSingers = 1;
    Singer singerDetails = new Singer();
    
    Judges judge1 = new Judges("Tatiana", "Rock", 42);
    Judges judge2 = new Judges("DJ Subatomic Supernova", "Disco", 567);
    Judges judge3 = new Judges("Yinu", "Classical", 3);
    Scanner myInput = new Scanner(System.in);

    Song chosenSong1 = new Song("Somewhere Over the Rainbow", "Reggae", "Israel Kamakawiwo'ole");
    Song chosenSong2 = new Song("Heartaches", "Pop", "Al Bowlly");
    Song chosenSong3 = new Song("Remember Me", "Mariachi/lullaby/pop", "Kristen Anderson Lopez and Robert Lopes");
     
    System.out.println("Introducing today's judges: ");
    System.out.println(judge1.getName() + "\n" + "Likes: " + judge1.getLikes() + "\n" + "Age: " + judge1.getAge() + "\n");
    System.out.println(judge2.getName() + "\n" + "Likes: " + judge2.getLikes() + "\n" + "Age: " + judge2.getAge() + "\n");
    System.out.println(judge3.getName() + "\n" + "Likes: " + judge3.getLikes() + "\n" + "Age: " + judge3.getAge() + "\n");
    
    
    System.out.print("These are today's most popular songs: " + "\n" + chosenSong1.getSongInfo() + chosenSong2.getSongInfo() + chosenSong3.getSongInfo() + "\n");
    System.out.print("Please input your singer: ");
    singer1Name = myInput.nextLine();
    System.out.print("Please input your singer's favorite song: ");
    favSong = myInput.nextLine();
    System.out.print("Please input the song's genre: ");
    favSongGenre = myInput.nextLine();
    System.out.print("Please input the song's writer: ");
    favSongWriter = myInput.nextLine();

    System.out.println("Would you like 2 singers to perform? y/n: ");
    choice2 = myInput.next().charAt(0); 

    if (choice2 == 'y') {
      myInput.nextLine();
      System.out.print("Please input your singer: ");
      singer2Name = myInput.nextLine();         
    }
    
    System.out.println();
    
    
    do {
      System.out.println("\n");
      
      if (choice == 'y') {  
        favSong = "";
        favSongGenre = "";
        favSongWriter = "";
        numOfPeople = 0;
        performanceNumber = 0;
        numOfSingers = 0;

        do {
          System.out.println("Please input the amount of people attending: ");
          numOfPeople = myInput.nextInt();  
        } while (numOfPeople < 0);

        myInput.nextLine(); //Not adding this line of "junk" code causes the entire do-while loop to execute before asking for the favSong input.
        System.out.print("Please input your singer's favorite song: ");
        favSong = myInput.nextLine();
        System.out.print("Please input the song's genre: ");
        favSongGenre = myInput.nextLine();
        System.out.print("Please input the song's writer: ");
        favSongWriter = myInput.nextLine();

        System.out.println("Would you like 2 singers to perform? y/n: ");
        choice2 = myInput.next().charAt(0);     
      }      

      
      

      if (choice2 == 'n') {
        singerDetails.performForAudience(numOfPeople);
        singerDetails.changeFavSong1(favSong, favSongGenre, favSongWriter, singer1Name);
        
        System.out.println(singerDetails.getNames() + "Earnings: " + singerDetails.getEarnings() + "\n" + "Singer 1's number of performances: " + singerDetails.getNumOfPerformances() + "\n" + singerDetails.getFavoriteSong() + "\n");
      }
      
      if (choice2 == 'y') {
        singerDetails.performForAudience(numOfPeople, 2);
        singerDetails.changeFavSong2 (favSong, favSongGenre, favSongWriter, singer1Name, singer2Name);
        
        System.out.println(singerDetails.getNames() + "Split earnings: " + singerDetails.getEarnings() + "\n" + "Total number of performances: " + Singer.getTotalPerformances() + "\n" + singerDetails.getFavoriteSong() + "\n");
      }
      
      System.out.print("Would you like to adjust the number of spectators and the favorite song?: ");
      choice = myInput.next().charAt(0);
    } while (choice == 'y');
  }
}