public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot("eksploracja", 2,-60);
        MarsRobot spirit2 = new MarsRobot("oczekiwanie", 0,0);
        MarsRobot spirit3 = new MarsRobot("powrót do bazy", 5,-133);



        MarsRobot opportunity = new MarsRobot();

        opportunity.status = "eksploracja";
        opportunity.speed = 4;
        opportunity.temperature = -100;

        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttributes();

        System.out.println();
        System.out.println("Zwiększamy prędkość do 3");

        spirit.speed = 3;

        spirit.showAttributes();

        System.out.println("Zmiana temperatury na -90");
        spirit.temperature = -90;
        spirit.showAttributes();

        System.out.println("Sprawdzenie temperatury");
        spirit.checkTemperature();

        spirit.showAttributes();

        opportunity.checkTemperature();
        opportunity.checkStatus();
    }
}
