 public class Race {
 	public static void main(String[] args){

 	int hareWs = 0;
 	int tortoiseWs = 0;

 for(int i = 0; i < 100; i++){
 	RaceHelper racelayout = new RaceHelper(100,500);
 	Tortoise tortoise = new Tortoise(2, 4, 0);
 	Hare hare = new Hare(10, 0);
 	while(true){
		racelayout.printPositions(tortoise,hare);
 		tortoise.move();
 		hare.move();
 	if(tortoise.getPosition() == 100){
 	System.out.print(tortoise.toString());
 	System.out.println(" and Hare (speed ="+hare.getSpeed()+", position ="+hare.getPosition()+") loses the race.");
 	tortoiseWs++;
 	 	System.out.println("Tortoise Wins: "+tortoiseWs+".");
 	System.out.println("Hare Wins: "+hareWs+".");
 	break;
 	}
 	if(hare.getPosition() == 100) {
 	System.out.print(hare.toString());
 	System.out.println(" and Tortoise (speed ="+tortoise.getSpeed()+", position ="+tortoise.getPosition()+") loses the race.");
 		hareWs++;
 		 	System.out.println("Tortoise Wins: "+tortoiseWs+".");
 	System.out.println("Hare Wins: "+hareWs+".\n");
 		break;
 	}

 	}

 	}
}
}