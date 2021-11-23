public class Livre{
  String titre;
  String auteur;
  int nbPages;

  public Livre(){};
  public Livre(String x,String v){
    this.titre=x;
    this.auteur=v;
}
  public Livre(String x,String v,int y){
      this.titre=x;
      this.auteur=v;
      this.nbPages=y;
  }

  public String getAuteur(){
      return this.auteur;
  }
  public String getTitre(){
      return this.titre;
  }
  public int getNbPages(){
      return this.nbPages;
  }
  public void setAuteur(String a){
      this.auteur=a;
  }
  public void setTitre(String t){
    this.titre=t;
}
public void setNbPages(int n){
    this.nbPages=n;
}

public String toString(){
    return " Livre [ Titre : "+titre+" Auteur : "+auteur+" Nb pages : "+nbPages+" ]";
}
public boolean plusVolumineuxQue(Livre l){
   return this.nbPages > l.nbPages;
  
}
public boolean aMemeAuteurQue(Livre l){
 return this.auteur==l.auteur;

}

public static boolean plusVolumineuxQue(Livre l1, Livre l2){
    return l1.nbPages>l2.nbPages;
}

public static boolean aMemeAuteurQue(Livre l1,Livre l2){
    return l1.auteur==l2.auteur;
}
 
}