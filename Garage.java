public class Garage {

  Auto array[];
  array = new Auto [10];
 //metodo inserisci in posizione n, se vuota
  public boolean parcheggiatore (int posizione, Auto auto) {
    if (array[posizione]==null){
      array[posizione]=auto;
      return true;
    } 
    return false;
  }


  //metodo togli dalla posizione n, se piena
  public Auto preleva (int posizione) {
    if(array[posizione]!=null) {
      Auto temp=array[posizione];
      array[posizione]=null;
      return temp;
    }
    return null;
  }

  //toString()

}