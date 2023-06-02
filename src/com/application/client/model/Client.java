package com.application.client.model;

public class Client {
	
	
private String Code_Client;
private String Civilite;
private String Non_RaisonSocial;
private String Code_TVA;
private Boolean Exonere;
private String Adresse;
private String Ville;
private int Tel;
private int Fax;

public Client(String code_Client, String civilite, String non_RaisonSocial, String code_TVA, Boolean exonere,
		String adresse, String ville, int tel, int fax) {
	super();
	Code_Client = code_Client;
	Civilite = civilite;
	Non_RaisonSocial = non_RaisonSocial;
	Code_TVA = code_TVA;
	Exonere = exonere;
	Adresse = adresse;
	Ville = ville;
	Tel = tel;
	Fax = fax;
}

public String getCode_Client() {
	return Code_Client;
}
public void setCode_Client(String code_Client) {
	Code_Client = code_Client;
}
public String getCivilite() {
	return Civilite;
}
public void setCivilite(String civilite) {
	Civilite = civilite;
}
public String getNon_RaisonSocial() {
	return Non_RaisonSocial;
}
public void setNon_RaisonSocial(String non_RaisonSocial) {
	Non_RaisonSocial = non_RaisonSocial;
}
public String getCode_TVA() {
	return Code_TVA;
}
public void setCode_TVA(String code_TVA) {
	Code_TVA = code_TVA;
}
public Boolean getExonere() {
	return Exonere;
}
public void setExonere(Boolean exonere) {
	Exonere = exonere;
}
public String getAdresse() {
	return Adresse;
}
public void setAdresse(String adresse) {
	Adresse = adresse;
}
public String getVille() {
	return Ville;
}
public void setVille(String ville) {
	Ville = ville;
}
public int getTel() {
	return Tel;
}
public void setTel(int tel) {
	Tel = tel;
}
public int getFax() {
	return Fax;
}
public void setFax(int fax) {
	Fax = fax;
}



}
