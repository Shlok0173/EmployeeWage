package interfa;

public interface IWageComputation {
     void displaymessage();
     int employeesParsentFullTime();
     int dailyFullTimeEmployeeWage(int wageperHour,int fullDayHour,int numberOfEmployees);
     int employeesPresentpartTime();
     int dailypartTimeEmployeeWage(int wagePerhOUR,int partTimeHour,int numberOfEmployees);
     int wageForMonth(int workingDays,int wageperHour,int Timehour);
     void workingHoursOrDayReachFirst(int tomeHour);
}
