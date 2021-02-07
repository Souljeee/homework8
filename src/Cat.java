public class Cat implements RunnableAndJumpble {
    private int jumpLimitations = 20;
    private int runLimitations = 50;
    @Override
    public void run() {
        System.out.println("Кот бежит");
    }

    @Override
    public void jump() {
        System.out.println("Кот прыгает");
    }
    public void info(){
        System.out.println("Кот");
    }

    @Override
    public int getJumpLimitations() {
        return jumpLimitations;
    }

    @Override
    public int getRunLimitations() {
        return runLimitations;
    }
}
