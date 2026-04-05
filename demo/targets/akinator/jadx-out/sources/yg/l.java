package yg;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class l extends r4.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f94474a;

    public l(int i10) {
        super(a.b.e(i10, "cornerSizeAtIndex"));
        this.f94474a = i10;
    }

    @Override // r4.a0
    public float getValue(j jVar) {
        float[] fArr = jVar.E;
        if (fArr != null) {
            return fArr[this.f94474a];
        }
        return 0.0f;
    }

    @Override // r4.a0
    public void setValue(j jVar, float f10) {
        float[] fArr = jVar.E;
        if (fArr != null) {
            int i10 = this.f94474a;
            if (fArr[i10] != f10) {
                fArr[i10] = f10;
                k kVar = jVar.G;
                if (kVar != null) {
                    ((af.g) kVar).onCornerSizeChange(jVar.getCornerSizeDiffX());
                }
                jVar.invalidateSelf();
            }
        }
    }
}
