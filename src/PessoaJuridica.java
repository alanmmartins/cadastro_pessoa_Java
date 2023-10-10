public class PessoaJuridica extends Pessoa {
    public String cnpj;
    public String razaoSocial;


    public float CalcularImposto (float rendimento) {
//                Pessoa Juridica
//                até 3000 - 3 %
//                de 3000 até 6000 - 5 %
//                de 6000 até 10000 - 7 %
//                acima de 10000 - 9 %


        if (rendimento <= 3000) {
            return rendimento * .03f;

        } else if (rendimento <= 6000) {
            return rendimento * .05f;

        } else if (rendimento <= 10000) {
            return rendimento * .07f;

        } else {
            return rendimento * .09f;
        }


    }
}



/*public class PessoaJuridica extends Pessoa {
    public String cnpj;
    public String razaoSocial;

    @Override
    public String CalcularImposto(String rendimento) {*/
//       Pessoa Juridica
//até 3000 - 3%
//de 3000 até 6000 - 5%
//de 6000 até 10000 - 7%
//acima de 10000 - 9%
/*

        if (rendimento <= 3000) {
            // Se o rendimento for até 3000, a porcentagem é 3%
            double porcentagem = 0.03;
            double resultado = rendimento * porcentagem;
            System.out.println("A porcentagem é de 3% e o rendimento a ser pago é: " + resultado);
        } else if (rendimento > 3000 && rendimento <= 6000) {
            // Se o rendimento estiver entre 3000 e 6000, a porcentagem é 5%
            double porcentagem = 0.05;
            double resultado = rendimento * porcentagem;
            System.out.println("A porcentagem é de 5% e o rendimento a ser pago é: " + resultado);
        } else if (rendimento > 6000 && rendimento <= 10000) {
            // Se o rendimento estiver entre 6000 e 10000, a porcentagem é 7%
            double porcentagem = 0.07;
            double resultado = rendimento * porcentagem;
            System.out.println("A porcentagem é de 7% e o rendimento a ser pago é: " + resultado);
        } else {
            // Se o rendimento for acima de 10000, a porcentagem é 9%
            double porcentagem = 0.09;
            double resultado = rendimento * porcentagem;
            System.out.println("A porcentagem é de 9% e o rendimento a ser pago é: " + resultado);
        }

        return rendimento;
    }
}
*/


