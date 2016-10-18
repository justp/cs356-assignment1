import java.util.Random;

public class Student {
	
	String id;
	Random rand = new Random();
	
	public Student(String id){
		
		id = this.id;
		
	}
	public String answerSingle(){
		
		int a = rand.nextInt()%2;
		if(a == 0){
			return "1";
		}
		else
			return "2";
	}
	
	public String answerMultiple(){
		int a = rand.nextInt()%4;
		String answer;
		
		switch(a){
			case 0:
				answer = "A";
				break;
			case 1:
				answer = "B";
				break;
			case 2:
				answer = "C";
				break;
			default:
				answer = "D";
				break;
		}	
		return answer;
			
			
	}
	
	public String getID(){
		return id;
	}
	

}
