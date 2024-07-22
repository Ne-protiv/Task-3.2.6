public class Task {
    public static void main(String[] args) throws RobotConnectionException {

        try (Robot robot = new Robot(0, 0)) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Попытка соединения...");
                if (robot.getConnection()) {
                    System.out.println("Соединение установлено");
                    robot.moveRobotTo(1, 1);
                    System.out.println("робот доехал");
                    break;
                }if (i==2){
                    throw new RobotConnectionException("не удалось установить соединение");}
                }
            }
         catch (RobotConnectionException e) {
            System.out.println(e.getMessage());

        }
    }
}





