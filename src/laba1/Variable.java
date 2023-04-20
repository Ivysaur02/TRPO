package laba1;

class Variable implements Expression { // Класс "Переменная"
    private String name;

    public Variable(String name) {
        this.name = name;
    }


    public double evaluate() {
        return 0.0;
    }
}
