package k0;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final h f70011a = RoundedCornerShape(50);

    public static final h RoundedCornerShape(b corner) {
        e0.checkNotNullParameter(corner, "corner");
        return new h(corner, corner, corner, corner);
    }

    public static /* synthetic */ h RoundedCornerShape$default(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            f13 = 0.0f;
        }
        return RoundedCornerShape(f10, f11, f12, f13);
    }

    /* renamed from: RoundedCornerShape-0680j_4, reason: not valid java name */
    public static final h m5094RoundedCornerShape0680j_4(float f10) {
        return RoundedCornerShape(d.m5090CornerSize0680j_4(f10));
    }

    /* renamed from: RoundedCornerShape-a9UjIt4, reason: not valid java name */
    public static final h m5095RoundedCornerShapea9UjIt4(float f10, float f11, float f12, float f13) {
        return new h(d.m5090CornerSize0680j_4(f10), d.m5090CornerSize0680j_4(f11), d.m5090CornerSize0680j_4(f12), d.m5090CornerSize0680j_4(f13));
    }

    /* renamed from: RoundedCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ h m5096RoundedCornerShapea9UjIt4$default(float f10, float f11, float f12, float f13, int i10, Object obj) {
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
        return m5095RoundedCornerShapea9UjIt4(f10, f11, f12, f13);
    }

    public static final h getCircleShape() {
        return f70011a;
    }

    public static final h RoundedCornerShape(float f10) {
        return RoundedCornerShape(d.CornerSize(f10));
    }

    public static /* synthetic */ h RoundedCornerShape$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
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
        return RoundedCornerShape(i10, i11, i12, i13);
    }

    public static final h RoundedCornerShape(int i10) {
        return RoundedCornerShape(d.CornerSize(i10));
    }

    public static final h RoundedCornerShape(float f10, float f11, float f12, float f13) {
        return new h(d.CornerSize(f10), d.CornerSize(f11), d.CornerSize(f12), d.CornerSize(f13));
    }

    public static final h RoundedCornerShape(int i10, int i11, int i12, int i13) {
        return new h(d.CornerSize(i10), d.CornerSize(i11), d.CornerSize(i12), d.CornerSize(i13));
    }
}
