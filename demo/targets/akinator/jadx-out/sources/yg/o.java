package yg;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class o extends e {

    /* renamed from: a, reason: collision with root package name */
    public final float f94476a;

    public o() {
        this.f94476a = -1.0f;
    }

    @Override // yg.e
    public void getCornerPath(v vVar, float f10, float f11, float f12) {
        float f13 = f12 * f11;
        vVar.reset(0.0f, f13, 180.0f, 180.0f - f10);
        float f14 = f13 * 2.0f;
        vVar.addArc(0.0f, 0.0f, f14, f14, 180.0f, f10);
    }

    @Deprecated
    public o(float f10) {
        this.f94476a = f10;
    }
}
