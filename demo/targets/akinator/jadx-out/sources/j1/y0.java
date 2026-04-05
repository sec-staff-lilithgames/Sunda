package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface y0 {
    static /* synthetic */ void readPixels$default(y0 y0Var, int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readPixels");
        }
        if ((i16 & 2) != 0) {
            i10 = 0;
        }
        if ((i16 & 4) != 0) {
            i11 = 0;
        }
        if ((i16 & 8) != 0) {
            i12 = y0Var.getWidth();
        }
        if ((i16 & 16) != 0) {
            i13 = y0Var.getHeight();
        }
        if ((i16 & 32) != 0) {
            i14 = 0;
        }
        if ((i16 & 64) != 0) {
            i15 = i12;
        }
        y0Var.readPixels(iArr, i10, i11, i12, i13, i14, i15);
    }

    k1.g getColorSpace();

    /* renamed from: getConfig-_sVssgQ */
    int mo4754getConfig_sVssgQ();

    boolean getHasAlpha();

    int getHeight();

    int getWidth();

    void prepareToDraw();

    void readPixels(int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15);
}
