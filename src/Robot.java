import java.util.concurrent.TimeUnit;

public class Robot implements RobotConnection, RobotConnectionManager {
    private int x;
    private int y;

    Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void moveRobotTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
        System.out.println("Робот доехал");
    }

    @Override
    public void close() {
        System.out.println("Соединение закрыто");
    }

    @Override
    public boolean getConnection() {
        double success = Math.random();
        if (success>0.5){
            System.out.println("Соединение установлено");
            return true;
        }
        else return false;
    }
}
