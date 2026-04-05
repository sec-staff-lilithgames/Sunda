package x3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t3 {
    public static int a(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 32) {
            return 5;
        }
        if (i10 == 64) {
            return 6;
        }
        if (i10 == 128) {
            return 7;
        }
        if (i10 == 256) {
            return 8;
        }
        if (i10 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(a.b.e(i10, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static int captionBar() {
        return 4;
    }

    public static int displayCutout() {
        return 128;
    }

    public static int ime() {
        return 8;
    }

    public static int mandatorySystemGestures() {
        return 32;
    }

    public static int navigationBars() {
        return 2;
    }

    public static int statusBars() {
        return 1;
    }

    public static int systemBars() {
        return 519;
    }

    public static int systemGestures() {
        return 16;
    }

    public static int systemOverlays() {
        return 512;
    }

    public static int tappableElement() {
        return 64;
    }
}
