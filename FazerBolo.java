
public class FazerBolo {
    private final FabricaBolo fabricaBolo;

    public FazerBolo(FabricaBolo fabricaBolo) {
        this.fabricaBolo = fabricaBolo;
    }

    public void fazendoBolo(String produto) {
        
        fabricaBolo.fazerBolo(); 
        
        Bolo bolo = fabricaBolo.criarBolo();
        bolo.preparar(produto);
        
    }
}
