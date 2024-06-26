package com.sparta.kd;

public class App {
    public static void main(String[] args) {
        IntegerRectangle integerRectangle = new IntegerRectangle(2, 4);
        DoubleRectangle doubleRectangle = new DoubleRectangle(2.0, 4.0);
        ObjectRectangle objectrectangle1 = new ObjectRectangle(2, 4);
        ObjectRectangle objectrectangle2 = new ObjectRectangle(2.0, 4.0);

        System.out.printf("Integer Rectangle Area: %d\n", integerRectangle.getWidth() * integerRectangle.getHeight());
        System.out.printf("Double Rectangle Area: %f\n", doubleRectangle.getWidth() * doubleRectangle.getHeight());

        System.out.printf("Object Integer Rectangle Area: %d\n", (Integer)objectrectangle1.getWidth() * (Integer)objectrectangle1.getHeight());
        System.out.printf("Object Double Rectangle Area: %f\n", (Double)objectrectangle2.getWidth() * (Double)objectrectangle2.getHeight());

        GenericRectangle<Integer> integerGenericRectangle = new GenericRectangle<>(2, 4);
        System.out.printf("Generic Integer Rectangle Area: %d\n", integerGenericRectangle.getWidth() * integerGenericRectangle.getHeight());

        GenericRectangle<Double> doubleGenericRectangle = new GenericRectangle<>(2.0, 4.0);
        System.out.printf("Generic Integer Rectangle Area: %f\n", doubleGenericRectangle.getWidth() * doubleGenericRectangle.getHeight());

        var intGenRect = new GenericRectangle<>(2, 10);
        System.out.printf("Int Gen Rect Area: %d\n", intGenRect.getWidth() * intGenRect.getHeight());

        GenericRectangle<?> iGRBound = new GenericRectangle<>(2, 4);
        GenericRectangle<? extends Number> iGRBoundExtends = new GenericRectangle<>(2, 4);
        GenericRectangle<? super Number> iGRBoundSuper = new GenericRectangle<>(2, 4);


    }
}
