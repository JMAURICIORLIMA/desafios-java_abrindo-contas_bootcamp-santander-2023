package resolucao03.teste;

import resolucao03.dominio.CofreDigital;
import resolucao03.dominio.CofreFisico;

import java.util.Scanner;

public class CofreTeste {

    public static void main(String[] args) {

        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {
            int senha = scanner.nextInt();
            CofreDigital cofreDigital = new CofreDigital(senha);
            senha = scanner.nextInt();
            cofreDigital.imprimirInformacoes();
            cofreDigital.validarSenha(senha);
        } else {
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
        }
    }
}
