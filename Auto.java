public class Auto{
String marca;
String colore;
int matricola;

public Auto(String marca, String colore, int matricola){
  this.marca=marca;
  this.colore=colore;
  this.matricola=matricola;
}

public String getMarca(){return marca;}
public String getColore(){return colore;}
public int getMatricola(){return matricola;}

public void setMarca(){this.marca=marca;}
public void setColore(){this.colore=colore;}
public void setMatricola(){this.matricola=matricola;}

public String toString(){
return"Auto{"+"marca "+marca+"colore "+colore+"matricola "+matricola+"}";


}
}   