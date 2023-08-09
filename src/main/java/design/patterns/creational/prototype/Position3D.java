package design.patterns.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Position3D implements Cloneable<Position3D> {
    private int x;
    private int y;
    private int z;

    @Override
    public Position3D makeClone() {
        return new Position3D(x, y, z);
    }
}
