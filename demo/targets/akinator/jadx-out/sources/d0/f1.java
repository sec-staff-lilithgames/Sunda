package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f1 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f51366a = s2.i.m6817constructorimpl(30);

    /* renamed from: b, reason: collision with root package name */
    public static final e1.v f51367b;

    /* renamed from: c, reason: collision with root package name */
    public static final e1.v f51368c;

    static {
        d1 d1Var = new d1();
        e1.t tVar = e1.t.f53496b;
        f51367b = g1.e.clip(tVar, d1Var);
        f51368c = g1.e.clip(tVar, new e1());
    }

    public static final e1.v clipScrollableContainer(e1.v vVar, e0.m2 orientation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(vVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(orientation, "orientation");
        return vVar.then(orientation == e0.m2.f53183b ? f51368c : f51367b);
    }

    public static final float getMaxSupportedElevation() {
        return f51366a;
    }
}
