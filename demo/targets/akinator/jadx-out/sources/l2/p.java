package l2;

import l2.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public o f72342i;

    /* renamed from: j, reason: collision with root package name */
    public o.a f72343j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f72344k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f72345l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f72346m;

    /* renamed from: n, reason: collision with root package name */
    public int f72347n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar, zu.d dVar) {
        super(dVar);
        this.f72346m = oVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f72345l = obj;
        this.f72347n |= Integer.MIN_VALUE;
        return this.f72346m.runCached(null, null, false, null, this);
    }
}
