import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
       System.out.println("Orosz Levente, Szotf-II-N, 2022-10-25");
       Nyilvantarto nyilvantarto = new Nyilvantarto();
       ArrayList<String> nevLista = nyilvantarto.getNames();
       for(String nev : nevLista) {
        System.out.println(nev);
       }
    }
}
