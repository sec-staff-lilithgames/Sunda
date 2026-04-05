package k4;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k0 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public Object f70385i;

    /* renamed from: j, reason: collision with root package name */
    public Object f70386j;

    /* renamed from: k, reason: collision with root package name */
    public Serializable f70387k;

    /* renamed from: l, reason: collision with root package name */
    public kotlin.jvm.internal.b1 f70388l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f70389m;

    /* renamed from: n, reason: collision with root package name */
    public int f70390n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f70391o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p f70392p;

    /* renamed from: q, reason: collision with root package name */
    public int f70393q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(p pVar, zu.d dVar) {
        super(dVar);
        this.f70392p = pVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f70391o = obj;
        this.f70393q |= Integer.MIN_VALUE;
        return p.access$readDataOrHandleCorruption(this.f70392p, false, this);
    }
}
