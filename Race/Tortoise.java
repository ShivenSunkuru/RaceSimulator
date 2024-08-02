public class Tortoise{

private int speed;
private int position;

//constructor
public Tortoise(int minofspeed, int maxofspeed, int p){
	speed = (int)(Math.random()*(maxofspeed - minofspeed + 1)) + minofspeed;
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

	position+=speed;

}

public void setPosition(int newposition){

	position = newposition;

}

public String toString(){
	String out = "";
	return out+="Tortoise (speed ="+speed+", position ="+position+") wins the race";
}

}
