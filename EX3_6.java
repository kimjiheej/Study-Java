import java.util.*;
public class EX3_6 {

	public static void main(String[] args) {
		
		
		int num;
		int i=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 중에서 출력하고 싶은 단을 입력하시오: ");
		num = sc.nextInt();
		
		while(i<=9)
		{
			System.out.println(num +"*" + i +"=" + num *i);
			i++;
		}

	}

}
