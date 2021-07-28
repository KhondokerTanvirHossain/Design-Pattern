package builder.director;

import builder.builder.Builder;
import builder.enums.Type;
import builder.feature.Attribute1;
import builder.feature.Attribute2;
import builder.feature.Attribute3;
import builder.feature.Attribute4;

public class Director {
    public void createType1Product1(Builder builder) {
        builder.setType(Type.TYPE1);
        builder.setAttribute1(new Attribute1("name1", 10, 100));
        builder.setAttribute2(new Attribute2("name2", 10, 100));
        builder.setAttribute3(new Attribute3("name3", 10, 100));
        builder.setAttribute4(new Attribute4("name4", 10, 100));
    }

    public void createType2Product1(Builder builder) {
        builder.setType(Type.TYPE2);
        builder.setAttribute1(new Attribute1("name1", 10, 100));
        builder.setAttribute2(new Attribute2("name2", 10, 100));
        builder.setAttribute3(new Attribute3("name3", 10, 100));
        builder.setAttribute4(new Attribute4("name4", 10, 100));
    }

        public void createType3Product3(Builder builder) {
        builder.setType(Type.TYPE3);
        builder.setAttribute1(new Attribute1("name1", 10, 100));
    }
}
