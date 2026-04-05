package x8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class u extends x {
    @Override // x8.x
    public w getSampleSizeRounding(int i10, int i11, int i12, int i13) {
        return x.f91885g ? w.f91873c : w.f91872b;
    }

    @Override // x8.x
    public float getScaleFactor(int i10, int i11, int i12, int i13) {
        if (x.f91885g) {
            return Math.min(i12 / i10, i13 / i11);
        }
        if (Math.max(i11 / i13, i10 / i12) == 0) {
            return 1.0f;
        }
        return 1.0f / Integer.highestOneBit(r2);
    }
}
