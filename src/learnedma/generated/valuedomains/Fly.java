package learnedma.generated.valuedomains;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import learnedma.generated.Edma;
import learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import learnedma.generated.valuedomains.impl.FlyImpl;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Fly
 */
public abstract class Fly implements Comparable<Fly>
{
    protected static final IMetaValueDomain edma_domain = Edma.environment.getValueDomainDefinitions().getValueDomain(1);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Fly from the terminal
     */
    public static Fly fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new FlyImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Fly from the string representation
     */
    public static Fly fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new FlyImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Fly read from the stream
     */
    public static Fly fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new FlyImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Fly read from the stream
     */
    public static Fly fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new FlyImpl(res);
    }

    /**
     * Call this method to create a new Fly value. 
     * @param value  The value of the Fly to be created.
     * @return       The newly created Fly value
     */
    public static Fly create(Boolean value)
    {
        return new FlyImpl(FlyImpl.edma_create(value));
    }

    /**
     * Call this method to test if the provided Boolean is a valid Fly
     * @param value  The Boolean value to be tested
     * @return       true if the provided Boolean is a valid Fly
     */
    public static boolean isValidFly(Boolean value)
    {
        return true;
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * returns the Boolean value that is stored in this Fly
     * @return  The Boolean value stored in this Fly
     */
    public abstract Boolean value();
}
