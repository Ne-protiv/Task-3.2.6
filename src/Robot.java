import java.util.concurrent.TimeUnit;

public class Robot implements RobotConnection, RobotConnectionManager {
    private int x;
    private int y;
    boolean connection;

    Robot(int x, int y) {
        this.x = x;
        this.y = y;
        this.connection = false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public boolean connection(){
        return connection;
    }
    @Override
    public void moveRobotTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    @Override
    public void close() {
        System.out.println("Соединение закрыто");
    }

    @Override
    public boolean getConnection() {
        double success = Math.random();
        return 0.5 < success;
    }
}
