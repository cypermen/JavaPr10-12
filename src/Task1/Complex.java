package Task1;

public class Complex {
    private int real;
    private int image;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    @Override
    public String toString() {
        return "real=" + real + "\nimage=" + image + "\n";
    }
}
