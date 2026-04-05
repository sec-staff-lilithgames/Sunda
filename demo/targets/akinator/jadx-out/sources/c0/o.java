package c0;

import c0.r0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o {
    public static final v access$convert(n2 n2Var, Object obj) {
        if (obj == null) {
            return null;
        }
        return (v) n2Var.getConvertToVector().invoke(obj);
    }

    @tu.f
    public static final /* synthetic */ q0 infiniteRepeatable(f0 animation, y0 repeatMode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animation, "animation");
        kotlin.jvm.internal.e0.checkNotNullParameter(repeatMode, "repeatMode");
        return new q0(animation, repeatMode, j1.m161constructorimpl$default(0, 0, 2, null), (kotlin.jvm.internal.u) null);
    }

    public static /* synthetic */ q0 infiniteRepeatable$default(f0 f0Var, y0 y0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            y0Var = y0.f11678b;
        }
        return infiniteRepeatable(f0Var, y0Var);
    }

    /* renamed from: infiniteRepeatable-9IiC70o, reason: not valid java name */
    public static final <T> q0 m177infiniteRepeatable9IiC70o(f0 animation, y0 repeatMode, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animation, "animation");
        kotlin.jvm.internal.e0.checkNotNullParameter(repeatMode, "repeatMode");
        return new q0(animation, repeatMode, j10, (kotlin.jvm.internal.u) null);
    }

    /* renamed from: infiniteRepeatable-9IiC70o$default, reason: not valid java name */
    public static /* synthetic */ q0 m178infiniteRepeatable9IiC70o$default(f0 f0Var, y0 y0Var, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            y0Var = y0.f11678b;
        }
        if ((i10 & 4) != 0) {
            j10 = j1.m161constructorimpl$default(0, 0, 2, null);
        }
        return m177infiniteRepeatable9IiC70o(f0Var, y0Var, j10);
    }

    public static final <T> r0 keyframes(kv.l init) {
        kotlin.jvm.internal.e0.checkNotNullParameter(init, "init");
        r0.b bVar = new r0.b();
        init.invoke(bVar);
        return new r0(bVar);
    }

    @tu.f
    public static final /* synthetic */ z0 repeatable(int i10, f0 animation, y0 repeatMode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animation, "animation");
        kotlin.jvm.internal.e0.checkNotNullParameter(repeatMode, "repeatMode");
        return new z0(i10, animation, repeatMode, j1.m161constructorimpl$default(0, 0, 2, null), (kotlin.jvm.internal.u) null);
    }

    public static /* synthetic */ z0 repeatable$default(int i10, f0 f0Var, y0 y0Var, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            y0Var = y0.f11678b;
        }
        return repeatable(i10, f0Var, y0Var);
    }

    /* renamed from: repeatable-91I0pcU, reason: not valid java name */
    public static final <T> z0 m179repeatable91I0pcU(int i10, f0 animation, y0 repeatMode, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animation, "animation");
        kotlin.jvm.internal.e0.checkNotNullParameter(repeatMode, "repeatMode");
        return new z0(i10, animation, repeatMode, j10, (kotlin.jvm.internal.u) null);
    }

    /* renamed from: repeatable-91I0pcU$default, reason: not valid java name */
    public static /* synthetic */ z0 m180repeatable91I0pcU$default(int i10, f0 f0Var, y0 y0Var, long j10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            y0Var = y0.f11678b;
        }
        if ((i11 & 8) != 0) {
            j10 = j1.m161constructorimpl$default(0, 0, 2, null);
        }
        return m179repeatable91I0pcU(i10, f0Var, y0Var, j10);
    }

    public static final <T> a1 snap(int i10) {
        return new a1(i10);
    }

    public static /* synthetic */ a1 snap$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return snap(i10);
    }

    public static final <T> i1 spring(float f10, float f11, T t10) {
        return new i1(f10, f11, t10);
    }

    public static /* synthetic */ i1 spring$default(float f10, float f11, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 1500.0f;
        }
        if ((i10 & 4) != 0) {
            obj = null;
        }
        return spring(f10, f11, obj);
    }

    public static final <T> m2 tween(int i10, int i11, g0 easing) {
        kotlin.jvm.internal.e0.checkNotNullParameter(easing, "easing");
        return new m2(i10, i11, easing);
    }

    public static /* synthetic */ m2 tween$default(int i10, int i11, g0 g0Var, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 300;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            g0Var = i0.getFastOutSlowInEasing();
        }
        return tween(i10, i11, g0Var);
    }
}
