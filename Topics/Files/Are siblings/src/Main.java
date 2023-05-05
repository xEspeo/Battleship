import java.io.File;

class Siblings {

    public static boolean areSiblings(File f1, File f2) {
        // implement me
        boolean isSame = false;
        if(f1.getParent().equals(f2.getParent())) {
            isSame = true;
        }
        return isSame;
    }
}