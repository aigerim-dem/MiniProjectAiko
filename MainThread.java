import javax.swing.*;

public class MainThread extends Thread{
    JLabel bullet;

    public MainThread (JLabel bullet){
        this.bullet = bullet;
    }


    @Override
    public void run() {
        for (int i=0; i<500; i++){
            bullet.setLocation(i, 200);
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

