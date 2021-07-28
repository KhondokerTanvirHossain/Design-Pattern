package builder.model;

import builder.enums.Type;
import builder.feature.Attribute3;
import builder.feature.Attribute4;

public class Product2 {
    private Type type;
    private Attribute3 attribute3;
    private Attribute4 attribute4;

    public Product2(Type type, Attribute3 attribute3, Attribute4 attribute4) {
        this.type = type;
        this.attribute3 = attribute3;
        this.attribute4 = attribute4;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Product1{");
        if (type != null)
            stringBuilder.append(" ").append("type=").append(type);
       if (attribute3 != null)
            stringBuilder.append(" ").append("attribute3=").append(attribute3.getName());
        if (attribute4 != null)
            stringBuilder.append(" ").append("attribute4=").append(attribute4.getName());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
