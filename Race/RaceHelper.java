public class RaceHelper{

	private int end;
	private int delayInMS;

	public RaceHelper(int e, int delay){
		end = e; //make it a 100
		delayInMS = delay; //make it 500
	}

	public int getEnd(){
		return end;
	}

	public void pause(){
		try {
			Thread.sleep(delayInMS);
		} catch(Exception e) {}
	}

	private void printCharAtPosition(char c, int pos){
		for (int i = 0; i < pos; i++)
					System.out.print("_");
				System.out.print(c);
				for (int i = pos+1; i < end; i++)
					System.out.print("_");
				if (pos < end)
					System.out.println("| END");
				else
			System.out.println(" Finished the Race!");

	}

	public void printPositions(Tortoise t, Hare h){
		printCharAtPosition('T',t.getPosition());
		printCharAtPosition('H',h.getPosition());
		pause();
		System.out.println();
	}


}