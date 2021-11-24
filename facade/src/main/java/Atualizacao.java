public class Atualizacao {
    public boolean atualizar(){
        return AtualizacaoFacade.verificaPendenteParaAtualizar(this);
    }
}
