package design.patterns.creational.prototype.graphic.element.weapon;

import design.patterns.creational.prototype.Mesh;
import design.patterns.creational.prototype.Position3D;
import design.patterns.creational.prototype.graphic.element.GraphicElement;

public class Arrow extends Projectile {

    public Arrow(double damage, String id, Mesh mesh, String name,
                 Position3D position3D) {
        super(15, damage, id, mesh, name, position3D);
    }

    private Arrow(Arrow arrow) {
        super(arrow);
    }

    @Override
    public GraphicElement makeClone() {
        return new Arrow(this);
    }

}
