import java.util.*;
public class EX3_8 {

	public static void main(String[] args) {
		int month;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.print("�ùٸ� ���� �Է��Ͻÿ�[1-12]: ");
			month = sc.nextInt();
			
		}while(month==0 || month>12);

			System.out.println("����ڰ� �Է��� ����"+ month);
	}

}
