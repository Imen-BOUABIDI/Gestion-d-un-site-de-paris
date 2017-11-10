package siteParis;


public class Gestionnaire extends Personne {

		
		/**
		 */
		public Gestionnaire(){
		}

		/**
		 * @uml.property  name="password"
		 */
		private String password;

		/**
		 * Getter of the property <tt>password</tt>
		 * @return  Returns the password.
		 * @uml.property  name="password"
		 */
		public String getPassword() {
			return password;
		}

		/**
		 * Setter of the property <tt>password</tt>
		 * @param password  The password to set.
		 * @uml.property  name="password"
		 */
		public void setPassword(String password) {
			this.password = password;
		}

}
