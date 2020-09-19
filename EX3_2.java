import java.util.*;
public class EX3_2 {

	public static void main(String[] args) {
	    
		int score;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성적을 입력하시오: ");
		score = sc.nextInt();
		
		if(score>=90)
			System.out.println("학점 A");
		else if (score>=80)// 여기에서 if(grade>=80 && grade<=90) 을 할 필요가 없음 이미 앞에서 걸러짐.
			System.out.println("학점 B");
		else if (score>=70)
			System.out.println("학점 C");
		else if(score>=60)
			System.out.println("학점 D");
		else 
			System.out.println("학점 F");
			

	}

}
