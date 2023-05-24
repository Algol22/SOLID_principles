package e_Dependency_Inversion_DIP.good;

public class MusicApp {
    private MusicPlayer musicPlayer;

    public MusicApp(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void play(){
        musicPlayer.playMusic();
    }

    public static void main(String[] args) {
        MusicPlayer mp = new RockMusicPlayer();
        mp.playMusic();
    }
}
