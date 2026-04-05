package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class k {
    public static final b0 DecayAnimation(l0 animationSpec, float f10, float f11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        return new b0(e0.generateDecayAnimationSpec(animationSpec), h3.getVectorConverter(kotlin.jvm.internal.w.f71862a), (Object) Float.valueOf(f10), (v) w.AnimationVector(f11));
    }

    public static /* synthetic */ b0 DecayAnimation$default(l0 l0Var, float f10, float f11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f11 = 0.0f;
        }
        return DecayAnimation(l0Var, f10, f11);
    }

    public static final <T, V extends v> y1 TargetBasedAnimation(n animationSpec, n2 typeConverter, T t10, T t11, T t12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
        kotlin.jvm.internal.e0.checkNotNullParameter(typeConverter, "typeConverter");
        return new y1(animationSpec, typeConverter, t10, t11, (v) typeConverter.getConvertToVector().invoke(t12));
    }

    public static final <V extends v> y1 createAnimation(i3 i3Var, V initialValue, V targetValue, V initialVelocity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(i3Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialValue, "initialValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(targetValue, "targetValue");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocity, "initialVelocity");
        return new y1(i3Var, h3.TwoWayConverter(i.f11497e, j.f11509e), initialValue, targetValue, initialVelocity);
    }

    public static final long getDurationMillis(g gVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        return gVar.getDurationNanos() / 1000000;
    }

    public static final <T, V extends v> T getVelocityFromNanos(g gVar, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        return (T) gVar.getTypeConverter().getConvertFromVector().invoke(gVar.getVelocityVectorFromNanos(j10));
    }
}
