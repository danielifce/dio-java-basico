package Apredizado.Daniel.variaveisMetodos;

public class ComparaObjetos {
    public static void main(String[] args) {
        String nome1 = "João";
        String nome2 = "João";
        String nome3 = new String("João");

        boolean resultadoString = (nome1 == nome2); // As variáveis nome1 e nome2 tem mesmo endereço e aponta para "João". Por isso é true.
        System.out.println(resultadoString);

        resultadoString = (nome1.equals(nome3)); // "João" é o resultado da variável nome1 e "João" é o resultado da variável nome3. Por isso é true.
        System.out.println(resultadoString);

        resultadoString = (nome1==nome3); // As variáveis tem endereços diferentes, embora mesmo resultado. Por isso é false, comparou os endereços.
        System.out.println(resultadoString);
    }

}
