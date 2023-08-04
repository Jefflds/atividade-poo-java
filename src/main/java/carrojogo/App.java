package carrojogo;

public class App {
    public static void main(String[] args) {
        Carro carro = new Carro("Ford", "Fusion", 2022, 200);
        carro.setCombustivel("Gasolina");

        Moto moto = new Moto("Honda", "CB500", 2021, true);
        moto.setCombustivel("Gasolina");

        Piloto pilotoCarro = new Piloto("João", 25, 123);
        pilotoCarro.setVeiculo(carro);

        Piloto pilotoMoto = new Piloto("Maria", 28, 456);
        pilotoMoto.setVeiculo(moto);

        System.out.println("Carro: " + carro.getMarca() + " " + carro.getModelo());
        System.out.println("Potência do Carro: " + carro.getPotencia() + "cv");
        System.out.println("Piloto do Carro: " + ((Piloto) pilotoCarro).getNome() + ", Número: " + pilotoCarro.getNumeroPiloto());

        System.out.println("\nMoto: " + moto.getMarca() + " " + moto.getModelo());
        System.out.println("Possui Baú? " + (moto.isPossuiBau() ? "Sim" : "Não"));
        System.out.println("Piloto da Moto: " + pilotoMoto.getNome() + ", Número: " + pilotoMoto.getNumeroPiloto());
    }
}

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
}

class Piloto extends Pessoa {
    private int numeroPiloto;
    private Veiculo veiculo;

    public Piloto(String nome, int idade, int numeroPiloto) {
        super(nome, idade);
        this.numeroPiloto = numeroPiloto;
    }

    public int getNumeroPiloto() {
        return numeroPiloto;
    }

    public void setNumeroPiloto(int numeroPiloto) {
        this.numeroPiloto = numeroPiloto;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}

class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private String combustivel;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}

class Carro extends Veiculo {
    private int potencia;

    public Carro(String marca, String modelo, int ano, int potencia) {
        super(marca, modelo, ano);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void acelerar() {
        System.out.println("O carro está acelerando!");
    }
}

class Moto extends Veiculo {
    private boolean possuiBau;

    public Moto(String marca, String modelo, int ano, boolean possuiBau) {
        super(marca, modelo, ano);
        this.possuiBau = possuiBau;
    }

    public boolean isPossuiBau() {
        return possuiBau;
    }

    public void setPossuiBau(boolean possuiBau) {
        this.possuiBau = possuiBau;
    }
    
    public void empinar() {
        System.out.println("A moto está empinando!");
    }
}
