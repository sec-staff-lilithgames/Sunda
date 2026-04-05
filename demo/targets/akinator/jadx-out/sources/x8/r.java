package x8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r extends x {
    @Override // x8.x
    public w getSampleSizeRounding(int i10, int i11, int i12, int i13) {
        return w.f91872b;
    }

    @Override // x8.x
    public float getScaleFactor(int i10, int i11, int i12, int i13) {
        int iCeil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
        return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
    }
}
