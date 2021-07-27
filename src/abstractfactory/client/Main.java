package abstractfactory.client;

import abstractfactory.creator.BaseCreator;
import abstractfactory.creator.CreatorConcrete1;
import abstractfactory.creator.CreatorConcrete2;

public class Main {
    private static Client configure(int type) {
        BaseCreator creator;
        if (type == 1) {
            creator = new CreatorConcrete1();
        } else {
            creator = new CreatorConcrete2();
        }
        return new Client(creator);
    }

    public static void main(String[] args) {
        Client client = configure(1);
        client.doSomething();
    }
}
