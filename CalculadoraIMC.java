import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome:");
        String nome = scanner.nextLine();

        System.out.println("Gênero (M para Masculino, F para Feminino, N para não informar):");
        char genero = scanner.next().charAt(0);

        System.out.println("Altura em metros (use vírgula ou ponto para separar a parte decimal):");
        String alturaInput = scanner.next();

        double altura;
        if (alturaInput.contains(".") || alturaInput.contains(",")) {
            altura = Double.parseDouble(alturaInput.replace(',', '.'));
        } else {
            int alturaInt = Integer.parseInt(alturaInput);
            altura = alturaInt / 100.0;
        }

        System.out.println("Peso em quilogramas:");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);
        String classificacao;

        if (imc < 20) {
            classificacao = "Abaixo do Normal";
        } else if (imc < 25) {
            classificacao = "Normal";
        } else if (imc < 30) {
            classificacao = "Obesidade Leve";
        } else if (imc < 40) {
            classificacao = "Obesidade Moderada";
        } else {
            classificacao = "Obesidade Mórbida";
        }

        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Peso: " + peso + " quilogramas");
        System.out.println("IMC: " + imc);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}
