package zw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class q implements a0 {

    /* renamed from: b, reason: collision with root package name */
    public final a0 f98878b;

    /* renamed from: a, reason: collision with root package name */
    public final c0 f98877a = new c0();

    /* renamed from: c, reason: collision with root package name */
    public final b0 f98879c = new b0();

    /* renamed from: d, reason: collision with root package name */
    public final a f98880d = new a(this);

    public q(a0 a0Var) {
        this.f98878b = a0Var;
    }

    @Override // zw.a0
    public h0 match(Class cls) throws Exception {
        h0 h0VarMatch = this.f98878b.match(cls);
        return h0VarMatch != null ? h0VarMatch : cls.isArray() ? this.f98880d.match(cls) : cls.isPrimitive() ? this.f98877a.match(cls) : this.f98879c.match(cls);
    }
}
