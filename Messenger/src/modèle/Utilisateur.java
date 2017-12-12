/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modèle;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import static modèle.Etat.toEtat;

/**
 *
 * @author lulauriche
 */
public  class Utilisateur implements Observable{
    private ObservableList<Utilisateur> listContact;

    private Etat statut;
    private boolean connect=false;
    
    private final StringProperty nom;
    private final StringProperty prenom;
    private final StringProperty pseudo;
    private final StringProperty mdp;
    private final StringProperty adresse;
    private final StringProperty tel;

    public Utilisateur (String nom, String prenom, String pseudo,String mdp, String adresse,String tel, String statut){
        this.nom = new SimpleStringProperty(nom);
        this.prenom = new SimpleStringProperty(prenom);
        this.pseudo = new SimpleStringProperty(pseudo);
        this.mdp = new SimpleStringProperty(mdp);
        this.adresse = new SimpleStringProperty(adresse);
        this.tel = new SimpleStringProperty(tel);
        this.statut=toEtat(statut);
    }
    
    public Utilisateur (String nom, String prenom, String pseudo,String mdp, String adresse,String tel){
        this.nom = new SimpleStringProperty(nom);
        this.prenom = new SimpleStringProperty(prenom);
        this.pseudo = new SimpleStringProperty(pseudo);
        this.mdp = new SimpleStringProperty(mdp);
        this.adresse = new SimpleStringProperty(adresse);
        this.tel = new SimpleStringProperty(tel);
        this.statut=toEtat("HORS_LIGNE");
    }
    
    //<editor-fold desc="Getter/Setter" defaultstate="collapsed">
    public ObservableList<Utilisateur> getListContact() {
        return listContact;
    }

    public void setListContact(ObservableList<Utilisateur> listContact) {
        this.listContact = listContact;
    }

    public String getNom() {
        return nom.get();
    }

    public String getPrenom() {
        return prenom.get();
    }

    public String getPseudo() {
        return pseudo.get();
    }
    
    public String getMdp() {
        return mdp.get();
    }
    
    public String getAdresse() {
        return adresse.get();
    }
    
    public String getTel() {
        return tel.get();
    }

    //Setters
    public void setNom(String value) {
        nom.set(value);
    }

    public void setPrenom(String value) {
        prenom.set(value);
    }

    public void setPseudo(String value) {
        pseudo.set(value);
    }
    
    public void setMdp(String value) {
        mdp.set(value);
    }
    
    public void setAdresse(String value) {
        adresse.set(value);
    }
    
    public void setTel(String value) {
        tel.set(value);
    }

    //Property values
    public StringProperty nomProperty() {
        return nom;
    }

    public StringProperty pseudoProperty() {
        return pseudo;
    }

    public StringProperty prenomProperty() {
        return prenom;
    }

    public StringProperty mdpProperty() {
        return mdp;
    }

    public StringProperty adresseProperty() {
        return adresse;
    }

    public StringProperty telProperty() {
        return tel;
    }

    public Etat getStatut() {
        return statut;
    }

    public void setStatut() {
        if(isConnect()){
            this.statut=Etat.LIGNE;
        }
        else {
            this.statut=Etat.HORS_LIGNE;
        }        
    }

    public boolean isConnect() {
        return connect;
    }

    public void setConnect(boolean connect) {
        this.connect = connect;
    }
    //</editor-fold>
    
    
    // Methode abstraite d'observable
    @Override
    public void addListener(InvalidationListener listener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeListener(InvalidationListener listener) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
   public String toString(){
       return "Nom: "+this.getNom()+" Prénom: "+this.getPrenom();
   }
    
}
