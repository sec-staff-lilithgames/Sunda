package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s2 implements c0.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final f2 f8501a;

    public s2(s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        this.f8501a = new f2(t2.getPlatformFlingScrollFriction(), density);
    }

    @Override // c0.l0
    public float getAbsVelocityThreshold() {
        return 0.0f;
    }

    @Override // c0.l0
    public long getDurationNanos(float f10, float f11) {
        return this.f8501a.flingDuration(f11) * 1000000;
    }

    @Override // c0.l0
    public float getTargetValue(float f10, float f11) {
        return (Math.signum(f11) * this.f8501a.flingDistance(f11)) + f10;
    }

    @Override // c0.l0
    public float getValueFromNanos(long j10, float f10, float f11) {
        return this.f8501a.flingInfo(f11).position(j10 / 1000000) + f10;
    }

    @Override // c0.l0
    public float getVelocityFromNanos(long j10, float f10, float f11) {
        return this.f8501a.flingInfo(f11).velocity(j10 / 1000000);
    }
}
