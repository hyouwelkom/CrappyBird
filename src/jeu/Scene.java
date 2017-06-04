package jeu;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by Virgile on 04/06/2017.
 * TU VOLES TU PAIES
 */
public class Scene extends JPanel {

    // VARIABLES
    private ImageIcon iconWallpaper;
    private Image imgWallpaper;

    private Tube tubeUp1;
    private Tube tubeUp2;
    private Tube tubeUp3;
    private Tube tubeDown1;
    private Tube tubeDown2;
    private Tube tubeDown3;

    private final int WIDTH_WALLPAPER = 140;
    private final int DIST_TUBE = 250;
    private final int HOLE_TUBE = 120;

    int xBackground;
    private int mvTubeX;
    private int tubeX;

    private Random rand;


    // CONSTRUCTEUR

    Scene() {

        super();
        this.iconWallpaper = new ImageIcon(getClass().getResource("../img/wallpaper.png"));
        this.imgWallpaper = this.iconWallpaper.getImage();

        this.xBackground = 0;
        this.tubeX = 100;
        this.mvTubeX = 0;

        this.tubeUp1 = new Tube(this.tubeX, -150, "../img/tubeUp.png");
        this.tubeDown1 = new Tube(this.tubeX, 250, "../img/tubeDown.png");
        this.tubeUp2 = new Tube(this.tubeX + this.DIST_TUBE, -100, "../img/tubeUp.png");
        this.tubeDown2 = new Tube(this.tubeX + this.DIST_TUBE, 300, "../img/tubeDown.png");
        this.tubeUp3 = new Tube(this.tubeX + this.DIST_TUBE * 2, -120, "../img/tubeUp.png");
        this.tubeDown3 = new Tube(this.tubeX + this.DIST_TUBE * 2, 280, "../img/tubeDown.png");

        rand = new Random();

        Thread defilScreen = new Thread(new Time());
        defilScreen.start();

    }

    // METHODS

    public void paintComponent (Graphics g) {
        this.moveScreen(g);
        this.moveTube(g);
    }

    private void moveScreen (Graphics g) {
        if(this.xBackground == -this.WIDTH_WALLPAPER) {
            this.xBackground = 0;
        }
        g.drawImage(this.imgWallpaper, this.xBackground, 0, null);
        g.drawImage(this.imgWallpaper, this.xBackground + this.WIDTH_WALLPAPER, 0, null);
        g.drawImage(this.imgWallpaper, this.xBackground + this.WIDTH_WALLPAPER * 2, 0, null);
        g.drawImage(this.imgWallpaper, this.xBackground + this.WIDTH_WALLPAPER * 3, 0, null);
    }

    private void moveTube (Graphics g) {
        // TUBE 1
        this.tubeUp1.setX(this.tubeUp1.getX() - 1);
        this.tubeDown1.setX(this.tubeUp1.getX());

        if(this.tubeUp1.getX() == -100) {
            this.tubeUp1.setX(this.tubeUp3.getX() + this.DIST_TUBE);
            this.tubeUp1.setY(-100 - 10 * this.rand.nextInt(18));
            this.tubeDown1.setY(this.tubeUp1.getY() + this.tubeUp1.getHeight() + this.HOLE_TUBE);
        }

        g.drawImage(this.tubeUp1.getImgTube(), this.tubeUp1.getX(), this.tubeUp1.getY(), null);
        g.drawImage(this.tubeDown1.getImgTube(), this.tubeDown1.getX(), this.tubeDown1.getY(), null);


        // TUBE 2
        this.tubeUp2.setX(this.tubeUp2.getX() - 1);
        this.tubeDown2.setX(this.tubeUp2.getX());

        if(this.tubeUp2.getX() == -100) {
            this.tubeUp2.setX(this.tubeUp1.getX() + this.DIST_TUBE);
            this.tubeUp2.setY(-100 - 10 * this.rand.nextInt(18));
            this.tubeDown2.setY(this.tubeUp2.getY() + this.tubeUp2.getHeight() + this.HOLE_TUBE);
        }

        g.drawImage(this.tubeUp2.getImgTube(), this.tubeUp2.getX(), this.tubeUp2.getY(), null);
        g.drawImage(this.tubeDown2.getImgTube(), this.tubeDown2.getX(), this.tubeDown2.getY(), null);


        // TUBE 3
        this.tubeUp3.setX(this.tubeUp3.getX() - 1);
        this.tubeDown3.setX(this.tubeUp3.getX());

        if(this.tubeUp3.getX() == -100) {
            this.tubeUp3.setX(this.tubeUp2.getX() + this.DIST_TUBE);
            this.tubeUp3.setY(-100 - 10 * this.rand.nextInt(18));
            this.tubeDown3.setY(this.tubeUp3.getY() + this.tubeUp3.getHeight() + this.HOLE_TUBE);
        }

        g.drawImage(this.tubeUp3.getImgTube(), this.tubeUp3.getX(), this.tubeUp3.getY(), null);
        g.drawImage(this.tubeDown3.getImgTube(), this.tubeDown3.getX(), this.tubeDown3.getY(), null);
    }

}
