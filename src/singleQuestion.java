import java.util.ArrayList;

public class singleQuestion implements Question{
	
	String q;
	ArrayList t = new ArrayList();
	ArrayList f = new ArrayList();


	public void submitAnswer(String id, String a){
		
		if(a.compareTo("1") == 0){
			t.add(id);
		}
		else{
			f.add(id);
		}
	
	}
	
	
	public String getNumbers(){
		String r = "True:\t" + t.size() + "\nFalse:\t" + f.size() + "\n";
		return r;
	
	}

}
