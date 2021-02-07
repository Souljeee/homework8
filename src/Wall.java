public class Wall implements Result{
    private int height;
    public Wall(int height){
        this.height = height;
    }

    @Override
    public int getLimitations() {
        return height;
    }

    @Override
    public void printResult(boolean p) {
        if(p){
            System.out.println("Успешно прыгнул");
        }else{
            System.out.println("Не смог прыгнуть");
        }
    }
}
