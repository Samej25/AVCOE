// Superclass: Player
class Player {
    String name;

    // Constructor to initialize the player's name
    Player(String name) {
        this.name = name;
    }

    // Method to display the player's name
    void display() {
        System.out.println("Player: " + name);
    }
}

// Subclass: CricketPlayer
class CricketPlayer extends Player {
    CricketPlayer(String name) {
        super(name);  // Calling the Player constructor
    }

    void play() {
        System.out.println(name + " plays cricket.");
    }
}

// Subclass: FootballPlayer
class FootballPlayer extends Player {
    FootballPlayer(String name) {
        super(name);  // Calling the Player constructor
    }

    void play() {
        System.out.println(name + " plays football.");
    }
}

// Subclass: HockeyPlayer
class HockeyPlayer extends Player {
    HockeyPlayer(String name) {
        super(name);  // Calling the Player constructor
    }

    void play() {
        System.out.println(name + " plays hockey.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of each player type
        CricketPlayer cricketPlayer = new CricketPlayer("Virat Kohli");
        FootballPlayer footballPlayer = new FootballPlayer("Lionel Messi");
        HockeyPlayer hockeyPlayer = new HockeyPlayer("Wayne Gretzky");

        // Calling methods to display player name and their sport
        cricketPlayer.display();
        cricketPlayer.play();

        footballPlayer.display();
        footballPlayer.play();

        hockeyPlayer.display();
        hockeyPlayer.play();
    }
}
