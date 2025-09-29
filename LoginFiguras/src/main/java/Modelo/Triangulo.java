
package Modelo;

public class Triangulo extends Figura {
    private double lado1;
    private double lado2;
    private double lado3;
    private double base;
    private double altura;

    // Constructor para perímetro (3 lados)
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Constructor para área (base y altura)
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        if (lado1 > 0 && lado2 > 0 && lado3 > 0) {
            return lado1 + lado2 + lado3;
        }
        return 0;
    }

    @Override
    public double calcularArea() {
        if (base > 0 && altura > 0) {
            return (base * altura) / 2;
        }
        return 0;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}

