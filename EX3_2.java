import java.util.*;
public class EX3_2 {

	public static void main(String[] args) {
	    
		int score;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�: ");
		score = sc.nextInt();
		
		if(score>=90)
			System.out.println("���� A");
		else if (score>=80)// ���⿡�� if(grade>=80 && grade<=90) �� �� �ʿ䰡 ���� �̹� �տ��� �ɷ���.
			System.out.println("���� B");
		else if (score>=70)
			System.out.println("���� C");
		else if(score>=60)
			System.out.println("���� D");
		else 
			System.out.println("���� F");
			

	}

}
