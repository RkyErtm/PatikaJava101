package OOProgramming;

class Car {
        //Nitelikler
        String type;
        String model;
        String color;
        int speed;
        int speedLimit=180;

      //Davranışlar
      void increaseSpeed(int increament){
              if ((speed+increament)<speedLimit){
                      speed+=increament;
              }
      }

      void decreaseSpeed(int decrease){
              if (speed>0){
                      speed-=decrease;
              }
      }

      void printSpeed(){
              System.out.println("Hızınız: "+speed);
      }
}
