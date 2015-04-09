package collection;

public class Image {

    double imageSize;
    private String name;
    public double width;
    public double height;

    public Image(String name, int width, int height, double size) {
        this.name = name;
        this.width = width;
        this.imageSize = size;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getImageSize() {
        return imageSize;
    }

    @Override
    public String toString() {
        return "Image{" + "imageSize=" + imageSize + ", name=" + name + ", width=" + width + ", height=" + height + '}';
    }


}
