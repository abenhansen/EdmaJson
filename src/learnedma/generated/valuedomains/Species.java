package learnedma.generated.valuedomains;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import learnedma.generated.Edma;
import learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import learnedma.generated.valuedomains.impl.SpeciesImpl;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Species
 */
public abstract class Species implements Comparable<Species>
{
    protected static final IMetaValueDomain edma_domain = Edma.environment.getValueDomainDefinitions().getValueDomain(0);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Species from the terminal
     */
    public static Species fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new SpeciesImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Species from the string representation
     */
    public static Species fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new SpeciesImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Species read from the stream
     */
    public static Species fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new SpeciesImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Species read from the stream
     */
    public static Species fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new SpeciesImpl(res);
    }

    /**
     * Call this method to create a new Species value. 
     * @param value  The value of the Species to be created.
     * @return       The newly created Species value
     */
    public static Species create(String value) throws InvalidValueException
    {
        SpeciesImpl.edma_validate(value);
        return new SpeciesImpl(SpeciesImpl.edma_create(value));
    }

    /**
     * Call this method to test if the provided String is a valid Species
     * @param value  The String value to be tested
     * @return       true if the provided String is a valid Species
     */
    public static boolean isValidSpecies(String value)
    {
        try
        {
            SpeciesImpl.edma_validate(value);
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
     * returns the String value that is stored in this Species
     * @return  The String value stored in this Species
     */
    public abstract String value();
}
