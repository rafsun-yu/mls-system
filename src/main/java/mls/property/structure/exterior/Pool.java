package mls.property.structure.exterior;

import mls.Size;
import mls.property.structure.exterior.Exterior;

public class Pool extends Exterior {
    public Pool(){};
    public Pool(Size size) {
        super(size);
    }

    /**
     * copy constructor
     * @param other
     */
    public Pool(Pool other){
        super(other);
    }
}
