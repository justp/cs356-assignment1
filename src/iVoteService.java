import java.util.Scanner;

public class iVoteService {
	
	public void createSingleQuestion(String q, Student student1, Student student2, Student student3, Student student4, Student student5,
			Student student6, Student student7, Student student8, Student student9, Student student10, Student student11, Student student12,
			Student student13, Student student14, Student student15){
		
		singleQuestion s = new singleQuestion();
		
		String a = student1.answerSingle();
		String b = student2.answerSingle();
		String c = student3.answerSingle();
		String d = student4.answerSingle();
		String e = student5.answerSingle();
		String f = student6.answerSingle();
		String g = student7.answerSingle();
		String h = student8.answerSingle();
		String i = student9.answerSingle();
		String j = student10.answerSingle();
		String k = student11.answerSingle();
		String l = student12.answerSingle();
		String m = student13.answerSingle();
		String n = student14.answerSingle();
		String o = student15.answerSingle();
		
		s.submitAnswer(student1.id, a);
		s.submitAnswer(student2.id, b);
		s.submitAnswer(student3.id, c);
		s.submitAnswer(student4.id, d);
		s.submitAnswer(student5.id, e);
		s.submitAnswer(student6.id, f);
		s.submitAnswer(student7.id, g);
		s.submitAnswer(student8.id, h);
		s.submitAnswer(student9.id, i);
		s.submitAnswer(student10.id, j);
		s.submitAnswer(student11.id, k);
		s.submitAnswer(student12.id, l);
		s.submitAnswer(student13.id, m);
		s.submitAnswer(student14.id, n);
		s.submitAnswer(student15.id, o);
		
		boolean check = true;
		Scanner kb = new Scanner(System.in);
		
		do{
			System.out.println("Student submitting answers");
			System.out.println("Check progress?('y' for total numbers, 'n' stop submission)");
			String ans = kb.nextLine();
			if(ans.compareToIgnoreCase("y") == 0){
				System.out.println(s.getNumbers());
			}
			else if(ans.compareToIgnoreCase("n") == 0){
				check = false;
			}
			else
				System.out.println("Try again");
		}while(check == true);
		
		
	}
	
	public void createMultiQuestion(String q, Student student1, Student student2, Student student3, Student student4, Student student5,
			Student student6, Student student7, Student student8, Student student9, Student student10, Student student11, Student student12,
			Student student13, Student student14, Student student15){
		
		multipleQuestion z = new multipleQuestion();
		
		String a = student1.answerMultiple();
		String b = student2.answerMultiple();
		String c = student3.answerMultiple();
		String d = student4.answerMultiple();
		String e = student5.answerMultiple();
		String f = student6.answerMultiple();
		String g = student7.answerMultiple();
		String h = student8.answerMultiple();
		String i = student9.answerMultiple();
		String j = student10.answerMultiple();
		String k = student11.answerMultiple();
		String l = student12.answerMultiple();
		String m = student13.answerMultiple();
		String n = student14.answerMultiple();
		String o = student15.answerMultiple();
		
		z.submitAnswer(student1.id, a);
		z.submitAnswer(student2.id, b);
		z.submitAnswer(student3.id, c);
		z.submitAnswer(student4.id, d);
		z.submitAnswer(student5.id, e);
		z.submitAnswer(student6.id, f);
		z.submitAnswer(student7.id, g);
		z.submitAnswer(student8.id, h);
		z.submitAnswer(student9.id, i);
		z.submitAnswer(student10.id, j);
		z.submitAnswer(student11.id, k);
		z.submitAnswer(student12.id, l);
		z.submitAnswer(student13.id, m);
		z.submitAnswer(student14.id, n);
		z.submitAnswer(student15.id, o);
		
		boolean check = true;
		Scanner kb = new Scanner(System.in);
		
		do{
			System.out.println("Students submitting answers");
			System.out.println("Check progress?('y' for total numbers, 'n' stop submission)");
			String ans = kb.nextLine();
			if(ans.compareToIgnoreCase("y") == 0){
				System.out.println(z.getNumbers());
			}
			else if(ans.compareToIgnoreCase("n") == 0){
				check = false;
			}
			else
				System.out.println("Try again");
		}while(check == true);
		
		
	}

	
}

