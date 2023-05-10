package laba1.test;

import laba1.BinaryOperation;
import laba1.CopySyntaxTree;
import laba1.Expression;
import laba1.Number;
import laba1.FunctionCall;
import laba1.Variable;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class CSTTest {


    @Test
    public void testCopyNumber() {
        System.out.println("Копирование значения 16, проверка на equals");
        Number num1 = new Number(16);
        CopySyntaxTree CST = new CopySyntaxTree();
        Expression newExpr = num1.transform(CST);

        assertNotEquals(num1, newExpr);
        System.out.println("Old="+num1+ " New="+ newExpr+"\n");

    }

    @Test
    public void testCopyBinaryOperation() {
        System.out.println("Копирование значения 16-8, проверка на equals");
        Number num1 = new Number(16.0);
        Number num2 = new Number(8.0);
        BinaryOperation minus = new BinaryOperation(num1, BinaryOperation.Operation.MINUS, num2);
        CopySyntaxTree CST = new CopySyntaxTree();
        Expression newExpr = minus.transform(CST);
        assertNotEquals(minus, newExpr);
        System.out.println("Old="+minus+ " New="+ newExpr+"\n");


    }

    @Test
    public void testCopyFunctionalCall() {
        System.out.println("Копирование значения sqrt(16), проверка на equals");
        Number num1 = new Number(16.0);
        FunctionCall callSqrt = new FunctionCall("sqrt", num1);
        CopySyntaxTree CST = new CopySyntaxTree();
        Expression newExpr = callSqrt.transform(CST);
        assertNotEquals(callSqrt, newExpr);
        System.out.println("Old="+callSqrt+ " New="+ newExpr+"\n");


    }

    @Test
    public void testCopyVariable() {
        System.out.println("Копирование значения переменной VAR, проверка на equals");
        Variable var1 = new Variable("var");
        CopySyntaxTree CST = new CopySyntaxTree();
        Expression newExpr = var1.transform(CST);
        assertNotEquals(var1, newExpr);
        System.out.println("Old="+var1+ " New="+ newExpr+"\n");


    }
}
