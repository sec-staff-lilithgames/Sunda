package n1;

import j1.l2;
import j1.n2;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f75532a = uu.p0.emptyList();

    /* renamed from: b, reason: collision with root package name */
    public static final int f75533b = l2.f68912b.m4802getButtKaPHkGw();

    /* renamed from: c, reason: collision with root package name */
    public static final int f75534c = n2.f68936b.m4870getMiterLxFBmk8();

    /* renamed from: d, reason: collision with root package name */
    public static final int f75535d = j1.x.f69020b.m5060getSrcIn0nO6VwU();

    /* renamed from: e, reason: collision with root package name */
    public static final long f75536e = j1.m0.f68918b.m4834getTransparent0d7_KjU();

    /* renamed from: f, reason: collision with root package name */
    public static final int f75537f = j1.o1.f68941b.m4877getNonZeroRgk1Os();

    public static final List<g> PathData(kv.l block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        d dVar = new d();
        block.invoke(dVar);
        return dVar.getNodes();
    }

    public static final List<g> addPathNodes(String str) {
        return str == null ? f75532a : new j().parsePathString(str).toNodes();
    }

    public static final int getDefaultFillType() {
        return f75537f;
    }

    public static final int getDefaultStrokeLineCap() {
        return f75533b;
    }

    public static final int getDefaultStrokeLineJoin() {
        return f75534c;
    }

    public static final int getDefaultTintBlendMode() {
        return f75535d;
    }

    public static final long getDefaultTintColor() {
        return f75536e;
    }

    public static final List<g> getEmptyPath() {
        return f75532a;
    }
}
