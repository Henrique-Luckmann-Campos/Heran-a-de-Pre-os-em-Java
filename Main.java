public class Main {
    public static void main(String[] args) {
        Eletronico celular = new Eletronico("Smartphone", 1999.90);
        Roupa camiseta = new Roupa("Camiseta Polo", 89.90);

        System.out.println("=== Produto Eletrônico ===");
        celular.exibirInfo();

        System.out.println("\n=== Produto Roupa ===");
        camiseta.exibirInfo();
    }
}
