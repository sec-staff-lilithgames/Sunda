package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class w {
    public static final r AnimationVector(float f10) {
        return new r(f10);
    }

    public static final <T extends v> T copy(T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(t10, "<this>");
        T t11 = (T) newInstance(t10);
        int size$animation_core_release = t11.getSize$animation_core_release();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            t11.set$animation_core_release(i10, t10.get$animation_core_release(i10));
        }
        return t11;
    }

    public static final <T extends v> void copyFrom(T t10, T source) {
        kotlin.jvm.internal.e0.checkNotNullParameter(t10, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        int size$animation_core_release = t10.getSize$animation_core_release();
        for (int i10 = 0; i10 < size$animation_core_release; i10++) {
            t10.set$animation_core_release(i10, source.get$animation_core_release(i10));
        }
    }

    public static final <T extends v> T newInstance(T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(t10, "<this>");
        return (T) t10.newVector$animation_core_release();
    }

    public static final s AnimationVector(float f10, float f11) {
        return new s(f10, f11);
    }

    public static final t AnimationVector(float f10, float f11, float f12) {
        return new t(f10, f11, f12);
    }

    public static final u AnimationVector(float f10, float f11, float f12, float f13) {
        return new u(f10, f11, f12, f13);
    }
}
