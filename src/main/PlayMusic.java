package src.main;


import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class PlayMusic {
    
    public static void main(String[] args)
        throws java.io.IOException, UnsupportedAudioFileException, LineUnavailableException{

            src.main.ChooseOutro.NumberGenerator.playMusic();
           
        }


}
