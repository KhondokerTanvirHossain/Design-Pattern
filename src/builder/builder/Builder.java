package builder.builder;

import builder.enums.Type;
import builder.feature.Attribute1;
import builder.feature.Attribute2;
import builder.feature.Attribute3;
import builder.feature.Attribute4;

public interface Builder {
    void setType(Type type);
    void setAttribute1(Attribute1 attribute1);
    void setAttribute2(Attribute2 attribute2);
    void setAttribute3(Attribute3 attribute3);
    void setAttribute4(Attribute4 attribute4);
}
