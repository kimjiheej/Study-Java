import java.util.*;
public class EX3_5 {

	public static void main(String[] args) {
	  
		String month;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("달의 이름을 입력하시오: ");
		month = sc.next();
		
		switch(month)
		{
		case "january":// 단어일때는 ""넣어주기 
			System.out.println("1");
			break;
		case "Febuary":
			System.out.println("2");
			break;
		case "March":
			System.out.println("3");
			break;
		case "April":
			System.out.println("4");
			break;
		case "May":
		    System.out.println("5");
		    break;
		
		case "june":
			System.out.println("6");
			break;
		case "July":
			System.out.println("7");
			break;
		
			
		
		
		
		
		
		}

	}

}
