package c0;

import rw.hIT.uQjDr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public abstract class l3 {
    public static final x access$createSpringAnimations(v vVar, float f10, float f11) {
        return vVar != null ? new j3(vVar, f10, f11) : new k3(f10, f11);
    }

    public static final <V extends v> long getDurationMillis(i3 i3Var, V initialValue, V targetValue, V initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(i3Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetValue, "targetValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        return i3Var.getDurationNanos(initialValue, targetValue, initialVelocity) / 1000000;
    }

    public static final <V extends v> V getValueFromMillis(i3 i3Var, long j10, V start, V end, V startVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(i3Var, uQjDr.LSzmepJHspWBSE);
        kotlin.jvm.internal.e0.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.e0.checkNotNullParameter(end, "end");
        kotlin.jvm.internal.e0.checkNotNullParameter(startVelocity, "startVelocity");
        return (V) i3Var.getValueFromNanos(j10 * 1000000, start, end, startVelocity);
    }
}
