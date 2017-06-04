package jeu;

import javafx.scene.layout.AnchorPane;

import javax.swing.*;

/**
 * Created by Virgile on 04/06/2017.
 * TU VOLES TU PAIES
 */
public class Main {

    public static JFrame window;
    public static Scene scene;

    public static void main(String[] args) {

        window = new JFrame("Crappy Bird");
        scene = new Scene();

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit si croix rouge
        window.setSize(300, 425);
        window.setLocationRelativeTo(null); //Centre la fenetre
        window.setResizable(false);
        window.setAlwaysOnTop(true);
        window.setContentPane(scene);

        window.setVisible(true);



    }
}
