package design.patterns.creational.prototype.graphic.element;

import design.patterns.creational.prototype.Position3D;
import lombok.NonNull;

public abstract class BaseGraphicElement implements GraphicElement {
    private final String name;
    private final String id;
    private Position3D position3D;

    protected BaseGraphicElement(String id, String name, Position3D position3D) {
        this.id = id;
        this.name = name;
        this.position3D = position3D;
    }

    protected BaseGraphicElement(@NonNull BaseGraphicElement baseGraphicElement) {
        this.id = baseGraphicElement.id;
        this.name = baseGraphicElement.name;
        this.position3D = baseGraphicElement.position3D.makeClone();
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Position3D getPosition3D() {
        return this.position3D;
    }

    @Override
    public void setPosition3D(Position3D position3D) {
        this.position3D = position3D;
    }
}
