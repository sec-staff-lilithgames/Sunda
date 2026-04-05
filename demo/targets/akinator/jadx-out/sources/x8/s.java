package x8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class s extends x {
    @Override // x8.x
    public w getSampleSizeRounding(int i10, int i11, int i12, int i13) {
        return getScaleFactor(i10, i11, i12, i13) == 1.0f ? w.f91873c : x.f91879a.getSampleSizeRounding(i10, i11, i12, i13);
    }

    @Override // x8.x
    public float getScaleFactor(int i10, int i11, int i12, int i13) {
        return Math.min(1.0f, x.f91879a.getScaleFactor(i10, i11, i12, i13));
    }
}
