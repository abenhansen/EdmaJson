package learnedma.generated.valuedomains;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import learnedma.generated.Edma;
import learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import learnedma.generated.valuedomains.impl.WeightImpl;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Weight
 */
public abstract class Weight implements Comparable<Weight>
{
    protected static final IMetaValueDomain edma_domain = Edma.environment.getValueDomainDefinitions().getValueDomain(3);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Weight from the terminal
     */
    public static Weight fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new WeightImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Weight from the string representation
     */
    public static Weight fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new WeightImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Weight read from the stream
     */
    public static Weight fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new WeightImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Weight read from the stream
     */
    public static Weight fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new WeightImpl(res);
    }

    /**
     * Call this method to create a new Weight value. 
     * @param value  The value of the Weight to be created.
     * @return       The newly created Weight value
     */
    public static Weight create(Float value) throws InvalidValueException
    {
        WeightImpl.edma_validate(value);
        return new WeightImpl(WeightImpl.edma_create(value));
    }

    /**
     * Call this method to test if the provided Float is a valid Weight
     * @param value  The Float value to be tested
     * @return       true if the provided Float is a valid Weight
     */
    public static boolean isValidWeight(Float value)
    {
        try
        {
            WeightImpl.edma_validate(value);
        }
        catch(InvalidValueException e)
        {
            return false;
        }
        return true;
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * returns the Float value that is stored in this Weight
     * @return  The Float value stored in this Weight
     */
    public abstract Float value();
}
