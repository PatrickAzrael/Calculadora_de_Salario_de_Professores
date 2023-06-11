import java.util.Scanner;

public class EntradaDeDados {
    private int modopg;
    private String nome;
    private double salario;
    private double horatrabalhada;
    private double valorhora;
    private Scanner leia = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getModopg() {
        return modopg;
    }

    public void setModopg(int modopg) {
        this.modopg = modopg;
    }

    public double getSalario() {
        return salario;
    }

    public double getHoratrabalhada() {
        return horatrabalhada;
    }

    public void setHoratrabalhada(double horatrabalhada) {
        this.horatrabalhada = horatrabalhada;
    }

    public double getValorhora() {
        return valorhora;
    }

    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }

    public void EntradaNome() {
        System.out.println("Informe o nome do profissional: ");
        nome = leia.nextLine();

    }

    public void EntradaInformacaoSalario() {

        System.out.println("Informe o regime de pagamento (CLT,Horista ou PJ) sendo 1, 2 ou 3 respectivamente.");
        modopg = leia.nextInt();

        switch (modopg) {
            case 1:
                if (modopg == 1) {
                    System.out.println("Digite o valor que você recebe mensalmente: ");
                    salario = leia.nextDouble();

                }
                break;
            case 2:
                if (modopg == 2) {
                    System.out.println("Digite as horas trabalhadas: ");
                    horatrabalhada = leia.nextDouble();
                    System.out.println("Digite o valor a receber por hora trabalhada: ");
                    valorhora = leia.nextDouble();
                    salario = horatrabalhada * valorhora;

                }
                break;
            case 3:
                if (modopg == 3) {
                    System.out.println("Informe o valor que você recebe pelo contrato: ");
                    salario = leia.nextDouble();

                }
                break;
        }

    }
}