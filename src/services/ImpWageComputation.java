package services;

import interfa.IWageComputation;

public class ImpWageComputation implements  IWageComputation {
    public   void displaymessage() {
    	System.out.println("Welcome To Employement Wage Computation");
    }
    
    private int employeesParsent() {
    	int parsent=(int)(Math.random()*100+20);
    	return parsent;
    }
    
    private int employeesWagePerDay(int Timehour,int Wagehour,int numberOfEmployees) {
    	int wagePerDay=Timehour*Wagehour*numberOfEmployees;
    	return wagePerDay;
    }

	public int employeesParsentFullTime() {
		int persent=employeesParsent();
		System.out.println("Full_Time Employees present :: "+persent);
		return persent;
	}

	public int dailyFullTimeEmployeeWage(int wageperHour, int fullDayHour, int numberOfEmployees) {
		int wagePerDay=employeesWagePerDay(wageperHour,fullDayHour,numberOfEmployees);
		System.out.println("Part_Time Employees present ::"+wagePerDay);
		
		return wagePerDay;
	}

	public int employeesPresentpartTime() {
		int parsent =employeesPresentpartTime()/3;
		System.out.println("EmployementWage for a part_Timer per Day::"+parsent+'\n');
		return parsent;
	}

	public int dailypartTimeEmployeeWage(int wagePerhour, int partTimeHour, int numberOfEmployees) {
		int wagePerDay=employeesWagePerDay(wagePerhour,partTimeHour,numberOfEmployees);
		System.out.println("EmployementWage for a part_Timer per Day"+wagePerDay);
		
		return wagePerDay;
	}

	public int wageForMonth(int workingDays, int wageperHour, int Timehour) {
		int totalMonth=0;
		for(int i=1;i<=workingDays;i++) {
			int numberOfEmployee=employeesParsent();
			int numberOfEmployess;
			System.out.println("Wage on Day{"+i+"}):: "+employeesWagePerDay(wageperHour,Timehour,numberOfEmployess));
		    Object numberofEmployees;
			totalWageForMonth=wageForMonth(0, 0, 0) + employeesWageperDay(wageperHour,Timehour,numberofEmployees);	
		}
		System.out.println("Total wage Given To All The Employees for the Month "+totalWageForMonth);
		return totalWageForMonth;
		
		return 0;
	}

	public void workingHoursOrDayReachFirst(int timeHour) {
		byte day =0;
		for(int i=1;i<=100;i++) {
			if(i%timeHour==0) {
				day=(byte)(day +1);
			}else {
				day=(byte)(day+0);
			}
		}
		System.out.println(day<20?"total working hour");
		
	}
}
