package h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface m {
    static /* synthetic */ void clearFocus$default(m mVar, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        mVar.clearFocus(z10);
    }

    void clearFocus(boolean z10);

    /* renamed from: moveFocus-3ESFkO8, reason: not valid java name */
    boolean mo4142moveFocus3ESFkO8(int i10);
}
