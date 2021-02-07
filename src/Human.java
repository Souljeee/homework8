public class Human implements RunnableAndJumpble{
    private int jumpLimitations = 40;
    private int runLimitations = 35;
    @Override
    public void run() {
        System.out.println("Человек бежит");
    }

    @Override
    public void jump() {
        System.out.println("Человек прыгет");
    }
    public void info(){
        System.out.println("Человек");
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
