package j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface p1 {
    static /* synthetic */ boolean getSegment$default(p1 p1Var, float f10, float f11, l1 l1Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSegment");
        }
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return p1Var.getSegment(f10, f11, l1Var, z10);
    }

    float getLength();

    boolean getSegment(float f10, float f11, l1 l1Var, boolean z10);

    void setPath(l1 l1Var, boolean z10);
}
