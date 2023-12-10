package lab6.ballandplayer;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = 0.0f;
    }

    public void move(float x, float y) {
        this.x += x;
        this.y += y;
    }

    public void jump(float z) {
        this.z += z;
    }

    public boolean near(Ball ball) {
        double distance = Math.sqrt((x - ball.getX())*(x - ball.getX()) + (y - ball.getY())*(y - ball.getY()) + (z - ball.getZ())*(z - ball.getZ()));

        return ((int) distance < 8);
    }

    public void kick(Ball ball) {
        if (!near(ball)) {
            System.out.println("ball not enought near");
        } else {
            double x1 = Math.random() + ball.getX();
            double y1 = Math.random() + ball.getY();
            double z1 = Math.random() + ball.getZ();

            ball.setXYZ((float) x1,(float) y1,(float) z1);
        }
    }
}
