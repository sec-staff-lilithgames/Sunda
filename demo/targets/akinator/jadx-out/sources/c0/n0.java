package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f11543a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11544b;

    /* renamed from: c, reason: collision with root package name */
    public final float f11545c;

    /* renamed from: d, reason: collision with root package name */
    public final g1 f11546d;

    public n0() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    public final float getDampingRatio() {
        return this.f11543a;
    }

    @Override // c0.k0
    public long getDurationNanos(float f10, float f11, float f12) {
        g1 g1Var = this.f11546d;
        float stiffness = g1Var.getStiffness();
        float dampingRatio = g1Var.getDampingRatio();
        float f13 = f10 - f11;
        float f14 = this.f11545c;
        return f1.estimateAnimationDurationMillis(stiffness, dampingRatio, f12 / f14, f13 / f14, 1.0f) * 1000000;
    }

    @Override // c0.k0
    public float getEndVelocity(float f10, float f11, float f12) {
        return 0.0f;
    }

    public final float getStiffness() {
        return this.f11544b;
    }

    @Override // c0.k0
    public float getValueFromNanos(long j10, float f10, float f11, float f12) {
        g1 g1Var = this.f11546d;
        g1Var.setFinalPosition(f11);
        return s0.m193getValueimpl(g1Var.m157updateValuesIJZedt4$animation_core_release(f10, f12, j10 / 1000000));
    }

    @Override // c0.k0
    public float getVelocityFromNanos(long j10, float f10, float f11, float f12) {
        g1 g1Var = this.f11546d;
        g1Var.setFinalPosition(f11);
        return s0.m194getVelocityimpl(g1Var.m157updateValuesIJZedt4$animation_core_release(f10, f12, j10 / 1000000));
    }

    @Override // c0.k0, c0.n
    public /* bridge */ /* synthetic */ i3 vectorize(n2 n2Var) {
        return super.vectorize(n2Var);
    }

    public n0(float f10, float f11, float f12) {
        this.f11543a = f10;
        this.f11544b = f11;
        this.f11545c = f12;
        g1 g1Var = new g1(1.0f);
        g1Var.setDampingRatio(f10);
        g1Var.setStiffness(f11);
        this.f11546d = g1Var;
    }

    @Override // c0.k0, c0.n
    public /* bridge */ /* synthetic */ q3 vectorize(n2 n2Var) {
        return super.vectorize(n2Var);
    }

    public /* synthetic */ n0(float f10, float f11, float f12, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? 0.01f : f12);
    }
}
