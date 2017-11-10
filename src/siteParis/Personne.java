package siteParis;


public class Personne {

	/**
	 * @uml.property  name="nom"
	 */
	private String nom;

	/**
	 * Getter of the property <tt>nom</tt>
	 * @return  Returns the nom.
	 * @uml.property  name="nom"
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter of the property <tt>nom</tt>
	 * @param nom  The nom to set.
	 * @uml.property  name="nom"
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @uml.property  name="adresse"
	 */
	private String adresse;

	/**
	 * Getter of the property <tt>adresse</tt>
	 * @return  Returns the adresse.
	 * @uml.property  name="adresse"
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Setter of the property <tt>adresse</tt>
	 * @param adresse  The adresse to set.
	 * @uml.property  name="adresse"
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

		
		/**
		 */
		public void Personne(String nom){
         this.nom = nom;
		}

}
