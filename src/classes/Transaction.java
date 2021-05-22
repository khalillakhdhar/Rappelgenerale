package classes;

public class Transaction {
private String titre,date;
private float montant;
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public float getMontant() {
	return montant;
}
public void setMontant(float montant) {
	this.montant = montant;
}
public Transaction(String titre, String date, float montant) {
	this.titre = titre;
	this.date = date;
	this.montant = montant;
}
public Transaction() {
}




}
