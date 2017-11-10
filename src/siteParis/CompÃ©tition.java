package siteParis;

import java.util.Collection;
import java.util.LinkedList;
import java.util.*;


public class Compétition {

	/**
	 * @uml.property  name="resultat"
	 */
	private String resultat;

	/**
	 * Getter of the property <tt>resultat</tt>
	 * @return  Returns the resultat.
	 * @uml.property  name="resultat"
	 */
	public String getResultat() {
		return resultat;
	}

	/**
	 * Setter of the property <tt>resultat</tt>
	 * @param resultat  The resultat to set.
	 * @uml.property  name="resultat"
	 */
	public void setResultat(String resultat) {
		this.resultat = resultat;
	}

	/**
	 * @uml.property  name="lieu"
	 */
	private String lieu;

	/**
	 * Getter of the property <tt>lieu</tt>
	 * @return  Returns the lieu.
	 * @uml.property  name="lieu"
	 */
	public String getLieu() {
		return lieu;
	}

	/**
	 * Setter of the property <tt>lieu</tt>
	 * @param lieu  The lieu to set.
	 * @uml.property  name="lieu"
	 */
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

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
		 */
		public Compétition(){
      
		}
      public Compétition(String nom, DateFrancaise date){
         this.nom = nom;
         dateFrancaise = date;
         competiteurs= new LinkedList<Competiteur>();
      
		}

			
			/**
			 */
			public void ajouterCompetition(){
			}

			/** 
			 * @uml.property name="paris"
			 * @uml.associationEnd multiplicity="(0 -1)" inverse="compétition:siteParis.Pari"
			 * @uml.association name="contient"
			 */
			private Collection paris;

			/** 
			 * Getter of the property <tt>paris</tt>
			 * @return  Returns the paris.
			 * @uml.property  name="paris"
			 */
			public Collection getParis() {
				return paris;
			}
         public void addPari(Pari p){
            paris.add(p);
         }

			/** 
			 * Setter of the property <tt>paris</tt>
			 * @param paris  The paris to set.
			 * @uml.property  name="paris"
			 */
			public void setParis(Collection paris) {
				this.paris = paris;
			}

			/** 
			 * @uml.property name="competiteur"
			 * @uml.associationEnd multiplicity="(2 -1)" ordering="true" inverse="compétition:siteParis.Competiteur"
			 * @uml.association name="contient"
			 */
			private LinkedList competiteurs;

			/** 
			 * Getter of the property <tt>competiteur</tt>
			 * @return  Returns the competiteurs.
			 * @uml.property  name="competiteur"
			 */
			public LinkedList getCompetiteur() {
				return competiteurs;
			}

			/** 
			 * Setter of the property <tt>competiteur</tt>
			 * @param competiteur  The competiteurs to set.
			 * @uml.property  name="competiteur"
			 */
			public void setCompetiteur(LinkedList competiteur) {
				competiteurs = competiteur;
			}
         
         public void addCompetiteur(Competiteur c){
            competiteurs.add(c);}
         

			/** 
			 * @uml.property name="dateFrancaise"
			 * @uml.associationEnd multiplicity="(1 1)" inverse="compétition:siteParis.DateFrancaise"
			 * @uml.association name="possède"
			 */
			private DateFrancaise dateFrancaise; //= new siteParis.DateFrancaise(null);

			/** 
			 * Getter of the property <tt>dateFrancaise</tt>
			 * @return  Returns the dateFrancaise.
			 * @uml.property  name="dateFrancaise"
			 */
			public DateFrancaise getDateFrancaise() {
				return dateFrancaise;
			}

			/** 
			 * Setter of the property <tt>dateFrancaise</tt>
			 * @param dateFrancaise  The dateFrancaise to set.
			 * @uml.property  name="dateFrancaise"
			 */
			public void setDateFrancaise(DateFrancaise dateFrancaise) {
				this.dateFrancaise = dateFrancaise;
			}

}
