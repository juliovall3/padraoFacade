public class AtualizacaoFacade {

    public static boolean verificaPendenteParaAtualizar(Atualizacao atualizacao){
        if (Bateria.getInstancia().verificaPendenteParaAtualizar(atualizacao)){
            return false;
        }

        if (Espaco.getInstancia().verificaPendenteParaAtualizar(atualizacao)){
            return false;
        }
        return true;
    }
}
