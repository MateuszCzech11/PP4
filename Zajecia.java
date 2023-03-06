public class Zajecia {
    String nazwaZajec;
    int wielkoscGrupy =0;

    public Zajecia(String nazwaZajec) {
        this.nazwaZajec = nazwaZajec;
    }
    
    public void zapiszStudenta(){
        if(wielkoscGrupy<10){
            wielkoscGrupy++;
        } else{
            System.out.println("Na zajęcia zapisana jest maksymalna ilość osób");
        }
    }
}
