package laba1;

class Variable implements Expression { // Класс "Переменная"
    private String name;

    public Variable(String name) {
        this.name = name;
    }


    public double evaluate() {
        return 0.0;
    }

    public Expression transform(Transformer tr) {
        return tr.transformVariable(this);
    }

    public String getName() {
        return name;
    }
}
