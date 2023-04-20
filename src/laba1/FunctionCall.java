package laba1;

class FunctionCall implements Expression { // Класс "Вызов функции"
    private String name;
    private Expression arg;

    public FunctionCall(String name, Expression arg) {
        this.name = name;
        this.arg = arg;

        if (!name.equals("sqrt") && !name.equals("abs")) {
            throw new IllegalArgumentException("Unknown function: " + name);
        }
    }


    public double evaluate() {
        double argValue = arg.evaluate();

        return switch (name) {
            case "sqrt" -> Math.sqrt(argValue);
            case "abs" -> Math.abs(argValue);
            default -> throw new IllegalArgumentException("Unknown function: " + name);
        };
    }
}