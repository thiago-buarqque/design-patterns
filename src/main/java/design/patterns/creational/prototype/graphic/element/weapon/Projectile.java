package design.patterns.creational.prototype.graphic.element.weapon;

import design.patterns.behavioral.observer.GraphicElementSubject;
import design.patterns.creational.prototype.Mesh;
import design.patterns.creational.prototype.Position3D;
import design.patterns.creational.prototype.graphic.element.Element3DImpl;
import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Projectile extends Element3DImpl {
    protected double acceleration;
    protected double damage;

    protected Projectile(double acceleration, double damage, String id, Mesh mesh,
                         String name, Position3D position3D) {
        super(id, mesh, name, position3D);

        this.acceleration = acceleration;
        this.damage = damage;
    }

    protected Projectile(double acceleration, double damage, String id, Mesh mesh,
                         String name, Position3D position3D, GraphicElementSubject subject) {
        super(id, mesh, name, position3D, subject);

        this.acceleration = acceleration;
        this.damage = damage;
    }

    protected Projectile(Projectile projectile) {
        super(projectile);

        this.acceleration = projectile.acceleration;
        this.damage = projectile.damage;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;

        super.notifyUpdate();
    }

    public void setDamage(double damage) {
        this.damage = damage;

        super.notifyUpdate();
    }

    @Override
    public void update(GraphicElementSubject subject) {
        if(subject instanceof Projectile) {
            Projectile projectile = (Projectile) subject;
            System.out.println("Updating projectile state based on subject.");

            this.acceleration = projectile.acceleration;
            this.damage = projectile.damage;
        }
        else {
            super.update(subject);
        }
    }
}
