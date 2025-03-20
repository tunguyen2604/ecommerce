import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class Game extends JPanel implements ActionListener, KeyListener {
    private int playerX = 250, playerY = 250;
    private int targetX, targetY;
    private final int STEP = 10;
    private final Timer timer;
    private final Random random = new Random();

    public Game() {
        setFocusable(true);
        addKeyListener(this);
        setPreferredSize(new Dimension(500, 500));
        timer = new Timer(1000, this);
        spawnTarget();
        timer.start();
    }

    private void spawnTarget() {
        targetX = random.nextInt(500);
        targetY = random.nextInt(500);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(playerX, playerY, 20, 20);
        g.setColor(Color.RED);
        g.fillOval(targetX, targetY, 10, 10);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        spawnTarget();
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                playerY = Math.max(playerY - STEP, 0);
                break;
            case KeyEvent.VK_DOWN:
                playerY = Math.min(playerY + STEP, getHeight() - 20);
                break;
            case KeyEvent.VK_LEFT:
                playerX = Math.max(playerX - STEP, 0);
                break;
            case KeyEvent.VK_RIGHT:
                playerX = Math.min(playerX + STEP, getWidth() - 20);
                break;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Chase the Dot");
        Game game = new Game();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}