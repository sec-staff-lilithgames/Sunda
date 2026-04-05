package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f11553a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11554b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f11555c;

    public o0() {
        this(0, 0, null, 7, null);
    }

    public final int getDelay() {
        return this.f11554b;
    }

    public final int getDuration() {
        return this.f11553a;
    }

    @Override // c0.k0
    public long getDurationNanos(float f10, float f11, float f12) {
        return (this.f11554b + this.f11553a) * 1000000;
    }

    @Override // c0.k0
    public /* bridge */ /* synthetic */ float getEndVelocity(float f10, float f11, float f12) {
        return super.getEndVelocity(f10, f11, f12);
    }

    @Override // c0.k0
    public float getValueFromNanos(long j10, float f10, float f11, float f12) {
        long j11 = (j10 / 1000000) - this.f11554b;
        int i10 = this.f11553a;
        return h3.lerp(f10, f11, this.f11555c.transform(qv.v.coerceIn(i10 == 0 ? 1.0f : qv.v.coerceIn(j11, 0L, i10) / i10, 0.0f, 1.0f)));
    }

    @Override // c0.k0
    public float getVelocityFromNanos(long j10, float f10, float f11, float f12) {
        long jCoerceIn = qv.v.coerceIn((j10 / 1000000) - this.f11554b, 0L, this.f11553a);
        if (jCoerceIn < 0) {
            return 0.0f;
        }
        if (jCoerceIn == 0) {
            return f12;
        }
        return (getValueFromNanos(jCoerceIn * 1000000, f10, f11, f12) - getValueFromNanos((jCoerceIn - 1) * 1000000, f10, f11, f12)) * 1000.0f;
    }

    @Override // c0.k0, c0.n
    public /* bridge */ /* synthetic */ i3 vectorize(n2 n2Var) {
        return super.vectorize(n2Var);
    }

    public o0(int i10, int i11, g0 easing) {
        kotlin.jvm.internal.e0.checkNotNullParameter(easing, "easing");
        this.f11553a = i10;
        this.f11554b = i11;
        this.f11555c = easing;
    }

    @Override // c0.k0, c0.n
    public /* bridge */ /* synthetic */ q3 vectorize(n2 n2Var) {
        return super.vectorize(n2Var);
    }

    public /* synthetic */ o0(int i10, int i11, g0 g0Var, int i12, kotlin.jvm.internal.u uVar) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? i0.getFastOutSlowInEasing() : g0Var);
    }
}
