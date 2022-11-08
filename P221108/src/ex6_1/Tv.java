package ex6_1;

public class Tv {

	String color;
	boolean power;
	int channel;
	int m = 9; //멤버변수는 접근가능 모든 메소드에서

	void power() {			
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {	
		--channel;
	}
}
