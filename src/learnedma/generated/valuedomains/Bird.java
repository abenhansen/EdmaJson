package learnedma.generated.valuedomains;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import learnedma.generated.Edma;
import learnedma.generated.valuedomains.Climates;
import learnedma.generated.valuedomains.Color;
import learnedma.generated.valuedomains.Extinct;
import learnedma.generated.valuedomains.Fly;
import learnedma.generated.valuedomains.Species;
import learnedma.generated.valuedomains.Weight;
import learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import learnedma.generated.valuedomains.impl.BirdBuilderImpl;
import learnedma.generated.valuedomains.impl.BirdImpl;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Bird
 */
public abstract class Bird implements Comparable<Bird>
{
    protected static final IMetaValueDomain edma_domain = Edma.environment.getValueDomainDefinitions().getValueDomain(6);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Bird from the terminal
     */
    public static Bird fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new BirdImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Bird from the string representation
     */
    public static Bird fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new BirdImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Bird read from the stream
     */
    public static Bird fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new BirdImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Bird read from the stream
     */
    public static Bird fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new BirdImpl(res);
    }

    /**
     * Starts creation of a new Bird
     * @return  Builder interface to set the species field
     */
    public static BirdBuilderSpecies create()
    {
        return new BirdBuilderImpl();
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * returns the value of the field species
     * @return  The value of the field species
     */
    public abstract Species species();

    /**
     * returns the value of the field canFly
     * @return  The value of the field canFly
     */
    public abstract Fly canFly();

    /**
     * returns the value of the field color
     * @return  The value of the field color
     */
    public abstract Color color();

    /**
     * returns the value of the field weight
     * @return  The value of the field weight
     */
    public abstract Weight weight();

    /**
     * returns the value of the field climate
     * @return  The value of the field climate
     */
    public abstract Climates climate();

    /**
     * returns the value of the field isExtinct
     * @return  The value of the field isExtinct
     */
    public abstract Extinct isExtinct();


    /**
     * Builder interface for setting the species field of Bird
     */
    public interface BirdBuilderSpecies
    {

        /**
         * sets the species field.
         * @param species  The value to assign to the species field
         * @return         Builder interface for setting the canFly field
         */
        public BirdBuilderCanFly species(Species species);

        /**
         * sets the species field.
         * @param species  The value to assign to the species field
         * @return         Builder interface for setting the canFly field
         */
        public BirdBuilderCanFly species(String species) throws InvalidValueException;

    }



    /**
     * Builder interface for setting the canFly field of Bird
     */
    public interface BirdBuilderCanFly
    {

        /**
         * sets the canFly field.
         * @param canFly  The value to assign to the canFly field
         * @return        Builder interface for setting the color field
         */
        public BirdBuilderColor canFly(Fly canFly);

        /**
         * sets the canFly field.
         * @param canFly  The value to assign to the canFly field
         * @return        Builder interface for setting the color field
         */
        public BirdBuilderColor canFly(Boolean canFly);

    }



    /**
     * Builder interface for setting the color field of Bird
     */
    public interface BirdBuilderColor
    {

        /**
         * sets the color field.
         * @param color  The value to assign to the color field
         * @return       Builder interface for setting the weight field
         */
        public BirdBuilderWeight color(Color color);

        /**
         * sets the color field.
         * @param color  The value to assign to the color field
         * @return       Builder interface for setting the weight field
         */
        public BirdBuilderWeight color(String color) throws InvalidValueException;

    }



    /**
     * Builder interface for setting the weight field of Bird
     */
    public interface BirdBuilderWeight
    {

        /**
         * sets the weight field.
         * @param weight  The value to assign to the weight field
         * @return        Builder interface for setting the climate field
         */
        public BirdBuilderClimate weight(Weight weight);

        /**
         * sets the weight field.
         * @param weight  The value to assign to the weight field
         * @return        Builder interface for setting the climate field
         */
        public BirdBuilderClimate weight(Float weight) throws InvalidValueException;

    }



    /**
     * Builder interface for setting the climate field of Bird
     */
    public interface BirdBuilderClimate
    {

        /**
         * sets the climate field.
         * @param climate  The value to assign to the climate field
         * @return         Builder interface for setting the isExtinct field
         */
        public BirdBuilderIsExtinct climate(Climates climate);

    }



    /**
     * Builder interface for setting the isExtinct field of Bird
     */
    public interface BirdBuilderIsExtinct
    {

        /**
         * sets the isExtinct field.
         * @param isExtinct  The value to assign to the isExtinct field
         * @return           The created Bird value
         */
        public Bird isExtinct(Extinct isExtinct);

        /**
         * sets the isExtinct field.
         * @param isExtinct  The value to assign to the isExtinct field
         * @return           The created Bird value
         */
        public Bird isExtinct(Boolean isExtinct);

    }

}
