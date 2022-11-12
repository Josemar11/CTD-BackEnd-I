public class Serie implements ISerie {

    @Override
    public String getSerie(String nomeDaSerie) {
        return "www." + nomeDaSerie + ".com";
    }

}
