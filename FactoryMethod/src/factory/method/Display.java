package factory.method;

public abstract class Display {

    public abstract FoldableDisplay createFoldableDisplay(Double polegadas);

    public abstract StandardDisplay createStandardDisplay(Double polegadas);
}
