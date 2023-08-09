package design.patterns.creational.prototype.graphic.element.character;

import design.patterns.creational.prototype.Mesh;
import design.patterns.creational.prototype.Position3D;
import design.patterns.creational.prototype.ScreenManager;
import design.patterns.creational.prototype.graphic.element.Element3D;
import design.patterns.creational.prototype.graphic.element.GraphicElement;
import design.patterns.creational.prototype.graphic.element.weapon.Projectile;
import lombok.Getter;

@Getter
public abstract class GameCharacter extends Element3D {
    private final Projectile projectile;
    // use that to know where the character is
    // The same position as the base Projectile
    // So the Projectile is always thrown from the character

    protected GameCharacter(GameCharacter gameCharacter) {
        super(gameCharacter);

        this.projectile = gameCharacter.projectile;
    }

    protected GameCharacter(
            String id, Mesh mesh, String name, Position3D position3D,
            Projectile projectile) {
        super(id, mesh, name, position3D);

        this.projectile = projectile;
    }

    public final void fire() {
        ScreenManager screenManager = ScreenManager.getInstance();

        GraphicElement element = screenManager.getElement(this);

        if (element == null) {
            System.out.printf("Cannot shoot. The character '%s' is not " +
                              "rendered.\n", this.getName());
            return;
        }

        // I'm just adding some stuff "in the screen", but the proper way
        // would be to have something to instruct the screenManager
        // to handle the projectile
        try {
            System.out.printf("%s is firing %s\n",
                              this.getName(), this.getProjectile().getName());

            GraphicElement weapon = this.projectile.makeClone();
            System.out.printf("Projectile memory id: %s\n\n",
                              Integer.toHexString(
                                      System.identityHashCode(weapon)));

            screenManager.addElement(weapon);
        } catch (CloneNotSupportedException e) {
            System.out.println(
                    "Can not render " + this.projectile.getName());
            throw new RuntimeException(e);
        }
    }

    @Override
    public GraphicElement makeClone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
