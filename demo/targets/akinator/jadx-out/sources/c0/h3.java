package c0;

import i1.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h3 {

    /* renamed from: a, reason: collision with root package name */
    public static final n2 f11488a = TwoWayConverter(t2.f11621e, u2.f11635e);

    /* renamed from: b, reason: collision with root package name */
    public static final n2 f11489b = TwoWayConverter(z2.f11730e, a3.f11396e);

    /* renamed from: c, reason: collision with root package name */
    public static final n2 f11490c = TwoWayConverter(r2.f11593e, s2.f11608e);

    /* renamed from: d, reason: collision with root package name */
    public static final n2 f11491d = TwoWayConverter(p2.f11567e, q2.f11579e);

    /* renamed from: e, reason: collision with root package name */
    public static final n2 f11492e = TwoWayConverter(f3.f11462e, g3.f11479e);

    /* renamed from: f, reason: collision with root package name */
    public static final n2 f11493f = TwoWayConverter(b3.f11419e, c3.f11428e);

    /* renamed from: g, reason: collision with root package name */
    public static final n2 f11494g = TwoWayConverter(v2.f11646e, w2.f11657e);

    /* renamed from: h, reason: collision with root package name */
    public static final n2 f11495h = TwoWayConverter(x2.f11671e, y2.f11689e);

    /* renamed from: i, reason: collision with root package name */
    public static final n2 f11496i = TwoWayConverter(d3.f11439e, e3.f11458e);

    public static final <T, V extends v> n2 TwoWayConverter(kv.l convertToVector, kv.l convertFromVector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(convertToVector, "convertToVector");
        kotlin.jvm.internal.e0.checkNotNullParameter(convertFromVector, "convertFromVector");
        return new o2(convertToVector, convertFromVector);
    }

    public static final n2 getVectorConverter(kotlin.jvm.internal.w wVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(wVar, "<this>");
        return f11488a;
    }

    public static final float lerp(float f10, float f11, float f12) {
        return (f11 * f12) + ((1 - f12) * f10);
    }

    public static final n2 getVectorConverter(kotlin.jvm.internal.c0 c0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c0Var, "<this>");
        return f11489b;
    }

    public static final n2 getVectorConverter(j.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<this>");
        return f11496i;
    }

    public static final n2 getVectorConverter(s2.h hVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(hVar, "<this>");
        return f11490c;
    }

    public static final n2 getVectorConverter(s2.k kVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(kVar, "<this>");
        return f11491d;
    }

    public static final n2 getVectorConverter(i1.n nVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(nVar, "<this>");
        return f11492e;
    }

    public static final n2 getVectorConverter(i1.g gVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        return f11493f;
    }

    public static final n2 getVectorConverter(s2.p pVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pVar, "<this>");
        return f11494g;
    }

    public static final n2 getVectorConverter(s2.u uVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(uVar, "<this>");
        return f11495h;
    }
}
