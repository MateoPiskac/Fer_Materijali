package util.matrix;

import junit.framework.Assert;
import org.junit.Test;

public class TForwardSubstitution {


    @Test(expected = MatrixDimensionException.class)
    public void notGoodDimensions() {
        new ForwardSubstitution().substitute(new Matrix(3, 3), new Matrix(4, 1));
    }

    @Test(expected = MatrixDimensionException.class)
    public void LUNotSquare() {
        new ForwardSubstitution().substitute(new Matrix(4, 1), new Matrix(4, 1));
    }

    @Test
    public void correctValue() {
        Assert.assertTrue(new Matrix(new double[][] {
            {2}, {7 / 3.}, {0}
        }).equals(new ForwardSubstitution().substitute(new Matrix(new double[][] {
            {6, 2, 10},
            {1 / 3., 7 / 3., -10 /  3.},
            {0, 12 / 7., 54 / 7.}
        }), new Matrix(new double[][] {
            {2}, {3}, {4}
        }))));
    }

}
