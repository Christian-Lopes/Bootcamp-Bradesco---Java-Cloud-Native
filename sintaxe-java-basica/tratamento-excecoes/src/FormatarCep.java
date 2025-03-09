public class FormatarCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23.765-06");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("O CEP informado não correspode as regras.");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 9) {
            throw new CepInvalidoException();
        }
        return "23.765-06";
    }
}
