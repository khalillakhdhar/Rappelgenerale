package classes;

public class Outcome extends Transaction {
String type;
String raison;
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getRaison() {
	return raison;
}
public void setRaison(String raison) {
	this.raison = raison;
}
public Outcome(String titre, String date, float montant, String type, String raison) {
	super(titre, date, montant);
	this.type = type;
	this.raison = raison;
}

}
