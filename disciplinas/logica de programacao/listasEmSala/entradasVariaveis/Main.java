public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, informe o seu nome:");
        var nome = scanner.next();
        System.out.println("Agora, informe a sua idade:");
         var idade = scanner.nextInt();
        System.out.println( "Olá " + nome + ",  você tem " + idade + " anos de idade!");
    }
}
