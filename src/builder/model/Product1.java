package builder.model;

import builder.enums.Type;
import builder.feature.Attribute1;
import builder.feature.Attribute2;
import builder.feature.Attribute3;
import builder.feature.Attribute4;

public class Product1 {
    private Type type;
    private Attribute1 attribute1;
    private Attribute2 attribute2;
    private Attribute3 attribute3;
    private Attribute4 attribute4;

    public Product1(Type type, Attribute1 attribute1, Attribute2 attribute2, Attribute3 attribute3, Attribute4 attribute4) {
        this.type = type;
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
        this.attribute3 = attribute3;
        this.attribute4 = attribute4;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Product1{ ");
        if (type != null)
            stringBuilder.append(" ").append("type=").append(type);
        if (attribute1 != null)
            stringBuilder.append(" ").append("attribute1=").append(attribute1.getName());
        if (attribute2 != null)
            stringBuilder.append(" ").append("attribute2=").append(attribute2.getName());
        if (attribute3 != null)
            stringBuilder.append(" ").append("attribute3=").append(attribute3.getName());
        if (attribute4 != null)
            stringBuilder.append(" ").append("attribute4=").append(attribute4.getName());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
