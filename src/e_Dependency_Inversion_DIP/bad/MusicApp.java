package e_Dependency_Inversion_DIP.bad;


/*
The DIP states that high-level modules/classes
should not depend on low-level modules/classes
directly; instead, they should depend on abstractions


In this example, the MusicApp class directly
depends on the concrete implementation of RockMusicPlayer,
violating the DIP. It tightly couples the MusicApp
class with the RockMusicPlayer class and limits the
flexibility to switch or introduce new types of
music players without modifying the MusicApp class.
 */

public class MusicApp {
    private RockMusicPlayer rockMusicPlayer;

    public MusicApp() {
        this.rockMusicPlayer = new RockMusicPlayer();
    }

    public void playRockMusic() {
        rockMusicPlayer.playRockMusic();
    }

    public static void main(String[] args) {
        MusicApp ms = new MusicApp();
        ms.playRockMusic();
    }
}


class RockMusicPlayer {
    public void playRockMusic() {
        System.out.println("rock music");
    }
}

class ClassicalMusicPlayer {
    public void playClassicalMusic() {
        System.out.println("classic music");
    }
}




