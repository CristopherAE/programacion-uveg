class Reto {
    public String suma(int valor1, int valor2) {
        return "El resultado es: " + (valor1 + valor2);
    }

    public static void main(String[] args) {
        Reto reto6 = new Reto();
        String resultado = reto6.suma(10, 5);
        System.out.println(resultado);
    }
}