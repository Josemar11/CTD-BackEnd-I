public class ServicoBaixar implements Baixar {

    @Override
    public void baixarTema(String tema, String tipoUsuario) {
        System.out.println("Usuário PREMIUM: O tema "+tema+" pode ser baixado.");
    }

}
