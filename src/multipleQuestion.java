import java.util.ArrayList;

public class multipleQuestion implements Question{
	
	String q;
	ArrayList a = new ArrayList();
	ArrayList b = new ArrayList();
	ArrayList c = new ArrayList();
	ArrayList d = new ArrayList();


	public void submitAnswer(String id, String s){
		
		if(s.compareTo("A") == 0){
			a.add(id);
		}
		else if(s.compareTo("B") == 0){
			b.add(id);
		}
		else if(s.compareTo("C") == 0){
			c.add(id);
		}
		else
			d.add(id);
	}
	
	
	public String getNumbers(){
		String r = "A:\t" + a.size() + "\nB:\t" + b.size() + "\nC:\t" + c.size() + "\nD:\t" + d.size() + "\n";
		return r;
	
	}
	
}
