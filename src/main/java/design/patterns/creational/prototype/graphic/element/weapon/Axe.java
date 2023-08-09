package design.patterns.creational.prototype.graphic.element.weapon;

import design.patterns.creational.prototype.Mesh;
import design.patterns.creational.prototype.Position3D;
import design.patterns.creational.prototype.graphic.element.GraphicElement;

public class Axe extends Projectile {

    public Axe(double damage, String id, Mesh mesh, String name,
               Position3D position3D) {
        super(10, damage, id, mesh, name, position3D);
    }

    private Axe(Axe element3D) {
        super(element3D);
    }

    @Override
    public GraphicElement makeClone() {
        return new Axe(this);
    }
}
