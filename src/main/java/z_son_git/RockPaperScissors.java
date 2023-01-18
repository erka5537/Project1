package z_son_git;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class RockPaperScissors {

    JFrame win;
    JLabel player1_img;
    JLabel player2_img;
    JButton rock;
    JButton paper;
    JButton scissors;
    JLabel player1;
    JLabel player2;
    JLabel score;
    String p1;
    JLabel draw;
    int player1_score=0;
    int player2_score=0;

    public RockPaperScissors() {
        //pencere oluşturma işlemleri
        this.win = new JFrame("Rock Paper Scissors");
        win.setSize(800,500);
        win.setLayout(null);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setResizable(false);

        //rock button
        this.rock = new JButton(new ImageIcon("C:\\Users\\ERKA55\\Desktop\\TaşKağıtMakas\\tas.png"));
        rock.setBounds(150, 250, 50, 50);
        rock.setBorderPainted(false);
        rock.setOpaque(false);
        rock.setContentAreaFilled(false);

        rock.addActionListener((ActionEvent e)->{
            player1_img.setIcon(new ImageIcon("C:\\Users\\ERKA55\\Desktop\\TaşKağıtMakas\\tas.png"));
            p1 = "rock";
            rockpaper();
        });

        this.paper = new JButton(new ImageIcon("C:\\Users\\ERKA55\\Desktop\\TaşKağıtMakas\\kağıt.png"));
        paper.setBounds(205, 250, 50, 50);
        paper.setBorderPainted(false);
        paper.setOpaque(false);
        paper.setContentAreaFilled(false);

        paper.addActionListener((ActionEvent e)->{
            player1_img.setIcon(new ImageIcon("C:\\Users\\ERKA55\\Desktop\\TaşKağıtMakas\\kağıt.png"));
            p1 = "paper";
            rockpaper();
        });

        this.scissors = new JButton(new ImageIcon("C:\\Users\\ERKA55\\Desktop\\TaşKağıtMakas\\makas.png"));
        scissors.setBounds(260, 250, 50, 50);
        scissors.setBorderPainted(false);
        scissors.setOpaque(false);
        scissors.setContentAreaFilled(false);

        scissors.addActionListener((ActionEvent e)->{
            player1_img.setIcon(new ImageIcon("C:\\Users\\ERKA55\\Desktop\\TaşKağıtMakas\\makas.png"));
            p1 = "scissors";
            rockpaper();
        });

        //resim
        this.player1_img = new JLabel(new ImageIcon("C:\\\\Users\\\\ERKA55\\\\Desktop\\\\TaşKağıtMakas\\\\tas.png"));
        player1_img.setBounds(150, 80, 160, 160);

        this.player2_img = new JLabel(new ImageIcon("C:\\\\Users\\\\ERKA55\\\\Desktop\\\\TaşKağıtMakas\\\\tas.png"));
        player2_img.setBounds(500, 80, 160, 160);

        //players
        this.player1 = new JLabel("Player 1");
        player1.setBounds(150,40,160,50);
        player1.setFont(new Font("Arial",Font.BOLD,25));

        this.player2 = new JLabel("Player 2");
        player2.setBounds(500,40,160,50);
        player2.setFont(new Font("Arial",Font.BOLD,25));

        this.score = new JLabel(player1_score+" - "+player2_score);
        score.setBounds(300, 110, 200, 100);
        score.setFont(new Font("Arial", Font.BOLD,50));
        score.setHorizontalAlignment(JLabel.CENTER);

        this.draw = new JLabel("");
        draw.setBounds(350,180,100,20);
        draw.setHorizontalAlignment(JLabel.CENTER);
        draw.setForeground(Color.red);

        win.add(rock);
        win.add(paper);
        win.add(scissors);
        win.add(player1_img);
        win.add(player2_img);
        win.add(player1);
        win.add(player2);
        win.add(score);
        win.add(draw);
        win.setVisible(true);
    }

    public void rockpaper(){
        String[] list_2 = {"tas.png","kağıt.png","makas.png"};
        Random r = new Random();
        String x2 = list_2[r.nextInt(list_2.length)];
        player2_img.setIcon(new ImageIcon("C:\\Users\\ERKA55\\Desktop\\TaşKağıtMakas\\"+x2));

        SwingUtilities.updateComponentTreeUI(win);
        if(player1_score == 10){
            JOptionPane.showMessageDialog(null,"Player1 win!", "Rock Paper Scissors", JOptionPane.DEFAULT_OPTION);
            player1_img.setIcon(new ImageIcon("C:\\Users\\ERKA55\\Desktop\\TaşKağıtMakas\\tas.png"));
            player2_img.setIcon(new ImageIcon("C:\\Users\\ERKA55\\Desktop\\TaşKağıtMakas\\tas.png"));
            player1_score = 0;
            player2_score = 0;
            score.setText(player1_score+" - "+player2_score);

        }else if(player2_score == 10){
            JOptionPane.showMessageDialog(null,"Player2 win!", "Rock Paper Scissors!", JOptionPane.DEFAULT_OPTION);
            player1_img.setIcon(new ImageIcon("C:\\Users\\ERKA55\\Desktop\\TaşKağıtMakas\\tas.png"));
            player2_img.setIcon(new ImageIcon("C:\\Users\\ERKA55\\Desktop\\TaşKağıtMakas\\tas.png"));
            player1_score = 0;
            player2_score = 0;
            score.setText(player1_score+" - "+player2_score);
        }

        else {
            if(p1 == "rock" && x2 == "kağıt.png"){
                player2_score++;
                score.setText(player1_score+" - "+player2_score);
                draw.setText("");

            }else if(p1 == "rock" && x2 == "makas.png"){
                player1_score++;
                score.setText(player1_score+" - "+player2_score);
                draw.setText("");
            }
            else if(p1 == "rock" && x2 == "tas.png") {
                draw.setText("Draw");
            }



            if(p1 == "paper" && x2 == "tas.png") {
                player1_score++;
                score.setText(player1_score+" - "+player2_score);
                draw.setText("");
            }

            else if(p1 == "paper" && x2 == "makas.png") {
                player2_score++;
                score.setText(player1_score+" - "+player2_score);
                draw.setText("");
            }

            else if(p1 == "paper" && x2 == "kağıt.png") {
                draw.setText("Draw");
            }

            if(p1 == "scissors" && x2 == "tas.png") {
                player2_score++;
                score.setText(player1_score+" - "+player2_score);
                draw.setText("");
            }

            else if(p1 == "scissors" && x2 == "kağıt.png") {
                player1_score++;
                score.setText(player1_score+" - "+player2_score);
                draw.setText("");
            }

            else if(p1 == "scissors" && x2 == "makas.png") {
                draw.setText("Draw");
            }
        }
    }
    public static void main(String[]args) {
        new RockPaperScissors();
    }
}
