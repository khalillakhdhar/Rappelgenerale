package classes;

public class Income extends Transaction {
private String source;
private String description;
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Income(String titre, String date, float montant, String source, String description) {
	super(titre, date, montant);
	this.source = source;
	this.description = description;
}
public double getTaxe()
{
	if(this.getMontant()<1000)
	{
		return this.getMontant()*0.15;
		
	}
	else
		return this.getMontant()*0.2;

}
}
