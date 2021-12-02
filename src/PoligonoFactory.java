public class PoligonoFactory {
    public static IPoligono getPoligono(int numeroLados) {
       try {
           if (numeroLados == 3) {
               return new Triangulo();
           }
           if (numeroLados == 4) {
               return new Quadrado();
           }
           if (numeroLados == 6) {
               return new Hexagono();
           }
           if (numeroLados == 11) {
               return new Eneagono();
           }
       }
       catch(Exception ex){
           throw ex;
        }
        System.out.println("Você tentou buscar um polígono que não está registrado na base.");
        return null;
    }
}