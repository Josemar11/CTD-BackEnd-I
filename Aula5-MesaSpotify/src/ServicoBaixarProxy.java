public class ServicoBaixarProxy implements Baixar {

    @Override
    public void baixarTema(String tema, String tipoUsuario) {
        if (userHabilitado(tipoUsuario)) {
            ServicoBaixar servicoBaixar = new ServicoBaixar();
            servicoBaixar.baixarTema(tema, tipoUsuario);
        } else {
            System.out.println("Este usuário não é PREMIUM - sem permissão para baixar.");
        }
    }

    public boolean userHabilitado(String tipo) {
        return tipo.equals("Premium");
    }

}
