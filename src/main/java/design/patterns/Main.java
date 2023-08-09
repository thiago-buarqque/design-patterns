package design.patterns;

import design.patterns.creational.prototype.graphic.element.character.Archer;
import design.patterns.creational.prototype.graphic.element.character.GameCharacter;
import design.patterns.creational.prototype.graphic.element.character.Lumberjack;
import design.patterns.creational.prototype.Position3D;
import design.patterns.creational.prototype.ScreenManager;

public class Main {
    public static void main(String[] args) {
        ScreenManager screenManager = ScreenManager.getInstance();

        Position3D defaultPosition = new Position3D(0, 0, 0);
        GameCharacter archer = new Archer(defaultPosition);

        screenManager.addElement(archer);
        archer.fire();
        archer.fire();
        archer.fire();

        GameCharacter lumberjack = new Lumberjack(new Position3D(100, 100, 100));
        screenManager.addElement(lumberjack);

        lumberjack.fire();
        lumberjack.fire();

        System.out.println("Removing lumberjack from screen...");
        screenManager.removeElement(lumberjack);

        System.out.println("Trying to throw lumberjack's axe...");
        lumberjack.fire();
    }
}