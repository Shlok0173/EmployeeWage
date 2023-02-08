package model;

public class Computation {
       public final int wagePerHour=20;
       public final int fullDayHour=8;
       private int partTimer;
       private int fullTimeWage;
       private int partTimeWage;
       private int presentPartTime;
       private int parsentFullTime;
       private int wageForMonth;
	public int getPartTimer() {
		return partTimer;
	}
	public void setPartTimer(int partTimer) {
		this.partTimer = partTimer;
	}
	public int getFullTimeWage() {
		return fullTimeWage;
	}
	public void setFullTimeWage(int fullTimeWage) {
		this.fullTimeWage = fullTimeWage;
	}
	public int getPartTimeWage() {
		return partTimeWage;
	}
	public void setPartTimeWage(int partTimeWage) {
		this.partTimeWage = partTimeWage;
	}
	public int getPresentPartTime() {
		return presentPartTime;
	}
	public void setPresentPartTime(int presentPartTime) {
		this.presentPartTime = presentPartTime;
	}
	public int getParsentFullTime() {
		return parsentFullTime;
	}
	public void setParsentFullTime(int parsentFullTime) {
		this.parsentFullTime = parsentFullTime;
	}
	public int getWageForMonth() {
		return wageForMonth;
	}
	public void setWageForMonth(int wageForMonth) {
		this.wageForMonth = wageForMonth;
	}
	public int getWagePerHour() {
		return wagePerHour;
	}
	public int getFullDayHour() {
		return fullDayHour;
	}
       
       
}
