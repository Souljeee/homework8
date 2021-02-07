public class Robot implements RunnableAndJumpble {
    private int jumpLimitations = 10;
    private int runLimitations = 60;
    @Override
    public void run() {
        System.out.println("Робот бежит");
    }

    @Override
    public void jump() {
        System.out.println("Робот прыгает");
    }
    public void info(){
        System.out.println("Робот");
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
