import org.junit.jupiter.api.Test;

class UsuarioTest {

    @Test
    public void cadastrar1() {
        Usuario u1 = new Usuario("10", "Premium");
        Baixar baixar = new ServicoBaixarProxy();
        baixar.baixarTema("007 - Permissão para Matar", u1.getTipo());
    }

    @Test
    public void cadastrar2() {
        Usuario u2 = new Usuario("11", "Free");
        Baixar baixar = new ServicoBaixarProxy();
        baixar.baixarTema("Mad Max: Estrada da Fúria", u2.getTipo());
    }

}