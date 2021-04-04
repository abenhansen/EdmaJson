package learnedma.generated.valuedomains.impl;

import java.util.ArrayList;
import learnedma.generated.valuedomains.Climate;
import learnedma.generated.valuedomains.Climates;
import learnedma.generated.valuedomains.Climates.ClimatesBuilder;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * 
 */
public class ClimatesBuilderImpl implements ClimatesBuilder
{
    private ArrayList<Object> valueList;



    /**
     * Constructor
     */
    public ClimatesBuilderImpl()
    {
        valueList = new ArrayList<Object>();
    }

    /**
     * Adds an element to the list
     * @param climate  The element to be added to the list
     * @return         An interface to the builder for chaining method calls
     */
    public ClimatesBuilder add(Climate climate)
    {
        if(climate == null) throw new NullPointerException();
        valueList.add(((IValueInstance) climate).edma_getValue());
        return this;
    }

    /**
     * Adds an element to the list
     * @param climate  The element to be added to the list
     * @return         An interface to the builder for chaining method calls
     */
    public ClimatesBuilder add(String climate) throws InvalidValueException
    {
        if(climate == null) throw new NullPointerException();
        ClimateImpl.edma_validate(climate);
        valueList.add(ClimateImpl.edma_create(climate));
        return this;
    }

    /**
     * Builds the list with the added elements
     * @return  The builded list
     */
    public Climates end() throws InvalidValueException
    {
        Object[] res = new Object[valueList.size()];
        int pos = 0;
        for(Object o : valueList)
        {
            res[pos++] = o;
        }
        ClimatesImpl.edma_validate(res);
        return new ClimatesImpl(ClimatesImpl.edma_create(res));
    }
}
