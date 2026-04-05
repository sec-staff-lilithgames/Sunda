package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class y3 {
    public static final v3 WindowInsets(int i10, int i11, int i12, int i13) {
        return new u0(i10, i11, i12, i13);
    }

    public static /* synthetic */ v3 WindowInsets$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return WindowInsets(i10, i11, i12, i13);
    }

    /* renamed from: WindowInsets-a9UjIt4, reason: not valid java name */
    public static final v3 m3932WindowInsetsa9UjIt4(float f10, float f11, float f12, float f13) {
        return new t0(f10, f11, f12, f13, null);
    }

    /* renamed from: WindowInsets-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ v3 m3933WindowInsetsa9UjIt4$default(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = s2.i.m6817constructorimpl(0);
        }
        if ((i10 & 2) != 0) {
            f11 = s2.i.m6817constructorimpl(0);
        }
        if ((i10 & 4) != 0) {
            f12 = s2.i.m6817constructorimpl(0);
        }
        if ((i10 & 8) != 0) {
            f13 = s2.i.m6817constructorimpl(0);
        }
        return m3932WindowInsetsa9UjIt4(f10, f11, f12, f13);
    }

    public static final v3 add(v3 v3Var, v3 insets) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v3Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(insets, "insets");
        return new a(v3Var, insets);
    }

    public static final v3 asInsets(i2 i2Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(i2Var, "<this>");
        return new l2(i2Var);
    }

    public static final i2 asPaddingValues(v3 v3Var, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v3Var, "<this>");
        return new a1(v3Var, (s2.e) wVar.consume(a2.a3.getLocalDensity()));
    }

    public static final v3 exclude(v3 v3Var, v3 insets) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v3Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(insets, "insets");
        return new q0(v3Var, insets);
    }

    /* renamed from: only-bOOhFvg, reason: not valid java name */
    public static final v3 m3934onlybOOhFvg(v3 only, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(only, "$this$only");
        return new d2(only, i10, null);
    }

    public static final v3 union(v3 v3Var, v3 insets) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v3Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(insets, "insets");
        return new o3(v3Var, insets);
    }

    public static final i2 asPaddingValues(v3 v3Var, s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v3Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        return new a1(v3Var, density);
    }
}
