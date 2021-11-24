import java.util.ArrayList;
import java.util.List;

public abstract class Central {

    private List<Atualizacao> atualizacaoPendente = new ArrayList<>();

    public void addAtualizacaoPendente(Atualizacao atualizacao){
        this.atualizacaoPendente.add(atualizacao);
    }

    public boolean verificaPendenteParaAtualizar(Atualizacao atualizacao){
        return atualizacaoPendente.contains(atualizacao);
    }
}
