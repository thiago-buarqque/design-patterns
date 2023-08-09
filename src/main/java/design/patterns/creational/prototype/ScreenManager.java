package design.patterns.creational.prototype;

import design.patterns.creational.prototype.graphic.element.GraphicElement;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ScreenManager {
    private List<GraphicElement> screenElements;
    private static ScreenManager screenManager;

    public static ScreenManager getInstance() {
        if(screenManager == null) {
            screenManager = new ScreenManager();
        }

        return screenManager;
    }

    private ScreenManager() {
        this.screenElements = new ArrayList<>();
    }

    public void addElement(GraphicElement graphicElement) {
        this.screenElements.add(graphicElement);
    }

    public void removeElement(GraphicElement graphicElement) {
        this.screenElements.remove(graphicElement);
    }

    public GraphicElement getElement(GraphicElement graphicElement) {
        int elementIndex = this.screenElements.indexOf(graphicElement);

        if (elementIndex == -1) {
            return null;
        }

        return this.screenElements.get(elementIndex);
    }
}
