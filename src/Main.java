public class Main {
    public static void main(String[] args) {
        TabelaComAnnotation tabelaComAnnotation = new TabelaComAnnotation();
        TabelaAnnotation tabelaAnnotation = tabelaComAnnotation.getClass().getAnnotation(TabelaAnnotation.class);
        String nomeTabela = tabelaAnnotation.value();

        System.out.println(nomeTabela);
    }
}