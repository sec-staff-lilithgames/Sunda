package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e0 {
    public static final <T, V extends v> T calculateTargetValue(c0 c0Var, n2 typeConverter, T t10, T t11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c0Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(typeConverter, "typeConverter");
        return (T) typeConverter.getConvertFromVector().invoke(c0Var.vectorize(typeConverter).getTargetValue((v) typeConverter.getConvertToVector().invoke(t10), (v) typeConverter.getConvertToVector().invoke(t11)));
    }

    public static final <T> c0 exponentialDecay(float f10, float f11) {
        return generateDecayAnimationSpec(new m0(f10, f11));
    }

    public static /* synthetic */ c0 exponentialDecay$default(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.1f;
        }
        return exponentialDecay(f10, f11);
    }

    public static final <T> c0 generateDecayAnimationSpec(l0 l0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(l0Var, "<this>");
        return new d0(l0Var);
    }

    public static final float calculateTargetValue(c0 c0Var, float f10, float f11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c0Var, "<this>");
        return ((r) c0Var.vectorize(h3.getVectorConverter(kotlin.jvm.internal.w.f71862a)).getTargetValue(w.AnimationVector(f10), w.AnimationVector(f11))).getValue();
    }
}
