package learnedma.generated.valuedomains.impl;

import java.io.DataOutput;
import java.io.IOException;
import learnedma.generated.valuedomains.Bird;
import learnedma.generated.valuedomains.Climates;
import learnedma.generated.valuedomains.Color;
import learnedma.generated.valuedomains.Extinct;
import learnedma.generated.valuedomains.Fly;
import learnedma.generated.valuedomains.Species;
import learnedma.generated.valuedomains.Weight;
import learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import learnedma.generated.valuedomains.impl.ClimatesImpl;
import learnedma.generated.valuedomains.impl.ColorImpl;
import learnedma.generated.valuedomains.impl.ExtinctImpl;
import learnedma.generated.valuedomains.impl.FlyImpl;
import learnedma.generated.valuedomains.impl.SpeciesImpl;
import learnedma.generated.valuedomains.impl.WeightImpl;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * The implementation of Bird
 */
public class BirdImpl extends Bird implements IValueInstance
{
    private int edma_hash;
    private Object[] value;



    /**
     * Check if a value is valid
     * @param value  The value to validate
     */
    public static void edma_validate(Object value) throws InvalidValueException
    {
        edma_domain.validate(value, EDMA_ExternalConstraints.instance);
    }

    /**
     * create value without checking
     * @param value  The value to check and create
     * @return       <tt>true</tt> The new created value
     */
    public static Object edma_create(Object value)
    {
        return edma_domain.newValue(value);
    }

    /**
     * Constructor
     * @param o  The Object that represents this struct value
     */
    public BirdImpl(Object o)
    {
        edma_hash = 0;
        value = (Object[]) o;
    }

    /**
     * Gets the value domain for this value instance
     * @return  The value domain for this value instance
     */
    public IMetaValueDomain edma_getDomain()
    {
        return edma_domain;
    }

    /**
     * Access to the general Object value
     * @return  The value as a general Object
     */
    public Object edma_getValue()
    {
        return value;
    }

    /**
     * Returns <tt>true</tt> if this value equals the given value
     * @param o  Object to test equality with
     * @return   <tt>true</tt> if this value equals the given value
     */
    public boolean equals(Object o)
    {
        if(!(o instanceof IValueInstance)) return false;
        IValueInstance inst = (IValueInstance) o;
        if(6 != inst.edma_getDomain().getIndex()) return false;
        return edma_domain.valueEqual(value, inst.edma_getValue());
    }

    /**
     * Gets the value hash for this value instance
     * @return  The hash for this value instance
     */
    public int hashCode()
    {
        if(edma_hash == 0) edma_hash = edma_domain.valueHashCode(value);
        return edma_hash;
    }

    /**
     * Returns this value instance as a string
     * @return  this value instance as a string
     */
    public String toString()
    {
        return edma_domain.valueToString(value);
    }

    /**
     * Compare this Bird to another Bird
     * @param bird  The Bird to compare with
     * @return      A negative integer, zero, or a positive integer as this
     *              Bird is less than, equal to, or greater than the specified
     *              Bird
     */
    public int compareTo(Bird bird)
    {
        return edma_domain.valueCompare(value, ((BirdImpl) bird).value);
    }

    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public void toStream(DataOutput out) throws IOException
    {
        edma_domain.writeValue(((IValueInstance) this).edma_getValue(), out);
    }

    /**
     * returns the value of the field species
     * @return  The value of the field species
     */
    public Species species()
    {
        return new SpeciesImpl(value[0]);
    }

    /**
     * returns the value of the field canFly
     * @return  The value of the field canFly
     */
    public Fly canFly()
    {
        return new FlyImpl(value[1]);
    }

    /**
     * returns the value of the field color
     * @return  The value of the field color
     */
    public Color color()
    {
        return new ColorImpl(value[2]);
    }

    /**
     * returns the value of the field weight
     * @return  The value of the field weight
     */
    public Weight weight()
    {
        return new WeightImpl(value[3]);
    }

    /**
     * returns the value of the field climate
     * @return  The value of the field climate
     */
    public Climates climate()
    {
        return new ClimatesImpl(value[4]);
    }

    /**
     * returns the value of the field isExtinct
     * @return  The value of the field isExtinct
     */
    public Extinct isExtinct()
    {
        return new ExtinctImpl(value[5]);
    }
}
