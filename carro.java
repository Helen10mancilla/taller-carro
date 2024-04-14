class Motor {
    private double volumen;

    public Motor(double volumen) {
        this.volumen = volumen;
    }

    public String toString() {
        return "Motor - Volumen: " + volumen + " litros";
    }
}


enum TipoChasis {
    Independiente, Monocasco;
}


class Chasis {
    private TipoChasis tipo;

    public Chasis(TipoChasis tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "Chasis - Tipo: " + tipo;
    }
}


enum TipoCarroceria {
    Independiente, Autoportante, Tubular;
}


class Carroceria {
    private TipoCarroceria tipo;
    private String color;

    public Carroceria(TipoCarroceria tipo, String color) {
        this.tipo = tipo;
        this.color = color;
    }

    public String toString() {
        return "Carroceria - Tipo: " + tipo + ", Color: " + color;
    }
}


class Llanta {
    private String marca;
    private int diametroRin;
    private int altura;
    private int anchura;

    public Llanta(String marca, int diametroRin, int altura, int anchura) {
        this.marca = marca;
        this.diametroRin = diametroRin;
        this.altura = altura;
        this.anchura = anchura;
    }

    public String toString() {
        return "Llanta - Marca: " + marca + ", Rin: " + diametroRin + "\", Altura: " + altura + "\", Anchura: " + anchura + "\"";
    }
}


class Asiento {
    private String material;
    private boolean tieneFunda;

    public Asiento(String material, boolean tieneFunda) {
        this.material = material;
        this.tieneFunda = tieneFunda;
    }

    public String toString() {
        return "Asiento - Material: " + material + ", Funda: " + (tieneFunda ? "Sí" : "No");
    }
}


class Carro {
    private Motor motor;
    private Chasis chasis;
    private Carroceria carroceria;
    private Llanta[] llantas = new Llanta[4];
    private Asiento asientoConductor;
    private Asiento asientoAcompanante;
    private Asiento asientoTrasero;

    public Carro(Motor motor, Chasis chasis, Carroceria carroceria, Llanta[] llantas, Asiento asientoConductor, Asiento asientoAcompanante, Asiento asientoTrasero) {
        this.motor = motor;
        this.chasis = chasis;
        this.carroceria = carroceria;
        this.llantas = llantas;
        this.asientoConductor = asientoConductor;
        this.asientoAcompanante = asientoAcompanante;
        this.asientoTrasero = asientoTrasero;
    }

    public void imprimir() {
        System.out.println(motor);
        System.out.println(chasis);
        System.out.println(carroceria);
        for (int i = 0; i < llantas.length; i++) {
            System.out.println("Llanta " + (i+1) + ": " + llantas[i]);
        }
        System.out.println("Asiento Conductor: " + asientoConductor);
        System.out.println("Asiento Acompañante: " + asientoAcompanante);
        System.out.println("Asiento Trasero: " + asientoTrasero);
    }
}

 
public class main {
    public static void main(String[] args) {
        Motor motor = new Motor(2.0);
        Chasis chasis = new Chasis(TipoChasis.Monocasco);
        Carroceria carroceria = new Carroceria(TipoCarroceria.Tubular, "Rojo");
        Llanta[] llantas = {new Llanta("Goodyear", 25, 20, 15)};
        Asiento asientoConductor = new Asiento("Cuero", true);
        Asiento asientoAcompanante = new Asiento("Cuero", true);
        Asiento asientoTrasero = new Asiento("Tela", false);

        Carro carro = new Carro(motor, chasis, carroceria, llantas, asientoConductor, asientoAcompanante, asientoTrasero);
        carro.imprimir();
    }
}
