package g2;

import j1.d2;
import l2.c1;
import n2.d;
import n2.e;
import r2.n;
import r2.v;
import r2.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a1.m f56807a = a1.q.Saver(g0.f56757e, h0.f56765e);

    /* renamed from: b, reason: collision with root package name */
    public static final a1.m f56808b = a1.q.Saver(i0.f56771e, j0.f56777e);

    /* renamed from: c, reason: collision with root package name */
    public static final a1.m f56809c = a1.q.Saver(k0.f56779e, l0.f56789e);

    /* renamed from: d, reason: collision with root package name */
    public static final a1.m f56810d = a1.q.Saver(o1.f56803e, p1.f56805e);

    /* renamed from: e, reason: collision with root package name */
    public static final a1.m f56811e = a1.q.Saver(y0.f56887e, z0.f56892e);

    /* renamed from: f, reason: collision with root package name */
    public static final a1.m f56812f = a1.q.Saver(c1.f56740e, d1.f56749e);

    /* renamed from: g, reason: collision with root package name */
    public static final a1.m f56813g = a1.q.Saver(e1.f56751e, f1.f56755e);

    /* renamed from: h, reason: collision with root package name */
    public static final a1.m f56814h = a1.q.Saver(g1.f56758e, h1.f56766e);

    /* renamed from: i, reason: collision with root package name */
    public static final a1.m f56815i = a1.q.Saver(i1.f56772e, j1.f56778e);

    /* renamed from: j, reason: collision with root package name */
    public static final a1.m f56816j = a1.q.Saver(q0.f56806e, r0.f56825e);

    /* renamed from: k, reason: collision with root package name */
    public static final a1.m f56817k = a1.q.Saver(m0.f56792e, n0.f56795e);

    /* renamed from: l, reason: collision with root package name */
    public static final a1.m f56818l = a1.q.Saver(k1.f56780e, l1.f56790e);

    /* renamed from: m, reason: collision with root package name */
    public static final a1.m f56819m = a1.q.Saver(a1.f56705e, b1.f56735e);

    /* renamed from: n, reason: collision with root package name */
    public static final a1.m f56820n = a1.q.Saver(o0.f56802e, p0.f56804e);

    /* renamed from: o, reason: collision with root package name */
    public static final a1.m f56821o = a1.q.Saver(m1.f56793e, n1.f56796e);

    /* renamed from: p, reason: collision with root package name */
    public static final a1.m f56822p = a1.q.Saver(w0.f56861e, x0.f56879e);

    /* renamed from: q, reason: collision with root package name */
    public static final a1.m f56823q = a1.q.Saver(s0.f56848e, t0.f56853e);

    /* renamed from: r, reason: collision with root package name */
    public static final a1.m f56824r = a1.q.Saver(u0.f56858e, v0.f56860e);

    public static final a1.m getAnnotatedStringSaver() {
        return f56807a;
    }

    public static final a1.m getParagraphStyleSaver() {
        return f56811e;
    }

    public static final a1.m getSaver(n.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<this>");
        return f56813g;
    }

    public static final a1.m getSpanStyleSaver() {
        return f56812f;
    }

    public static final /* synthetic */ <T extends a1.m, Original, Saveable, Result> Result restore(Saveable saveable, T saver) {
        kotlin.jvm.internal.e0.checkNotNullParameter(saver, "saver");
        if (kotlin.jvm.internal.e0.areEqual(saveable, Boolean.FALSE) || saveable == null) {
            return null;
        }
        Result result = (Result) ((a1.p) saver).restore(saveable);
        kotlin.jvm.internal.e0.reifiedOperationMarker(1, "Result");
        return result;
    }

    public static final <T extends a1.m, Original, Saveable> Object save(Original original, T saver, a1.r scope) {
        Object objSave;
        kotlin.jvm.internal.e0.checkNotNullParameter(saver, "saver");
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        return (original == null || (objSave = ((a1.p) saver).save(scope, original)) == null) ? Boolean.FALSE : objSave;
    }

    public static final a1.m getSaver(v.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<this>");
        return f56814h;
    }

    public static final <T> T save(T t10) {
        return t10;
    }

    public static final a1.m getSaver(x.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<this>");
        return f56815i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <Result> Result restore(Object obj) {
        if (obj == 0) {
            return null;
        }
        kotlin.jvm.internal.e0.reifiedOperationMarker(1, "Result");
        return obj;
    }

    public static final a1.m getSaver(c1.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<this>");
        return f56816j;
    }

    public static final a1.m getSaver(r2.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<this>");
        return f56817k;
    }

    public static final a1.m getSaver(z1 z1Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(z1Var, "<this>");
        return f56818l;
    }

    public static final a1.m getSaver(d2.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<this>");
        return f56819m;
    }

    public static final a1.m getSaver(j1.l0 l0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(l0Var, "<this>");
        return f56820n;
    }

    public static final a1.m getSaver(s2.y yVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(yVar, "<this>");
        return f56821o;
    }

    public static final a1.m getSaver(i1.g gVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(gVar, "<this>");
        return f56822p;
    }

    public static final a1.m getSaver(e.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<this>");
        return f56823q;
    }

    public static final a1.m getSaver(d.a aVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(aVar, "<this>");
        return f56824r;
    }
}
