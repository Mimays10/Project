public class ShapeVolume {
    double volume(double l)
    { double vol;
        vol = l * l * l;
        //vol = 4/3 * 3.14 * r * r * r;
        return vol;
    }
    double volume(double l, double b, double h)
    { double vol;
        vol = l * b * h;
        //vol = 3.14 * r * r * h;
        return vol;
    }
}
