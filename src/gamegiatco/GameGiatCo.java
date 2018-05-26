/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamegiatco;

import java.awt.Container;
import java.io.*;
import javax.swing.*;
import sun.audio.AudioStream;
import sun.audio.AudioPlayer;

/**
 *
 * @author James
 * Inheritance Frame
 */
public class GameGiatCo extends JFrame{
    
    // Biên JPanel sẽ khu vực trò chơi sẽ fit với Frame
    // Tạo ra lớp GameManager để quản lý Panel trò chơi
    private JPanel gm = new GameManager();
    
    
    // Khởi tạo game
    public GameGiatCo(){
        // Đầu tiên là thêm bản đồ game vào
        initComponents();
        // Set sự kiện 
        initEvents();
        // Cài đặt thông số cho frame
        initFrame();
    }
    
    // Add Jpanel vào Frame
    private void initComponents(){
        //Lấy container ra để thêm panel vào
        Container cp = this.getContentPane();
        
        // Focus
        gm.setFocusable(true);
        
        cp.add(gm);
    }
    
    private void initEvents() {
        RandomMovement rm = new RandomMovement();
    }
    
    // Thiết lập thông tin cơ bản cho Frame
    private void initFrame() {
        this.setLocation(200, 200);
        this.setTitle("Game Giật Cờ");
        this.pack(); // ??? chưa rõ làm gì
        //Cho vào nút close
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Hiện nó lên
        this.setVisible(true);
        
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        //Chèn nhạc vào trong game
        //Trỏ đến file nhạc
        InputStream is = new FileInputStream(new File("./audio/nhachay2.wav"));
        //Chạy file nhạc trên nền game
        AudioStream as = new AudioStream(is);
        AudioPlayer.player.start(as);
        //Tạo một lần chơi mới
        new GameGiatCo();
    }
    
}
