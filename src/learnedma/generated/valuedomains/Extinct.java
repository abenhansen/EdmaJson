package learnedma.generated.valuedomains;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import learnedma.generated.Edma;
import learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import learnedma.generated.valuedomains.impl.ExtinctImpl;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Extinct
 */
public abstract class Extinct implements Comparable<Extinct>
{
    protected static final IMetaValueDomain edma_domain = Edma.environment.getValueDomainDefinitions().getValueDomain(5);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Extinct from the terminal
     */
    public static Extinct fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new ExtinctImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Extinct from the string representation
     */
    public static Extinct fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new ExtinctImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Extinct read from the stream
     */
    public static Extinct fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new ExtinctImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Extinct read from the stream
     */
    public static Extinct fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new ExtinctImpl(res);
    }

    /**
     * Call this method to create a new Extinct value. 
     * @param value  The value of the Extinct to be created.
     * @return       The newly created Extinct value
     */
    public static Extinct create(Boolean value)
    {
        return new ExtinctImpl(ExtinctImpl.edma_create(value));
    }

    /**
     * Call this method to test if the provided Boolean is a valid Extinct
     * @param value  The Boolean value to be tested
     * @return       true if the provided Boolean is a valid Extinct
     */
    public static boolean isValidExtinct(Boolean value)
    {
        return true;
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * returns the Boolean value that is stored in this Extinct
     * @return  The Boolean value stored in this Extinct
     */
    public abstract Boolean value();
}
