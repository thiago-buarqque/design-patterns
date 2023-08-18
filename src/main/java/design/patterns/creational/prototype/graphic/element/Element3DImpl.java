package design.patterns.creational.prototype.graphic.element;

import design.patterns.behavioral.observer.GraphicElementSubject;
import design.patterns.creational.prototype.Mesh;
import design.patterns.creational.prototype.Position3D;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public abstract class Element3DImpl extends GraphicElementImpl implements Element3D {
    private Mesh mesh;
    private Position3D position3D;

    protected Element3DImpl(String id, Mesh mesh, String name, Position3D position3D) {
        super(id, name);

        this.mesh = mesh;
        this.position3D = position3D;
    }

    protected Element3DImpl(String id, Mesh mesh, String name, Position3D position3D, GraphicElementSubject subject) {
        super(id, name, subject);

        this.mesh = mesh;
        this.position3D = position3D;
    }

    protected Element3DImpl(Element3DImpl element3D) {
        super(element3D);

        this.mesh = element3D.mesh.makeClone();
        this.position3D = element3D.position3D.makeClone();
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
