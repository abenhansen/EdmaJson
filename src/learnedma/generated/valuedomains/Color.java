package learnedma.generated.valuedomains;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import learnedma.generated.Edma;
import learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import learnedma.generated.valuedomains.impl.ColorImpl;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Color
 */
public abstract class Color implements Comparable<Color>
{
    protected static final IMetaValueDomain edma_domain = Edma.environment.getValueDomainDefinitions().getValueDomain(2);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Color from the terminal
     */
    public static Color fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new ColorImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Color from the string representation
     */
    public static Color fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new ColorImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Color read from the stream
     */
    public static Color fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new ColorImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Color read from the stream
     */
    public static Color fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new ColorImpl(res);
    }

    /**
     * Call this method to create a new Color value. 
     * @param value  The value of the Color to be created.
     * @return       The newly created Color value
     */
    public static Color create(String value) throws InvalidValueException
    {
        ColorImpl.edma_validate(value);
        return new ColorImpl(ColorImpl.edma_create(value));
    }

    /**
     * Call this method to test if the provided String is a valid Color
     * @param value  The String value to be tested
     * @return       true if the provided String is a valid Color
     */
    public static boolean isValidColor(String value)
    {
        try
        {
            ColorImpl.edma_validate(value);
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
     * returns the String value that is stored in this Color
     * @return  The String value stored in this Color
     */
    public abstract String value();
}
