package nh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m3 implements mh.q1 {

    /* renamed from: b, reason: collision with root package name */
    public final Object f76464b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n3 f76465c;

    public m3(n3 n3Var, Object obj) {
        this.f76465c = n3Var;
        this.f76464b = obj;
    }

    @Override // mh.q1
    public boolean apply(Object obj) {
        return this.f76465c.f76493i.apply(ec.immutableEntry(this.f76464b, obj));
    }
}
