public class Treadmill implements Result {
    private int length;
    public Treadmill(int length){
        this.length = length;
    }

    @Override
    public int getLimitations() {
        return length;
    }

    @Override
    public void printResult(boolean p) {
        if(p){
            System.out.println("Успешно пробежал");
        }else{
            System.out.println("Не смог пробежать");
        }
    }
}
