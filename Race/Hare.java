public class Hare{

private int speed;
private int position;

//constructor
public Hare(int s, int p){
	speed = s;
	position = p;
}

//accessor methods:

public int getPosition(){
	return position;
}

public int getSpeed(){
	return speed;
}

public void move(){

	int random = (int)(Math.random() * 3) + 1;

	if(random == 3) {
		position+= speed;

	}



}

public void setPosition(int newposition){

	position = newposition;

}


public String toString(){
	String out = "";
	return out+="Hare (speed ="+speed+", position ="+position+") wins the race";
}

}
