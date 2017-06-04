package jeu;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Virgile on 05/06/2017.
 * TU VOLES TU PAIES
 */
public class Tube {

    private int width;
    private int height;
    private int x;
    private int y;
    private String fileImg;
    private ImageIcon iconTube;
    private Image imgTube;


    Tube(int x, int y, String fileImg) {
        this.width = 50;
        this.height = 300;
        this.x = x;
        this.y = y;
        this.fileImg = fileImg;

        this.iconTube = new ImageIcon(getClass().getResource(fileImg));
        this.imgTube = this.iconTube.getImage();
    }

    // GETTERS

    public int getWidth() {return width;}

    int getHeight() {return height;}

    int getX() {return x;}

    int getY() {return y;}

    Image getImgTube() {return imgTube;}

    // SETTERS

    void setX(int x) {this.x = x;}

    void setY(int y) {this.y = y;}

}
