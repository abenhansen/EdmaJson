import org.abstractica.edma.generator.EdmaGenerator;

public class Make {
    public static void main(String[] args) {
        String projectDir = "D://Edma";
        EdmaGenerator generator = new EdmaGenerator("Edma", projectDir+"/edmasrc", projectDir+"/src", "learnedma");
        generator.make();
    }
}
