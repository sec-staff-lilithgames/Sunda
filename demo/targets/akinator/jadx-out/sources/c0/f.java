package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f {
    public static final e Animatable(float f10, float f11) {
        return new e(Float.valueOf(f10), h3.getVectorConverter(kotlin.jvm.internal.w.f71862a), Float.valueOf(f11));
    }

    public static /* synthetic */ e Animatable$default(float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f11 = 0.01f;
        }
        return Animatable(f10, f11);
    }
}
