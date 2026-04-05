package yg;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class f extends e {

    /* renamed from: a, reason: collision with root package name */
    public final float f94425a;

    public f() {
        this.f94425a = -1.0f;
    }

    @Override // yg.e
    public void getCornerPath(v vVar, float f10, float f11, float f12) {
        float f13 = f12 * f11;
        vVar.reset(0.0f, f13, 180.0f, 180.0f - f10);
        double d10 = f13;
        vVar.lineTo((float) (Math.sin(Math.toRadians(f10)) * d10), (float) (Math.sin(Math.toRadians(90.0f - f10)) * d10));
    }

    @Deprecated
    public f(float f10) {
        this.f94425a = f10;
    }
}
