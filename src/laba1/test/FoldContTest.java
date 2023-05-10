package laba1.test;

import laba1.*;
import laba1.Number;
import org.junit.Test;
import static org.junit.Assert.assertNotEquals;

public class FoldContTest {

    @Test
    public void testFoldNumber() {
        System.out.println("Проверка без изменений на equals \n");
        Number num1 = new Number(16.0);
        FoldConstants FC = new FoldConstants();
        Expression newExpr = num1.transform(FC);
        assertNotEquals(num1, newExpr);
    }

    @Test
    public void testFoldFuncCall() {
        System.out.println("Проверка всех функций \n");
        Number num1 = new Number(64.0);
        FunctionCall callSqrt = new FunctionCall("sqrt", num1);
        Variable var1 = new Variable("var");
        BinaryOperation plus = new BinaryOperation(callSqrt, BinaryOperation.Operation.PLUS, var1);
        System.out.println("BeforFC "+plus+"\n");
        FoldConstants FC = new FoldConstants();
        Expression newExpr = plus.transform(FC);
        BinaryOperation res = new BinaryOperation(new Number(8.0), BinaryOperation.Operation.PLUS, new Variable("var"));
        assertNotEquals(newExpr, res);
        System.out.println("AfterFC "+res+ " Check "+ newExpr+"\n");

    }


    @Test
    public void testFoldBinOper() {
        System.out.println("Проверка арифметический операций \n");
        Number num1 = new Number(64.0);
        Variable var1 = new Variable("var");
        BinaryOperation plus = new BinaryOperation(num1, BinaryOperation.Operation.PLUS, var1);
        Number num2 = new Number(4);
        BinaryOperation minus = new BinaryOperation(num2, BinaryOperation.Operation.MINUS, plus);
        System.out.println("BeforFC "+minus+"\n");
        Expression newExpr = plus.transform(new FoldConstants());
        BinaryOperation res = new BinaryOperation(new Number(60), BinaryOperation.Operation.PLUS, new Variable("var"));
        assertNotEquals(newExpr, res);
        System.out.println("AfterFC "+res+ " Check "+ newExpr+"\n");

    }
}
