public class AtualizacaoTest {

    @Test
    void deveRetornarPendenciaBateria() {
        Atualizacao atualizacao = new Atualizacao();
        Bateria.getInstancia().addAtualizacaoPendente(atualizacao);

        assertEquals(false, atualizacao.atualizar());
    }

    @Test
    void deveRetornarPendeciaEspaco() {
        Atualizacao atualizacao = new Atualizacao();
        Espaco.getInstancia().addAtualizacaoPendente(atualizacao);

        assertEquals(false, atualizacao.atualizar());
    }


    @Test
    void deveRetornarQuePodeAtulizar() {
        Atualizacao atualizacao = new Atualizacao();

        assertEquals(true, atualizacao.atualizar());
    }

}
