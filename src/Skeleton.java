public class Skeleton extends Boss {
    int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + this.arrows;
    }
}
