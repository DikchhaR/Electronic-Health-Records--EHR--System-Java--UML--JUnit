package Assignment1;

public class MyHealthData extends MyHealthDataBase{
		
		private String firstName;
		private String lastName;
		private String gender;
		private int birthYear;
		private int currentYear;
		private double height;
		private double weight;
			
		public MyHealthData(String firstName,String lastName, String gender, double height, double weight, int birthYear, int currentYear){
			
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
			this.birthYear = birthYear;
			this.currentYear = currentYear;
			this.height = height;
			this.weight = weight;
			
			
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public int getBirthYear() {
			return birthYear;
		}

		public void setBirthYear(int birthYear) {
			this.birthYear = birthYear;
		}

		public int getCurrentYear() {
			return currentYear;
		}


		public double getHeight() {
			return height;
		}

		public void setHeight(double height) {
			this.height = height;
		}

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}
		public int getAge(){
			int age = getCurrentYear()-birthYear;
			return age;
		}
		
		public int getMaximumHeartRate(){
			return 220-getAge();
		}
		public double getMinimumTargetHeartRate(){
			return (50/100.00)*getMaximumHeartRate();
		}
		public double getMaximumTargetHeartRate() {
			return (85/100.00)*getMaximumHeartRate();
			
		}

		
		
		

}


