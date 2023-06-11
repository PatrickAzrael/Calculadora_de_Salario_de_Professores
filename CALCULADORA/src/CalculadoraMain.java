
public class CalculadoraMain {
    public static void main(String[] args) {

        EntradaDeDados entradaDeDados = new EntradaDeDados();
        entradaDeDados.EntradaNome();
        entradaDeDados.EntradaInformacaoSalario();
        String name = entradaDeDados.getNome();
        Double Salario = entradaDeDados.getSalario();

        System.out.printf("O profissional [%s], recebe o salário de [%f R$]", name, Salario);

    }
}
