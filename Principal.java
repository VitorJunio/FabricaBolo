
public class Principal {

    public static void main(String[] args) {
        FazerBolo boloChocolate = new FazerBolo(new FabricaBoloChocolate());
        boloChocolate.fazendoBolo("Chocolate");
        
        FazerBolo boloMorango = new FazerBolo(new FabricaBoloMorango());
        boloMorango.fazendoBolo("Morango");
        
        FazerBolo boloCenoura = new FazerBolo(new FabricaBoloCenoura());
        boloCenoura.fazendoBolo("Cenoura");
        
        FazerBolo boloAbacaxi = new FazerBolo(new FabricaBoloAbacaxii());
        boloAbacaxi.fazendoBolo("Abacaxi");
        
    }
}
