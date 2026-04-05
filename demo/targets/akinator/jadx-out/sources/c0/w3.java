package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w3 implements o3 {

    /* renamed from: a, reason: collision with root package name */
    public final float f11658a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11659b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q3 f11660c;

    public /* synthetic */ w3(float f10, float f11, v vVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 1500.0f : f11, (i10 & 4) != 0 ? null : vVar);
    }

    public final float getDampingRatio() {
        return this.f11658a;
    }

    @Override // c0.o3, c0.i3
    public long getDurationNanos(v initialValue, v targetValue, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetValue, "targetValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        return this.f11660c.getDurationNanos(initialValue, targetValue, initialVelocity);
    }

    @Override // c0.o3, c0.i3
    public v getEndVelocity(v initialValue, v targetValue, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetValue, "targetValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        return this.f11660c.getEndVelocity(initialValue, targetValue, initialVelocity);
    }

    public final float getStiffness() {
        return this.f11659b;
    }

    @Override // c0.o3, c0.i3
    public v getValueFromNanos(long j10, v initialValue, v targetValue, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetValue, "targetValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        return this.f11660c.getValueFromNanos(j10, initialValue, targetValue, initialVelocity);
    }

    @Override // c0.o3, c0.i3
    public v getVelocityFromNanos(long j10, v initialValue, v targetValue, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetValue, "targetValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        return this.f11660c.getVelocityFromNanos(j10, initialValue, targetValue, initialVelocity);
    }

    @Override // c0.o3, c0.i3
    public boolean isInfinite() {
        return this.f11660c.isInfinite();
    }

    public w3(float f10, float f11, v vVar) {
        x xVarAccess$createSpringAnimations = l3.access$createSpringAnimations(vVar, f10, f11);
        this.f11658a = f10;
        this.f11659b = f11;
        this.f11660c = new q3(xVarAccess$createSpringAnimations);
    }
}
