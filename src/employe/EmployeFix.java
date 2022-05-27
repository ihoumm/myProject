package employe;

public class EmployeFix extends EmployePere {

		public EmployeFix(String name, String lastName, int Age) {
		super(name, lastName, Age);
		// TODO Auto-generated constructor stub
	}

		private Double salaire;

		/**
		 * @return the salaire
		 */
		public Double getSalaire() {
			return salaire;
		}

		/**
		 * @param salaire the salaire to set
		 */
		public void setSalaire(Double salaire) {
			this.salaire = salaire;
		}

		@Override
		public String toString() {
			return "EmployeFix [salaire=" + salaire + "]";
		}


}
