package factory;

import factory.factories.SamsungDisplayFactory;
import factory.factories.XiaomiDisplayFactory;
import factory.gadgets.SamsungStandardDisplay;
import factory.method.*;

public class MainFactoryMethod {

    public static void main(String args[]) {
        Display samsungDisplayFactory = new SamsungDisplayFactory();
        Display xiaomiDisplayFactory = new XiaomiDisplayFactory();

        StandardDisplay samsungStandardDisplay = samsungDisplayFactory.createStandardDisplay(6.0);
        samsungStandardDisplay.assemble();
        samsungStandardDisplay.qualityTest(samsungStandardDisplay);
        System.out.println();

        FoldableDisplay samsungFoldableDisplay = samsungDisplayFactory.createFoldableDisplay(8.0);
        samsungFoldableDisplay.assemble();
        samsungFoldableDisplay.qualityTest(samsungStandardDisplay);
        System.out.println();

        StandardDisplay xiaomiStandardDisplay = xiaomiDisplayFactory.createStandardDisplay(6.0);
        xiaomiStandardDisplay.assemble();
        xiaomiStandardDisplay.qualityTest(xiaomiStandardDisplay);
        System.out.println();

        FoldableDisplay xiaomiFoldableDisplay = xiaomiDisplayFactory.createFoldableDisplay(8.0);
        xiaomiFoldableDisplay.assemble();
        xiaomiFoldableDisplay.qualityTest(xiaomiStandardDisplay);
    }
}
