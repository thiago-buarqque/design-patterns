package design.patterns.creational.prototype.graphic.element.weapon;

import design.patterns.creational.prototype.Mesh;
import design.patterns.creational.prototype.Position3D;
import design.patterns.creational.prototype.graphic.element.Element3D;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Projectile extends Element3D {
    protected double acceleration;
    protected double damage;

    protected Projectile(double acceleration, double damage, String id, Mesh mesh,
                         String name, Position3D position3D) {
        super(id, mesh, name, position3D);

        this.acceleration = acceleration;
        this.damage = damage;
    }

    protected Projectile(Projectile projectile) {
        super(projectile);

        this.acceleration = projectile.acceleration;
        this.damage = projectile.damage;
    }
}
