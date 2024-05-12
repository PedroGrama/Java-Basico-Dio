package empresa;

public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException(int parametroDois, int parametroUm) {
        if (parametroUm >= parametroDois) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");

        }
    }

}
