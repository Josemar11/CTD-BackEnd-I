public class Main {

    public static void main(String[] args) {

        SerieProxy serieProxy = new SerieProxy(new Serie());

        try {
            System.out.println(serieProxy.getSerie("loki"));
            System.out.println(serieProxy.getSerie("gambitodarainha"));
            System.out.println(serieProxy.getSerie("strangerthings"));
            System.out.println(serieProxy.getSerie("atypical"));
            System.out.println(serieProxy.getSerie("elite"));
            System.out.println(serieProxy.getSerie("cidadededeus"));        }
        catch (SerieNaoHabilitadaException e) {
            System.out.println(e);
        }

    }

}
