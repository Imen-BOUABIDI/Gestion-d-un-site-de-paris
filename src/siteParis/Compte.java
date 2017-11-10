package siteParis;


public class Compte {

	/**
	 * @uml.property  name="nbreJetons"
	 */
	private String nbreJetons;
   private long nbreTotalJetons;

	/**
	 * Getter of the property <tt>nbreJetons</tt>
	 * @return  Returns the nbreJetons.
	 * @uml.property  name="nbreJetons"
	 */
	public String getNbreJetons() {
		return nbreJetons;
	}

	/**
	 * Setter of the property <tt>nbreJetons</tt>
	 * @param nbreJetons  The nbreJetons to set.
	 * @uml.property  name="nbreJetons"
	 */
	public void setNbreJetons(String nbreJetons) {
		this.nbreJetons = nbreJetons;
	}

		
		/**
		 */
		public long getJetons(){
       return nbreTotalJetons;
		}
     public void setJetons(long jetons){ nbreTotalJetons= jetons;} 

			
			/**
			 */
			public Compte(){
			}

}
