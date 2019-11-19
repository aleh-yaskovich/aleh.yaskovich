package by.htp.task5.view;

import java.util.Scanner;

public class CountView {
	
	public void ViewCount(int count) {
		System.out.println("Значение счетчика равно: " + count);
	}
	
	public String EnterPlusMinus () {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Если Вы хотите увеличить или уменьшить счетчик на 1, введите \"+\" или \"-\": ");
	    while(!sc.hasNext("[+-]")) {
	        sc.next();
	        System.out.print("Введите \"+\" или \"-\": ");
	    }
	    String plusMinus = sc.next();
	    return plusMinus;
	}
	
	public void NegativeResult(int countChange) {
		if (countChange < 0) {
			System.out.println("Значение счетчика не может быть меньше 0");
		} else if (countChange > 9) {
			System.out.println("Значение счетчика не может быть больше 9");
		}
	}
	
}
