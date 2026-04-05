package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface i3 {
    long getDurationNanos(v vVar, v vVar2, v vVar3);

    default v getEndVelocity(v initialValue, v targetValue, v initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetValue, "targetValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        return getVelocityFromNanos(getDurationNanos(initialValue, targetValue, initialVelocity), initialValue, targetValue, initialVelocity);
    }

    v getValueFromNanos(long j10, v vVar, v vVar2, v vVar3);

    v getVelocityFromNanos(long j10, v vVar, v vVar2, v vVar3);

    boolean isInfinite();
}
