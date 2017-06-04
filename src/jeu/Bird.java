package jeu;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Virgile on 05/06/2017.
 * TU VOLES TU PAIES
 */
public class Bird {

    // VARIABLES
    private int width;
    private int height;
    private int x;
    private int y;
    private int moveY;
    private String fileImg;
    private ImageIcon iconBird;
    private Image imgBird;

    // CONSTRUCTEUR
    Bird (int x, int y, String fileImg) {
        this.width = 34;
        this.height = 24;
        this.x = x;
        this.y = y;
        this.fileImg = fileImg;

        this.iconBird = new ImageIcon(getClass().getResource(fileImg));
        this.imgBird = this.iconBird.getImage();
    }

    // GETTERS

    public int getWidth() {return width;}

    public int getHeight() {return height;}

    int getX() {return x;}

    int getY() {return y;}

    Image getImgBird() {return imgBird;}


    // SETTERS

    public void setX(int x) {this.x = x;}

    void setY(int y) {this.y = y;}

    // METHODS

    void moveUp() {
        this.moveY = 50;
        this.y = this.y - this.moveY;
    }

}
