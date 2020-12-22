package Task1;

import Task1.Complex;
import Task1.ComplexAbstractFactory;

public class ConcreteFactory implements ComplexAbstractFactory {

    @Override
    public Complex createComplex() {
        Complex complex = new Complex();
        complex.setImage(0);
        complex.setReal(0);
        return complex;
    }

    @Override
    public Complex CreateComplex(int real, int image) {
        Complex complex = new Complex();
        complex.setImage(image);
        complex.setReal(real);
        return complex;
    }


}
