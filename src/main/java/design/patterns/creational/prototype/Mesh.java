package design.patterns.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Mesh implements Cloneable<Mesh> {
    private String name;

    @Override
    public Mesh makeClone() {
        return new Mesh(name);
    }
}
