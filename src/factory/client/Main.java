package factory.client;

import factory.creator.BaseCreator;
import factory.creator.CreatorProduct1;
import factory.creator.CreatorProduct2;

public class Main {
    public static void main(String[] args) {
        BaseCreator creator = getProductCreatorForUser(0);
        creator.doSomething();
    }

    private static BaseCreator getProductCreatorForUser(int type) {
        if (type == 1)
            return new CreatorProduct1();
        else
            return new CreatorProduct2();
    }
}
