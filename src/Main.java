import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<PessoaFisica> listaPf = new ArrayList<>();

        System.out.println("Bem vindo ao sistema de cadastro de Pessoas Físicas e Juridicas");

        Scanner leitor = new Scanner(System.in);
        /*Scanner scanner = new Scanner(System.in);*/
        String opcao;

        do {
            System.out.println("Escolha uma Opcao : 1 -pessoa Fisica / 2 -pessoa Juridica / 0 - sair ");
            opcao = leitor.nextLine();

            switch (opcao) {
                case "1":
                    /* System.out.println("case 1");*/
                    String opcaoPF;
                    do {
                        System.out.println("Digite uma opcao : 1 - Cadastrar PF / 2 -  listar PF / 0 - Voltar");
                        opcaoPF = leitor.nextLine();

                        switch (opcaoPF) {
                            case "1":
                                PessoaFisica novaPf = new PessoaFisica();
                                Endereco novoEndPf = new Endereco();

                                System.out.println("Digite o nome :");
                                novaPf.nome = leitor.nextLine();

                                System.out.println("Digite o cpf :");
                                novaPf.cpf = leitor.nextLine();

                                System.out.println("digite o seu rendimento: ");
                                novaPf.rendimento = leitor.nextFloat();

                                System.out.println("Digite a data de nascimento : (dd/mm/aaaa) ");
                                novaPf.dataNasc = LocalDate.parse(leitor.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                                System.out.println("Digite o logradouro : ");
                                novoEndPf.numero = leitor.nextInt();

                                System.out.println("Este endereco e comercial ? S/N :");
                                String endCom = leitor.next();

                                if (endCom.equals("S")) {
                                    novoEndPf.endComercial = true;
                                } else {
                                    novoEndPf.endComercial = false;
                                }
                                novaPf.endereco = novoEndPf;
                                listaPf.add(novaPf);
                                System.out.println("Cadastro Realizado com sucesso");
                                /*System.out.println("Cadastrar PF");*/
                                break;

                            case "2":

                                if (listaPf.size() > 0) {

                                    for (PessoaFisica cadaPf : listaPf) {
                                        System.out.println("Nome" + cadaPf.nome);
                                        System.out.println("CPF" + cadaPf.cpf);
                                        System.out.println("Data de nascimento:" + cadaPf.dataNasc.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

                                        System.out.println("Endereco: " + cadaPf.endereco.logradouro + "-" + cadaPf.endereco.numero);
                                        System.out.println();
                                        System.out.println("Aperte Enter Para continuar");
                                        leitor.nextLine();
                                    }

                                } else {
                                    System.out.println("Lista vazia");
                                }

                                /* System.out.println("Listar PF");*/
                                break;
                            case "0":
                                System.out.println("Volta");
                                break;

                        }

                    } while (!opcaoPF.equals("0"));

                    break;
                case "2":
                    System.out.println("case 2");
                    break;
                case "0":
                    System.out.println("case 0");
                    break;
                default:
                    break;
            }

        } while (!opcao.equals("0"));
    }


}
