// Interface Builder
interface CarroBuilder {
    void setMarca(String marca);
    void setModelo(String modelo);
    void setAno(int ano);
    void setArCondicionado(boolean arCondicionado);
    void setTetoSolar(boolean tetoSolar);
    Carro build();
}
