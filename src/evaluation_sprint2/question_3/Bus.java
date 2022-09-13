package evaluation_sprint2.question_3;

public class Bus {
    private String color;
    private int speed;

    public static void main(String[] args) {
        Bus volvo = new Bus();

        volvo.printColour("White");

        volvo.fixSpeed(229);

        volvo.busInfo();

        Skoda newModel = new Skoda();

        newModel.SkodaPrototype();

    }

    public void fixSpeed(int speed){
        this.speed = speed;
    }

    public void printColour(String color){
        this.color = color;
    }

    public void busInfo(){
        System.out.println("Bus color is "+color+" speed limit is "+ speed);
    }
}

class Skoda extends Bus{
    public void SkodaPrototype(){
        Engine SkodaEngine = new Engine();
        SkodaEngine.start();
        SkodaEngine.stop();
    }
}


class Engine {
    public void start(){
        System.out.println("Start");
    }

    public void stop(){
        System.out.println("Stop");
    }
}