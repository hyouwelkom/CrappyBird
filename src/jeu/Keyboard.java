package jeu;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Virgile on 05/06/2017.
 * TU VOLES TU PAIES
 */
public class Keyboard implements KeyListener {

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            Main.scene.flappyBird.moveUp();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {}
}
