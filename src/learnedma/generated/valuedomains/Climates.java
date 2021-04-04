package learnedma.generated.valuedomains;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import learnedma.generated.Edma;
import learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import learnedma.generated.valuedomains.impl.ClimatesBuilderImpl;
import learnedma.generated.valuedomains.impl.ClimatesImpl;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Climates
 */
public abstract class Climates implements Comparable<Climates>, Iterable<Climate>
{
    protected static final IMetaValueDomain edma_domain = Edma.environment.getValueDomainDefinitions().getValueDomain(7);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Climates from the terminal
     */
    public static Climates fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new ClimatesImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Climates from the string representation
     */
    public static Climates fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new ClimatesImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Climates read from the stream
     */
    public static Climates fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new ClimatesImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Climates read from the stream
     */
    public static Climates fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new ClimatesImpl(res);
    }

    /**
     * Starts creation of a new Climates
     * @return  Builder interface to build the list
     */
    public static ClimatesBuilder begin()
    {
        return new ClimatesBuilderImpl();
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * Returns the size of this list
     * @return  the size of this list
     */
    public abstract int size();

    /**
     * Returns the element on a given index in this list
     * @param index  The index of the element to be returned
     * @return       the element on the given index in this list
     */
    public abstract Climate get(int index);


    /**
     * Interface to create a list
     */
    public interface ClimatesBuilder
    {

        /**
         * Adds an element to the list
         * @param climate  The element to be added to the list
         * @return         An interface to the builder for chaining method calls
         */
        public ClimatesBuilder add(Climate climate);

        /**
         * Adds an element to the list
         * @param climate  The element to be added to the list
         * @return         An interface to the builder for chaining method calls
         */
        public ClimatesBuilder add(String climate) throws InvalidValueException;

        /**
         * Builds the list with the added elements
         * @return  The builded list
         */
        public Climates end() throws InvalidValueException;

    }

}
