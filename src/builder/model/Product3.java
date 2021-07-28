package builder.model;

import builder.enums.Type;
import builder.feature.Attribute1;

public class Product3 {
    private Type type;
    private Attribute1 attribute1;

    public Product3(Type type, Attribute1 attribute1) {
        this.type = type;
        this.attribute1 = attribute1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Product1{");
        if (type != null)
            stringBuilder.append(" ").append("type=").append(type);
        if (attribute1 != null)
            stringBuilder.append(" ").append("attribute1=").append(attribute1.getName());
        stringBuilder.append(" ").append("}");
        return stringBuilder.toString();
    }
}
