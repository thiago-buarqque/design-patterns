package design.patterns.creational.prototype.graphic.element.character;

import design.patterns.creational.prototype.Mesh;
import design.patterns.creational.prototype.Position3D;
import design.patterns.creational.prototype.graphic.element.weapon.Arrow;

public class Archer extends GameCharacter {

    public Archer(Position3D position3D) {
        super("character.archer", new Mesh("archer-mesh"), "Wooden archer",
              position3D, new Arrow(250, "arrow-1",
                                    new Mesh("blue-arrow-mesh"),
                                    "arrow", position3D));
    }

}
