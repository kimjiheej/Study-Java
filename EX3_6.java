import java.util.*;
public class EX3_6 {

	public static void main(String[] args) {
		
		
		int num;
		int i=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �߿��� ����ϰ� ���� ���� �Է��Ͻÿ�: ");
		num = sc.nextInt();
		
		while(i<=9)
		{
			System.out.println(num +"*" + i +"=" + num *i);
			i++;
		}

	}

}
