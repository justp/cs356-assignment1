import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class SimulationDriver {
	
	public static void main(String[] args){
		
		Random rand = new Random();
		ArrayList<Integer> newid = new ArrayList();
		
		int y = 0;
		while(y < 15){
			int z = rand.nextInt(88888)+11111;
			if(!newid.contains(z)){
				newid.add(z);
				y++;
			}
		}
		
		Student student1 = new Student(Integer.toString(newid.get(0)));
		Student student2 = new Student(Integer.toString(newid.get(1)));
		Student student3 = new Student(Integer.toString(newid.get(2)));
		Student student4 = new Student(Integer.toString(newid.get(3)));
		Student student5 = new Student(Integer.toString(newid.get(4)));
		Student student6 = new Student(Integer.toString(newid.get(5)));
		Student student7 = new Student(Integer.toString(newid.get(6)));
		Student student8 = new Student(Integer.toString(newid.get(7)));
		Student student9 = new Student(Integer.toString(newid.get(8)));
		Student student10 = new Student(Integer.toString(newid.get(9)));
		Student student11 = new Student(Integer.toString(newid.get(10)));
		Student student12 = new Student(Integer.toString(newid.get(11)));
		Student student13 = new Student(Integer.toString(newid.get(12)));
		Student student14 = new Student(Integer.toString(newid.get(13)));
		Student student15 = new Student(Integer.toString(newid.get(14)));
		
		iVoteService sim = new iVoteService();
		Scanner kb = new Scanner(System.in);
		
		boolean run = true;
		
		do{

			System.out.println("Run Simulator? (y/n)");
			String in = kb.nextLine();
			
			if(in.compareToIgnoreCase("N") == 0){
				run = false;
			}
			else if (in.compareToIgnoreCase("Y") == 0){
				System.out.println("Select question type:");
				System.out.println("1) True and False");
				System.out.println("2) Multiple Choice"); 
				String num = kb.nextLine();
				
				if(num.compareToIgnoreCase("1") == 0){
					System.out.println("Enter a question");
					String q = kb.nextLine();
					sim.createSingleQuestion(q, student1, student2, student3, student4, student5, student6, student7, student8, student9, student10,
							student11, student12, student13, student14, student15);
				}
				else if(num.compareToIgnoreCase("2") == 0){
					System.out.println("Enter a question");
					String q = kb.nextLine();
					sim.createMultiQuestion(q, student1, student2, student3, student4, student5, student6, student7, student8, student9, student10,
							student11, student12, student13, student14, student15);
				}
				
			}
			else
				System.out.println("Try Again");
			
			
		}while(run == true);
		
		
		
	}

}
