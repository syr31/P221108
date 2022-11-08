package ex6_1;

public class TvTest {

	public static void main(String[] args) { // 하나만 존재해야함
		Tv t;					// 지역변수	- 해당 메소드내에서만 유효함 메소드에서 벗어나면 인식 못함 
		t = new Tv();
		t.channel = 7;
		
		t.channelDown();		//메소드 실행 후 void channelDown() 실행이 끝나면 다시 돌아와서 순차적으로 실행된다.
		System.out.println("현재 채널은" + t.channel + "입니다.");

	}

}
