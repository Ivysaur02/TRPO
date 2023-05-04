package laba1;

class Number implements Expression { // Класс "Число"
    private double value;

    public Number(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }

    @Override
    public Expression transform(Transformer tr) {
        return tr.transformNumber(this);
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString(){
        return String.valueOf(value);
    }
}

