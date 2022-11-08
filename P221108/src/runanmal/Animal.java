package runanmal;

 class Animal {
	private String name;     //private(접근 지정자)= 직접 접근 외부 class RunningAnimal에서 
	 int age;				// 내부  class Animal 에 접근 못 한다.

	 
	 
	 
	 
	 
	 
	 public void  setName(String pname) { // setName 외부에서 세팅하거나 가져가거나 
		 name = pname;
		 
		 	 
	 }
	 public String getName() { //getName에 호출한 쪽으로 내보낸다.(가져가는것)
		 return name;
	 }
}
 
 	//유지보수가 어려워진다. 내 의도와 다른 상황이 생기지않게 
