package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface k0 extends n {
    long getDurationNanos(float f10, float f11, float f12);

    default float getEndVelocity(float f10, float f11, float f12) {
        return getVelocityFromNanos(getDurationNanos(f10, f11, f12), f10, f11, f12);
    }

    float getValueFromNanos(long j10, float f10, float f11, float f12);

    float getVelocityFromNanos(long j10, float f10, float f11, float f12);

    @Override // c0.n
    default <V extends v> q3 vectorize(n2 converter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(converter, "converter");
        return new q3(this);
    }
}
