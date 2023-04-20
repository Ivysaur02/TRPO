package laba1;

class Number implements Expression { // Класс "Число"
    private double value;

    public Number(double value) {
        this.value = value;
    }

    public double evaluate() {
        return value;
    }
}

