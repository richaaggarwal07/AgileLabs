import java.util.Scanner;
public class MonthlySalaryOfEmploy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the salary Amount");
		Scanner s = new Scanner(System.in);
		int sal = s.nextInt();
		if(sal<100000) {
			sal = sal+(15*sal)/100;
			System.out.println("final Salary is of " + sal +"after 15% increement");
		}
		else if(sal>100000 && sal<200000) {
			sal = sal+(10*sal)/100;
			System.out.println("final Salary is of " + sal +"after 10% increement");	
		}
		else {
			sal = sal+(5*sal)/100;
			System.out.println("final Salary is of " + sal +"after 5% increement");
		}
		
		

	}

}
