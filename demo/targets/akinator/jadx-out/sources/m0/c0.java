package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c0 {
    public static final long ensureAtLeastOneChar(int i10, int i11, boolean z10, boolean z11) {
        return i11 == 0 ? g2.b2.TextRange(i10, i10) : i10 == 0 ? z10 ? g2.b2.TextRange(1, 0) : g2.b2.TextRange(0, 1) : i10 == i11 ? z10 ? g2.b2.TextRange(i11 - 1, i11) : g2.b2.TextRange(i11, i11 - 1) : z10 ? !z11 ? g2.b2.TextRange(i10 - 1, i10) : g2.b2.TextRange(i10 + 1, i10) : !z11 ? g2.b2.TextRange(i10, i10 + 1) : g2.b2.TextRange(i10, i10 - 1);
    }
}
