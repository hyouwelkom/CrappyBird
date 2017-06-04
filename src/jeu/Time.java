package jeu;

/**
 * Created by Virgile on 04/06/2017.
 * TU VOLES TU PAIES
 */
public class Time implements Runnable {

    private final int PAUSE = 5;

    @Override
    public void run() {
        while(true) {
            Main.scene.xBackground--;
            Main.scene.repaint();
            try {
                Thread.sleep(this.PAUSE);
            } catch (InterruptedException e) {
                System.out.println("Error while thread.sleep");
            }
        }

    }

}
