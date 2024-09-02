public class Main {
    public static void main(String[] args) {
        Double  lista = new Double();

        lista.addFinal(2);
        lista.addFinal(1);
        lista.addComeco(11);
        lista.printando();

        lista.deleteComeco();
        lista.printando();

        lista.deleteFim();
        lista.printando();

        lista.addFinal(22);
        lista.addFinal(44);
        lista.printando();}
}