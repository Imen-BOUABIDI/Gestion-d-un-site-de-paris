package siteParis;
import java.util.UUID;
import java.util.*;


public class Joueur extends Personne {
   private String nom;
   private String prenom;
   private String pseudo;
	private LinkedList<Pari> paris;	
		/**
		 */
		public Joueur (){
      
		}
      public Joueur(String nom, String prenom, String pseudo) {
        this.nom = nom;
         this.prenom = prenom;
         this.pseudo = pseudo;
         paris = new LinkedList<Pari>();
         
          }
         
       public String getNom() {
			return nom;
		}
      public String getPrenom() {
			return prenom;
		}
      public String getPseudo() {
			return pseudo;
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
     public String generatePass() {
			return UUID.randomUUID().toString();
          
		}
     public void addPari(Pari p){
            paris.add(p);
         }
		/**
		 * Setter of the property <tt>password</tt>
		 * @param password  The password to set.
		 * @uml.property  name="password"
		 */
		public void setPassword(String password) {
			this.password = password;
		}

			
			/**
			 */
			public void Joueur(String a, String password){
         
			}

			/** 
			 * @uml.property name="compte"
			 * @uml.associationEnd multiplicity="(1 1)" inverse="joueur:siteParis.Compte"
			 * @uml.association name="possède"
			 */
			private Compte compte = new siteParis.Compte();

			/** 
			 * Getter of the property <tt>compte</tt>
			 * @return  Returns the compte.
			 * @uml.property  name="compte"
			 */
			public Compte getCompte() {
				return compte;
			}

			/** 
			 * Setter of the property <tt>compte</tt>
			 * @param compte  The compte to set.
			 * @uml.property  name="compte"
			 */
			public void setCompte(Compte compte) {
				this.compte = compte;
			}
    public long getSommeEnJetons(){
     return compte.getJetons();
     }
   public void setSommeEnJetons(long jetons){
      compte.setJetons(jetons);
     }
}
