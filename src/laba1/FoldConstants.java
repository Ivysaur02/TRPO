package laba1;

public class FoldConstants implements  Transformer{
    @Override
    public Expression transformNumber(Number number) {
        return new Number(number.getValue());
        // числа не сворачиваются, поэтому просто возвращаем копию
    }
    @Override
    public Expression transformBinaryOperation(BinaryOperation binop) {
        // Рекурсивно сворачиваем левый и правый операнды
        Expression nleft = binop.getLeft().transform(this);
        Expression nright = binop.getRight().transform(this);
        BinaryOperation.Operation noperation = binop.getOperation();

        // Создаем новый объект типа BinaryOperation с новыми операндами
        BinaryOperation nbinop = new BinaryOperation(nleft, noperation, nright);

        // Проверяем, являются ли оба операнда числами
        if (nleft instanceof Number && nright instanceof Number) {
            Expression result = new Number(nbinop.evaluate());
            return result;
        } else {
            return nbinop;
        }
    }
    @Override
    public Expression transformFunctionCall(FunctionCall fcall) {
        // Рекурсивно сворачиваем аргумент функции
        Expression arg = fcall.getArg().transform(this);
        String name = fcall.getName();

        // Создаем новый объект типа FunctionCall с новым аргументом
        FunctionCall nfcall = new FunctionCall(name, arg);

        // Проверяем, является ли аргумент числом
        if (arg instanceof Number) {
            Expression result = new Number(nfcall.evaluate());
            return result;
        } else {
            return nfcall;
        }
    }
    @Override
    public Expression transformVariable(Variable var) {
        return new Variable(var.getName());
        // переменные не сворачиваем, поэтому просто возвращаем копию
    }

}
