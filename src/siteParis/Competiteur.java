package siteParis;


public class Competiteur extends Personne {

	/**
	 * @uml.property  name="age"
	 */
	private String age;

	/**
	 * Getter of the property <tt>age</tt>
	 * @return  Returns the age.
	 * @uml.property  name="age"
	 */
	public String getAge() {
		return age;
	}

	/**
	 * Setter of the property <tt>age</tt>
	 * @param age  The age to set.
	 * @uml.property  name="age"
	 */
	public void setAge(String age) {
		this.age = age;
	}

		
		/**
		 */
		public Competiteur(){
		}
      public Competiteur(String nom){ 
         super.Personne(nom);
         
 		}
}
