
public class Main {
    public static void main(String[] args) {
        System.out.println("***********Lista de exercicios, por Lívia Helena! :D ***********");

        //exercicio 1
        System.out.println("Bem vindo ao Cadastro de Jogos!");
        System.out.println("Digite o ano de lançamento do jogo");

        Scanner anoLancamento;
        anoLancamento = new Scanner(System.in);
        int n0 = anoLancamento.nextInt();

        System.out.println("Digite o nome do jogo!");

        Scanner nomeJogo;
        nomeJogo = new Scanner(System.in);
        String n00 = nomeJogo.nextLine();

        System.out.println("Digite o preço, podendo conter números reais");

        Scanner preco;
        preco = new Scanner(System.in);
        double n000 = preco.nextDouble();

        System.out.println("O jogo " + n00 + " lançado em " + n0 + " custa R$ " + n000);


        //exercicio 2
        System.out.println("********************");

        System.out.println("Vamos descobrir quantos azulejos sua parede precisa!");
        System.out.println("Informe a altura:");

        Scanner dadoAltura;
        dadoAltura = new Scanner(System.in);
        double n1 = dadoAltura.nextDouble();

        System.out.println("Informe a largura:");
        Scanner dadoLargura;
        dadoLargura = new Scanner(System.in);
        double n2 = dadoLargura.nextDouble();

        double n3 = n1 * n2;
        System.out.printf("A área da parede é: %.2f", n3);

        double resultado = n3 / 1.5;

        System.out.printf("Você precisará da quantidade de azulejos  %.2f",resultado);

        //exercicio 3
        System.out.println("********************");
        System.out.println("Digite o tempo em segundos");
        Scanner totalSegundos;
        totalSegundos = new Scanner(System.in);

        int n4 = totalSegundos.nextInt();

        int resultadoHoras = n4 /3600;

        int minutos = n4 / 60;
        int resultadoMinutos = minutos / 60;

        int segundos = n4 / resultadoMinutos;
        int resultadoSegundos = segundos / 360;


        System.out.printf("O resultado é" + resultadoHoras +":" + resultadoMinutos +";" + resultadoSegundos);


    }
    }
