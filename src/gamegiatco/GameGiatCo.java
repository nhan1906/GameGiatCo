/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamegiatco;

import java.io.*;
import sun.audio.AudioStream;
import sun.audio.AudioPlayer;

/**
 *
 * @author James
 */
public class GameGiatCo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        //Chèn nhạc vào trong game
        //Trỏ đến file nhạc
        InputStream is = new FileInputStream(new File("./audio/nhachay2.wav"));
        AudioStream as = new AudioStream(is);
        AudioPlayer.player.start(as);
    }
    
}
