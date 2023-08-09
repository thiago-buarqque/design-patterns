package design.patterns.creational.prototype.graphic.element;

import design.patterns.creational.prototype.Mesh;
import design.patterns.creational.prototype.Position3D;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public abstract class Element3D extends BaseGraphicElement {
    private Mesh mesh;

    protected Element3D(String id, Mesh mesh, String name, Position3D position3D) {
        super(id, name, position3D);

        this.mesh = mesh;
    }

    protected Element3D(Element3D element3D) {
        super(element3D);

        this.mesh = element3D.mesh.makeClone();
    }
}
