package jeu;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Virgile on 04/06/2017.
 * TU VOLES TU PAIES
 */
public class Scene extends JPanel {

    // VARIABLES
    private ImageIcon iconWallpaper;
    private Image imgWallpaper;

    private final int WIDTH_WALLPAPER = 140;

    public Scene() {

        super();
        this.iconWallpaper = new ImageIcon(getClass().getResource("../img/wallpaper.png"));
        this.imgWallpaper = this.iconWallpaper.getImage();

    }

    public void paintComponent (Graphics g) {
        g.drawImage(this.imgWallpaper, 0, 0, null);
        g.drawImage(this.imgWallpaper, this.WIDTH_WALLPAPER, 0, null);
    }

}
