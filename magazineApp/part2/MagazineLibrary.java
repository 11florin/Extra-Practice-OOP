package magazineApp.part2;

import java.util.ArrayList;

public class MagazineLibrary {

    private ArrayList<Magazine> magazine;

    public MagazineLibrary() {
        this.magazine = new ArrayList<>();
    }

    public Magazine getMagazine(int index) {
        Magazine mCopy = new Magazine(this.magazine.get(index));
        return mCopy;
    }

    public void setMagazine(int index, Magazine newMagazine) {
        Magazine mCopy = new Magazine(newMagazine);
        this.magazine.set(index, mCopy);
    }

    public void addMagazine(Magazine newMagazine) {
        Magazine mCopy = new Magazine(newMagazine);
        this.magazine.add(mCopy);
    }
}
