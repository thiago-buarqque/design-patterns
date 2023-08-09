package design.patterns.creational.prototype.graphic.element.character;

import design.patterns.creational.prototype.Mesh;
import design.patterns.creational.prototype.Position3D;
import design.patterns.creational.prototype.graphic.element.weapon.Axe;

public class Lumberjack extends GameCharacter {
    public Lumberjack(Position3D position3D) {
        super("lumber", new Mesh("lumberjack-mesh"), "Lumberjack", position3D,
              new Axe(315, "axe-1", new Mesh("brown-axe-mesh"),
                      "axe", position3D));
    }
}
