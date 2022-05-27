package employe;

public class EmployePere {
	
		// TODO Auto-generated method stub
		private String name;
		private String lastName;
		private int Age;
		
		public EmployePere(String name, String lastName, int age) {
			// TODO Auto-generated constructor stub
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the lastName
		 */
		public String getLastName() {
			return lastName;
		}
		/**
		 * @param lastName the lastName to set
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		/**
		 * @return the age
		 */
		public int getAge() {
			return Age;
		}
		/**
		 * @param age the age to set
		 */
		public void setAge(int age) {
			Age = age;
		}
		@Override
		public String toString() {
			return "EmployePere [name=" + name + ", lastName=" + lastName + ", Age=" + Age + "]";
		}
	

}
