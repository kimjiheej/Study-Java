import java.util.*;
public class EX3_8 {

	public static void main(String[] args) {
		int month;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.print("올바른 월을 입력하시오[1-12]: ");
			month = sc.nextInt();
			
		}while(month==0 || month>12);

			System.out.println("사용자가 입력한 월은"+ month);
	}

}
