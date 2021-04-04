package learnedma.generated;

import java.util.ArrayList;
import java.util.Collection;
import org.abstractica.edma.metamodel.IMetaEnvironment;
import org.abstractica.edma.metamodel.impl.MetaEnvironment;
import org.abstractica.edma.metamodel.impl.ValueDomainBuilder;
import org.abstractica.edma.metamodel.impl.ValueDomainBuilder.Field;
import org.abstractica.edma.runtime.implementations.mem.modelstore.speed.newindex.IndexUtil;
import org.abstractica.edma.runtime.intf.IRuntimeFactory;
import org.abstractica.edma.valuedomains.impl.Constraint;

/**
 * 
 */
public class Edma
{
    public static final IMetaEnvironment environment = generateEnvironment();



    /**
     * generate the environment
     * @return  
     */
    public static IMetaEnvironment generateEnvironment()
    {
        ValueDomainBuilder vdb = new ValueDomainBuilder();
        
        //String value domain: Species
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newStringDomain("Species", null, 1, null, null, edma_constraints, false);
        }
        
        //Boolean value domain: Fly
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newBooleanDomain("Fly", null, edma_constraints, false);
        }
        
        //String value domain: Color
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newStringDomain("Color", null, 1, null, null, edma_constraints, false);
        }
        
        //Float value domain: Weight
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newFloatDomain("Weight", null, 0.0f, null, edma_constraints, false);
        }
        
        //Enum value domain: Climate
        {
            ArrayList<Constraint> edma_constraints = null;
            Collection<String> elements = new ArrayList<String>();
            elements.add("Tropical");
            elements.add("Dry");
            elements.add("Temperate");
            elements.add("Continental");
            elements.add("Polar");
            vdb.newEnumDomain("Climate", null, elements, edma_constraints, false);
        }
        
        //Boolean value domain: Extinct
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newBooleanDomain("Extinct", null, edma_constraints, false);
        }
        
        //Struct value domain: Bird
        {
            ArrayList<Constraint> edma_constraints = null;
            Collection<Field> fields = new ArrayList<Field>();
            fields.add(vdb.newStructField("species", "Species", false));
            fields.add(vdb.newStructField("canFly", "Fly", false));
            fields.add(vdb.newStructField("color", "Color", false));
            fields.add(vdb.newStructField("weight", "Weight", false));
            fields.add(vdb.newStructField("climate", "Climates", false));
            fields.add(vdb.newStructField("isExtinct", "Extinct", false));
            vdb.newStructDomain("Bird", null, fields, edma_constraints, false);
        }
        
        //List value domain: Climates
        {
            ArrayList<Constraint> edma_constraints = null;
            vdb.newListDomain("Climates", null, "Climate", 1, 5, edma_constraints, false);
        }
        MetaEnvironment edma_environment = new MetaEnvironment("Edma");
        vdb.buildWithEnvironment(edma_environment);
        //Hack to make serializeable work...
        IndexUtil.setValueDomainDefinitions(edma_environment.getValueDomainDefinitions());
        return edma_environment;
    }

    /**
     * Constructor
     * @param factory  The runtime factory
     */
    public Edma(IRuntimeFactory factory)
    {
        
    }
}
