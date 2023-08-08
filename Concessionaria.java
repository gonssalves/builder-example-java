// Diretor
class Concessionaria {
    private CarroBuilder builder;

    public Concessionaria(CarroBuilder builder) {
        this.builder = builder;
    }

    public Carro construirCarro(String marca, String modelo, int ano, boolean arCondicionado, boolean tetoSolar) {
        builder.setMarca(marca);
        builder.setModelo(modelo);
        builder.setAno(ano);
        builder.setArCondicionado(arCondicionado);
        builder.setTetoSolar(tetoSolar);
        return builder.build();
    }
}