package m0;

import d0.k3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p2 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s2.e f73811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f73812f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(s2.e eVar, p0.j2 j2Var) {
        super(1);
        this.f73811e = eVar;
        this.f73812f = j2Var;
    }

    @Override // kv.l
    public final e1.v invoke(kv.a center) {
        kotlin.jvm.internal.e0.checkNotNullParameter(center, "center");
        k3 textDefault = k3.f51464g.getTextDefault();
        return d0.y2.magnifier$default(e1.t.f53496b, new n2(center), null, 0.0f, textDefault, new o2(this.f73811e, this.f73812f), 6, null);
    }
}
