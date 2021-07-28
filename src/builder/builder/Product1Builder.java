package builder.builder;

import builder.enums.Type;
import builder.feature.Attribute1;
import builder.feature.Attribute2;
import builder.feature.Attribute3;
import builder.feature.Attribute4;
import builder.model.Product1;

public class Product1Builder implements Builder{
    private Type type;
    private Attribute1 attribute1;
    private Attribute2 attribute2;
    private Attribute3 attribute3;
    private Attribute4 attribute4;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setAttribute1(Attribute1 attribute1) {
        this.attribute1 = attribute1;
    }

    @Override
    public void setAttribute2(Attribute2 attribute2) {
        this.attribute2 = attribute2;
    }

    @Override
    public void setAttribute3(Attribute3 attribute3) {
        this.attribute3 = attribute3;
    }

    @Override
    public void setAttribute4(Attribute4 attribute4) {
        this.attribute4 = attribute4;
    }

    public Product1 getResult() {
        return new Product1(type, attribute1, attribute2, attribute3, attribute4);
    }
}
