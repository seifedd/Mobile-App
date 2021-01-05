package projet15;
import java.sql.*;


public  class connexionJM {
	Connection conn=null;

	    public static Connection dBconnector () {
	       try {
	          // chargement de la classe par son nom
	         Class c = Class.forName("com.mysql.jdbc.Driver") ;
	         Driver pilote = (Driver)c.newInstance() ;
	          // enregistrement du pilote aupr�s du DriverManager
	         DriverManager.registerDriver(pilote);
	          // Protocole de connexion
	         String protocole =  "jdbc:mysql:" ;
	          // Adresse IP de l�h�te de la base et port
	         String ip =  "localhost" ;  // d�pend du contexte
	         String port =  "3306" ;  // port MySQL par d�faut
	          // Nom de la base ;
	         String nomBase =  "mydb" ;  // d�pend du contexte
	          // Cha�ne de connexion
	         String conString = protocole +  "//" + ip +  ":" + port +  "/" + nomBase ;
	          // Identifiants de connexion et mot de passe
	         String nomConnexion =  "root" ;  // d�pend du contexte
	         String motDePasse =  "root" ;  // d�pend du contexte
	          // Connexion
	         Connection con = DriverManager.getConnection(
	            conString, nomConnexion, motDePasse) ;
                
	          return con;
	         
	          
	          
	          
	      }  catch (Exception e) {
	          	System.out.println(e.getMessage());
				return null;
	   }
	
	   }
}
