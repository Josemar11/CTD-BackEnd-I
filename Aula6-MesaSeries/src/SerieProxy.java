public class SerieProxy implements ISerie {

    private Serie serie;
    private int contadorDeSeries;

    public SerieProxy(Serie s) {
        this.serie = s;
        this.contadorDeSeries = 0;
    }

    @Override
    public String getSerie(String nomeDaSerie) throws SerieNaoHabilitadaException {

        if (this.contadorDeSeries > 4) {
            throw new SerieNaoHabilitadaException(
                    "Número de séries semanais atingido."
            );
        }

            this.contadorDeSeries++;
            return this.serie.getSerie(nomeDaSerie);
        }
}
