public class ExemploBuilder {
    public static void main(String[] args) {
        CarroBuilder builder = new CarroBuilderImpl();
        Concessionaria concessionaria = new Concessionaria(builder);

        Carro carro = concessionaria.construirCarro("Toyota", "Corolla", 2023, true, false);

        System.out.println("Carro construído: " + carro);
    }
}