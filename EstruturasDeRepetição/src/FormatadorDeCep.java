public class FormatadorDeCep {

    public static void main(String[] args) {
        try{
        String cepFormatado = formatarCep("00.000-000");
        }
        catch(CepInvalidoException e){
            e.printStackTrace();
        }
    }
}


static String formatarCep(String cep) throws CepInvalidoException {
    if(cep.length() != 8){
        throw new CepInvalidoException("O CEP deve conter 8 dígitos");
    }
    return "00.000-000"//Cep formatado
}
