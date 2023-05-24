package e_Dependency_Inversion_DIP.good;

public class RockMusicPlayer implements MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("Rock is playing");
    }
}
