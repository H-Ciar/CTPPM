package lab7.InterfacesResizableandGeometricObject;

import lab7.GeometricObjectInterfaceanditsImplementationClassesCircleandRectangle.Circle;

public class ResizableCircle extends Circle implements Resizable{
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public String toString() {
        return "Resizable[" +
                super.toString() +
                "]";
    }

    /**
     * @param percent
     */
    @Override
    public void resize(int percent) {
        radius *= percent/100.0;
    }
}
