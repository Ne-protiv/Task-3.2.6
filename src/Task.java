public class Task {
    public static void main(String[] args) throws RobotConnectionException {
        try (Robot robot = new Robot(0, 0)) {
            for (int i = 0; true; i++) {
                System.out.println("Попытка соединения...");
                if (robot.getConnection()) {
                    robot.moveRobotTo(1, 1);
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





