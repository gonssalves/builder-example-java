// ConcreteBuilder
class CarroBuilderImpl implements CarroBuilder {
    private String marca;
    private String modelo;
    private int ano;
    private boolean arCondicionado;
    private boolean tetoSolar;

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    @Override
    public void setTetoSolar(boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    @Override
    public Carro build() {
        return new Carro(marca, modelo, ano, arCondicionado, tetoSolar);
    }
}