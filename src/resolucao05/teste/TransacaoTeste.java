package resolucao05.teste;

import resolucao05.dominio.Transacao;

import java.util.Scanner;

public class TransacaoTeste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String entrada = scanner.nextLine();
        // Use o método split para dividir a string com base na vírgula
        String[] partes = entrada.split(",");

        // Verifique se há 4 partes
        if (partes.length == 4) {
            String descricao = partes[2];
            String data = partes[0];
            String hora = partes[1];
            double valor = Double.parseDouble(partes[3]);
            // Crie um objeto Transacao com os valores obtidos
        Transacao transacao = new Transacao(data, hora, descricao, valor);
        transacao.imprimir();
        } else {
            System.out.println("Dados incompletos.");
        }

    }
}
