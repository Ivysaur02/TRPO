package laba1;

class Number implements Expression { // Класс "Число"
    private double value;

    public Number(double value) {
        this.value = value;
    }

    public double evaluate() {
        return value;
    }
    public Expression transform(Transformer tr) {
        return tr.transformNumber(this);
    }

    public double getValue() {
        return value;
    }
}

