package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        cadastroCliente();
        produtoCliente();
        formaDePagamento();
    }
    public static void cadastroCliente(){
        Scanner digitar = new Scanner(System.in);

        System.out.println("nome do Cliente");
        String nome = digitar.nextLine();
        System.out.println("CPF do cliente");
        String cpf = digitar.nextLine();

        Cliente Cliente = new Cliente(nome,cpf);

    }

    public static void produtoCliente(){
        Scanner digitar = new Scanner(System.in);

        System.out.println("digite o codigo do oculos");
        int codigo = digitar.nextInt();
        System.out.println("Digite o Valor do Oculos");
        double valor = digitar.nextInt();

        Produto produto = new Produto(codigo,valor);

    }

    public static void formaDePagamento(){
        Scanner digitar = new Scanner(System.in);

        System.out.println("Digite qual forma de pagamento");
        System.out.println("1 - Dinheiro / 2 - Débito / 3 - Crédito / 4 - Crediario");
        int opcao = digitar.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Pagamento realizado");
                break;

            case 2:
                System.out.println("Pagamento realizado");
                break;

            case 3:
                System.out.println("Pagamento realizado");
                break;

            case 4:
                crediarioCliente();

                break;
        }

    }
    public static void crediarioCliente(Produto produto){
        Scanner digitar = new Scanner(System.in);

        System.out.println("Quantidade de Parcelas:");
        int quantidade = digitar.nextInt();

        double valor = produto.getValor();
        System.out.println("Aviso caso tenha atraso no pagamento das parcelas, vai ser cobrado 20% do valor da parcela mais 1% ao dia.");

        Crediario crediario = new Crediario(quantidade,valor);
    }

}