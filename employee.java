package project;

import java.util.Scanner;

/**
 *
 * @author Xuan Vinh
 */
public class Employee{
    int empid;
    String name;
    float salary,salaryGrading,benefitGrading;
    void employee(){
        this.empid=0;
        this.benefitGrading=0;
        this.name="";
        this.salary=0;
        this.salaryGrading=0;
    }
   float calSalary() {
	return	this.salary = 100 * (1 + this.salaryGrading + this.benefitGrading);
    }
   void input() {
		Scanner objSc = new Scanner(System.in);

		System.out.print("Id: ");
		this.empid = objSc.nextInt();
                objSc.nextLine();
                
		System.out.print("Name: ");
		this.name = objSc.nextLine();

		System.out.print("Salary Grading: ");
		this.salaryGrading = objSc.nextInt();

		System.out.print("Benefit Grading: ");
		this.benefitGrading = objSc.nextInt();

    }
   void output() {
		System.out.println();
		System.out.println("- Id: " + this.empid);
		System.out.println("- Name: " + this.name);
		System.out.println("- Salary: " + this.salary);

    }
}

