package java_homework_6;

public class Laptop {
    private String generator;
    private String model;
    private Double diagonal;
    private String matrixType;
    private int RAM;
    private String color;
    private int price;

    public Laptop(String generator, String model, Double diagonal, String matrixType, int RAM, String color, int price) {
        this.generator = generator;
        this.model = model;
        this.diagonal = diagonal;
        this.matrixType = matrixType;
        this.RAM = RAM;
        this.color = color;
        this.price = price;
    }

    public String getGenerator() {
        return generator;
    }

    public void setGenerator(String generator) {
        this.generator = generator;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(Double diagonal) {
        this.diagonal = diagonal;
    }

    public String getMatrixType() {
        return matrixType;
    }

    public void setMatrixType(String matrixType) {
        this.matrixType = matrixType;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ноутбук: " + generator + ": " +
                "модель: " + model + ", " +
                "оперативная память: " + RAM + " Гб" +
                ", диагональ экрана: " + diagonal + " дюйма" +
                ", тип матрицы: " + matrixType +
                ", цвет: " + color +
                ", стоимость: " + price + " рублей;";
    }
}
