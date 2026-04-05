package lb;

import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class p extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public e.g f72940i;

    /* renamed from: j, reason: collision with root package name */
    public qb.g f72941j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f72942k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f72943l;

    /* renamed from: m, reason: collision with root package name */
    public int f72944m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(e eVar, zu.d dVar) {
        super(dVar);
        this.f72943l = eVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f72942k = obj;
        this.f72944m |= Integer.MIN_VALUE;
        return this.f72943l.checkTrapAsync(null, this);
    }
}
