public class BoloCenoura implements Bolo{
    @Override
    public void preparar(String produto) {
        System.out.println("Preparando o bolo de " + produto);
    }
}
