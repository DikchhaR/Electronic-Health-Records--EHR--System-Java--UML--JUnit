package Assignment1;
import java.util.Scanner;

public class MyHealthDataTest {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter First Name => ");
		String fName = scan.next();
		System.out.print("Enter Last Name => ");
		String lName = scan.next();
		System.out.print("Enter Gender => ");
		String gender = scan.next();
		System.out.print ("Enter Height => ");
		Double height = scan.nextDouble();
		System.out.print("Enter Weight => ");
		Double weight = scan.nextDouble();
		System.out.print("Enter Birthyear => ");
		int birthYear = scan.nextInt();
		System.out.print("Enter Current year => ");
		int currentYear = scan.nextInt();
		scan.close();
		
		
		MyHealthData healthData = new MyHealthData(fName,lName,gender,height,weight,birthYear,currentYear);
		
		System.out.printf("%5s %5s %5s %5s %5s %5s %5s %5s %5s %5s %5s\n",
				"First name",
				"Last name",
				"Gender",
				"Birth Year", 
				"Height",
				"Weight",
				"Age",
				"BMI",
				"Maximum Heart Rate",
				"minimum target heart rate",
				"maximum target heart rate");
		System.out.printf("\n%5s %8s %10s %5d %9.2f %5.2f %5d %8.2f %8d %8.2f %8.2f",
				healthData.getFirstName(),
				healthData.getLastName(),
				healthData.getGender(),
				healthData.getBirthYear(),
				healthData.getHeight(),
				healthData.getWeight(),
				healthData.getAge(),
				healthData.calculateBMI(birthYear, currentYear),
				healthData.getMaximumHeartRate(),
				healthData.getMinimumTargetHeartRate(),
				healthData.getMaximumTargetHeartRate()
				);
		
		}
	
	
	
}

