package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f11536a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11537b;

    /* JADX WARN: Illegal instructions before constructor call */
    public m0() {
        float f10 = 0.0f;
        this(f10, f10, 3, null);
    }

    @Override // c0.l0
    public float getAbsVelocityThreshold() {
        return this.f11536a;
    }

    @Override // c0.l0
    public long getDurationNanos(float f10, float f11) {
        return ((long) ((((float) Math.log(getAbsVelocityThreshold() / Math.abs(f11))) * 1000.0f) / this.f11537b)) * 1000000;
    }

    @Override // c0.l0
    public float getTargetValue(float f10, float f11) {
        if (Math.abs(f11) <= getAbsVelocityThreshold()) {
            return f10;
        }
        double dLog = Math.log(Math.abs(getAbsVelocityThreshold() / f11));
        float f12 = this.f11537b;
        return ((f11 / f12) * ((float) Math.exp((f12 * ((dLog / f12) * 1000)) / 1000.0f))) + (f10 - (f11 / f12));
    }

    @Override // c0.l0
    public float getValueFromNanos(long j10, float f10, float f11) {
        float f12 = this.f11537b;
        return ((f11 / f12) * ((float) Math.exp((f12 * (j10 / 1000000)) / 1000.0f))) + (f10 - (f11 / f12));
    }

    @Override // c0.l0
    public float getVelocityFromNanos(long j10, float f10, float f11) {
        return f11 * ((float) Math.exp(((j10 / 1000000) / 1000.0f) * this.f11537b));
    }

    public m0(float f10, float f11) {
        this.f11536a = Math.max(1.0E-7f, Math.abs(f11));
        this.f11537b = Math.max(1.0E-4f, f10) * (-4.2f);
    }

    public /* synthetic */ m0(float f10, float f11, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 0.1f : f11);
    }
}
