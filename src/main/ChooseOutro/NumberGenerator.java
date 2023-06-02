package src.main.ChooseOutro;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import javax.sound.sampled.*;

public class NumberGenerator {

    public static void playMusic() throws UnsupportedAudioFileException, IOException, LineUnavailableException{

        int minimum = 1;
        int max = 1;

        //Generate a random number from 1-5
        System.out.println("Random value in int from " +minimum+ " to " +max+ ":");
        int random_int = (int)Math.floor(Math.random()*(max - minimum + 1)+ minimum);
        System.out.println(random_int);

        System.out.println("Press Z for an outro.");
    
        if(random_int == 1){
            try{

            Runtime runtime1 = Runtime.getRuntime();
            Scanner scanner1 = new Scanner(System.in);
            InputStream file1 = NumberGenerator.class.getResourceAsStream("/res/10   Sunset.wav");
            AudioInputStream audioStream1 = AudioSystem.getAudioInputStream(file1);
            Clip clip1 = AudioSystem.getClip();
            clip1.open(audioStream1);

            String response = scanner1.next();

            while (response.equals("Z")){
                clip1.start();
                try{
                    System.out.println("Shutting down the PC after 16 seconds.");
                    runtime1.exec("shutdown -s -t 16");
                }catch(IOException e){
                    System.out.println("Exception: " +e);
                }
            }
        
            }finally{}
        }if(random_int == 2){

            Runtime runtime2 = Runtime.getRuntime();
            Scanner scanner2 = new Scanner(System.in);
            InputStream file2 = NumberGenerator.class.getResourceAsStream("/res/Animal Crossing - 5PM (Yung Bae Remix).wav");
            AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(file2);
            Clip clip2 = AudioSystem.getClip();
            clip2.open(audioStream2);

            String response = scanner2.next();

            while (response.equals("Z")){
                clip2.start();
                try{
                    System.out.println("Shutting down the PC after 18 seconds.");
                    runtime2.exec("shutdown -s -t 18"); //17
                }catch(IOException e){
                    System.out.println("Exception: " +e);
                }
            }

        }if(random_int == 3){

            Runtime runtime3 = Runtime.getRuntime();
            Scanner scanner3 = new Scanner(System.in);
            InputStream file3 = NumberGenerator.class.getResourceAsStream("/res/I Can Tell.wav");
            AudioInputStream audioStream3 = AudioSystem.getAudioInputStream(file3);
            Clip clip3 = AudioSystem.getClip();
            clip3.open(audioStream3);

            String response = scanner3.next();

            while (response.equals("Z")){
                clip3.start();
                try{
                    System.out.println("Shutting down the PC after  seconds.");
                    runtime3.exec("shutdown -s -t 4");// 3 or 5
                }catch(IOException e){
                    System.out.println("Exception: " +e);
                }
            }

        }if(random_int == 4){

            Runtime runtime4 = Runtime.getRuntime();
            Scanner scanner4 = new Scanner(System.in);
            InputStream file4 = NumberGenerator.class.getResourceAsStream("/res/popcorn castle.wav");
            AudioInputStream audioStream4 = AudioSystem.getAudioInputStream(file4);
            Clip clip4 = AudioSystem.getClip();
            clip4.open(audioStream4);

            String response = scanner4.next();

            while (response.equals("Z")){
                clip4.start();
                try{
                    System.out.println("Shutting down the PC after 27 seconds.");
                    runtime4.exec("shutdown -s -t 27");//26
                }catch(IOException e){
                    System.out.println("Exception: " +e);
                }
            }

        }if(random_int == 5){

            Runtime runtime5 = Runtime.getRuntime();
            Scanner scanner5 = new Scanner(System.in);
            InputStream file5 = NumberGenerator.class.getResourceAsStream("/res/wavelocity.wav");
            AudioInputStream audioStream5 = AudioSystem.getAudioInputStream(file5);
            Clip clip5 = AudioSystem.getClip();
            clip5.open(audioStream5);

            String response = scanner5.next();

            while (response.equals("Z")){
                clip5.start();
                try{
                    System.out.println("Shutting down the PC after 21 seconds.");
                    runtime5.exec("shutdown -s -t 21");//22
                }catch(IOException e){
                    System.out.println("Exception: " +e);
                }
                
            }

        }if(random_int == 6){

            Runtime runtime6 = Runtime.getRuntime();
            Scanner scanner6 = new Scanner(System.in);
            InputStream file6 = NumberGenerator.class.getResourceAsStream("/res/ronald reagan death announcement beat drop (FULL VERSION HD).wav");
            AudioInputStream audioStream1 = AudioSystem.getAudioInputStream(file6);
            Clip clip6 = AudioSystem.getClip();
            clip6.open(audioStream1);

            String response = scanner6.next();

            while (response.equals("Z")){
                clip6.start();
                try{
                    System.out.println("Shutting down the PC after 66 seconds.");
                    runtime6.exec("shutdown -s -t 66");
                }catch(IOException e){
                    System.out.println("Exception: " +e);
                }finally{}

            }
        }
    }
}  