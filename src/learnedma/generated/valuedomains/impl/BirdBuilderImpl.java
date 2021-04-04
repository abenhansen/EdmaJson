package learnedma.generated.valuedomains.impl;

import learnedma.generated.valuedomains.Bird;
import learnedma.generated.valuedomains.Bird.BirdBuilderCanFly;
import learnedma.generated.valuedomains.Bird.BirdBuilderClimate;
import learnedma.generated.valuedomains.Bird.BirdBuilderColor;
import learnedma.generated.valuedomains.Bird.BirdBuilderIsExtinct;
import learnedma.generated.valuedomains.Bird.BirdBuilderSpecies;
import learnedma.generated.valuedomains.Bird.BirdBuilderWeight;
import learnedma.generated.valuedomains.Climates;
import learnedma.generated.valuedomains.Color;
import learnedma.generated.valuedomains.Extinct;
import learnedma.generated.valuedomains.Fly;
import learnedma.generated.valuedomains.Species;
import learnedma.generated.valuedomains.Weight;
import learnedma.generated.valuedomains.impl.ColorImpl;
import learnedma.generated.valuedomains.impl.ExtinctImpl;
import learnedma.generated.valuedomains.impl.FlyImpl;
import learnedma.generated.valuedomains.impl.SpeciesImpl;
import learnedma.generated.valuedomains.impl.WeightImpl;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * 
 */
public class BirdBuilderImpl implements BirdBuilderCanFly, BirdBuilderClimate, BirdBuilderColor, BirdBuilderIsExtinct, BirdBuilderSpecies, BirdBuilderWeight
{
    private Object[] edma_value;



    /**
     * Constructor
     */
    public BirdBuilderImpl()
    {
        edma_value = new Object[6];
    }

    /**
     * sets the species field.
     * @param species  The value to assign to the species field
     * @return         Builder interface for setting the canFly field
     */
    public BirdBuilderCanFly species(Species species)
    {
        if(species == null) throw new NullPointerException("The field species in Bird may not be null");
        edma_value[0] = ((IValueInstance) species).edma_getValue();
        return this;
    }

    /**
     * sets the species field.
     * @param species  The value to assign to the species field
     * @return         Builder interface for setting the canFly field
     */
    public BirdBuilderCanFly species(String species) throws InvalidValueException
    {
        if(species != null) SpeciesImpl.edma_validate(species);
        if(species == null) throw new NullPointerException();
        edma_value[0] = SpeciesImpl.edma_create(species);
        return this;
    }

    /**
     * sets the canFly field.
     * @param canFly  The value to assign to the canFly field
     * @return        Builder interface for setting the color field
     */
    public BirdBuilderColor canFly(Fly canFly)
    {
        if(canFly == null) throw new NullPointerException("The field canFly in Bird may not be null");
        edma_value[1] = ((IValueInstance) canFly).edma_getValue();
        return this;
    }

    /**
     * sets the canFly field.
     * @param canFly  The value to assign to the canFly field
     * @return        Builder interface for setting the color field
     */
    public BirdBuilderColor canFly(Boolean canFly)
    {
        if(canFly == null) throw new NullPointerException();
        edma_value[1] = FlyImpl.edma_create(canFly);
        return this;
    }

    /**
     * sets the color field.
     * @param color  The value to assign to the color field
     * @return       Builder interface for setting the weight field
     */
    public BirdBuilderWeight color(Color color)
    {
        if(color == null) throw new NullPointerException("The field color in Bird may not be null");
        edma_value[2] = ((IValueInstance) color).edma_getValue();
        return this;
    }

    /**
     * sets the color field.
     * @param color  The value to assign to the color field
     * @return       Builder interface for setting the weight field
     */
    public BirdBuilderWeight color(String color) throws InvalidValueException
    {
        if(color != null) ColorImpl.edma_validate(color);
        if(color == null) throw new NullPointerException();
        edma_value[2] = ColorImpl.edma_create(color);
        return this;
    }

    /**
     * sets the weight field.
     * @param weight  The value to assign to the weight field
     * @return        Builder interface for setting the climate field
     */
    public BirdBuilderClimate weight(Weight weight)
    {
        if(weight == null) throw new NullPointerException("The field weight in Bird may not be null");
        edma_value[3] = ((IValueInstance) weight).edma_getValue();
        return this;
    }

    /**
     * sets the weight field.
     * @param weight  The value to assign to the weight field
     * @return        Builder interface for setting the climate field
     */
    public BirdBuilderClimate weight(Float weight) throws InvalidValueException
    {
        if(weight != null) WeightImpl.edma_validate(weight);
        if(weight == null) throw new NullPointerException();
        edma_value[3] = WeightImpl.edma_create(weight);
        return this;
    }

    /**
     * sets the climate field.
     * @param climate  The value to assign to the climate field
     * @return         Builder interface for setting the isExtinct field
     */
    public BirdBuilderIsExtinct climate(Climates climate)
    {
        if(climate == null) throw new NullPointerException("The field climate in Bird may not be null");
        edma_value[4] = ((IValueInstance) climate).edma_getValue();
        return this;
    }

    /**
     * sets the isExtinct field.
     * @param isExtinct  The value to assign to the isExtinct field
     * @return           The created Bird value
     */
    public Bird isExtinct(Extinct isExtinct)
    {
        if(isExtinct == null) throw new NullPointerException("The field isExtinct in Bird may not be null");
        edma_value[5] = ((IValueInstance) isExtinct).edma_getValue();
        return new BirdImpl(BirdImpl.edma_create(edma_value));
    }

    /**
     * sets the isExtinct field.
     * @param isExtinct  The value to assign to the isExtinct field
     * @return           The created Bird value
     */
    public Bird isExtinct(Boolean isExtinct)
    {
        if(isExtinct == null) throw new NullPointerException();
        edma_value[5] = ExtinctImpl.edma_create(isExtinct);
        return new BirdImpl(BirdImpl.edma_create(edma_value));
    }
}
