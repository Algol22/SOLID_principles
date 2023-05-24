package e_Dependency_Inversion_DIP.good;

public class ClassicalMusicPlayer implements MusicPlayer{
    @Override
    public void playMusic() {
        System.out.println("classic is playing");

    }
}
