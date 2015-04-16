/**
 * 
 */
package wblut.math;

/**
 * Parameter class dependent on a single variable. An implementation of the
 * WB_Function1D instance is passed upon instantiation.
 *
 * @author Frederik Vanhoutte, W:Blut
 * @param <T>            the generic type
 */
public class WB_LinearParameter1D<T> implements WB_Parameter<T> {
    /** 1D parameter function. */
    WB_Function1D<T> value;

    /**
     * Instantiates a new w b_ linear parameter1 d.
     * 
     * @param value
     *            the value
     */
    public WB_LinearParameter1D(final WB_Function1D<T> value) {
	this.value = value;
    }

    /*
     * (non-Javadoc)
     * 
     * @see wblut.math.WB_Parameter#value()
     */
    @Override
    public T value() {
	return value.f(0);
    }

    /*
     * (non-Javadoc)
     * 
     * @see wblut.math.WB_Parameter#value(double, double, double, double)
     */
    @Override
    public T value(final double x, final double y, final double z,
	    final double t) {
	return value.f(x);
    }

    /*
     * (non-Javadoc)
     * 
     * @see wblut.math.WB_Parameter#value(double)
     */
    @Override
    public T value(final double x) {
	return value.f(x);
    }

    /*
     * (non-Javadoc)
     * 
     * @see wblut.math.WB_Parameter#value(double, double)
     */
    @Override
    public T value(final double x, final double y) {
	return value.f(x);
    }

    /*
     * (non-Javadoc)
     * 
     * @see wblut.math.WB_Parameter#value(double, double, double)
     */
    @Override
    public T value(final double x, final double y, final double z) {
	return value.f(x);
    }
}
