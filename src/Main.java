public class Main {
    public static void main(String[] args) {
        RunnableAndJumpble[] participants = new RunnableAndJumpble[3];
        participants[0] = new Human();
        participants[1] = new Cat();
        participants[2] = new Robot();

        Result[] obstacles = new Result[5];
        obstacles[0] = new Wall(10);
        obstacles[1] = new Treadmill(20);
        obstacles[2] = new Wall(17);
        obstacles[3] = new Treadmill(50);
        obstacles[4] = new Wall(37);

        for (int i = 0; i < participants.length; i++) {
            participants[i].info();
            for(int j = 0; j < obstacles.length; j++){
                if(obstacles[j] instanceof Wall){
                    participants[i].jump();
                    if(participants[i].getJumpLimitations() >= obstacles[j].getLimitations()){
                        obstacles[j].printResult(true);
                    }else{
                        obstacles[j].printResult(false);
                        break;
                    }
                }
                if(obstacles[j] instanceof Treadmill){
                    participants[i].run();
                    if(participants[i].getRunLimitations() >= obstacles[j].getLimitations()){
                        obstacles[j].printResult(true);
                    }else{
                        obstacles[j].printResult(false);
                        break;
                    }
                }
            }
        }

    }
}
