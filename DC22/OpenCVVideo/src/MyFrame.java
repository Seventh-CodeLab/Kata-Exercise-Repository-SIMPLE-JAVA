import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//NOTHING TO DO HERE FOR YOU
//Main method

public class MyFrame extends JFrame {
    private JPanel contentPane;

    //Main method
    public static void main(String[] args) {
        //Runnable to catch frames from webcam
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MyFrame frame = new MyFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MyFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1280, 720); //set resolution
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(0, 0, 0, 0)); //set border
        setContentPane(contentPane);
        contentPane.setLayout(null);

        new MyThread().start(); //start the thread
    }

    VideoCap videoCap = new VideoCap(); //create new video capture object, this does the actuall capturing

    public void paint(Graphics g){
        g = contentPane.getGraphics();
        g.drawImage(videoCap.getOneFrame(), 0, 0, this);
    }

    //thread to run smooth
    class MyThread extends Thread{
        @Override
        public void run() {
            for (;;){
                repaint();
                try { Thread.sleep(30);
                } catch (InterruptedException e) {    }
            }
        }
    }
}