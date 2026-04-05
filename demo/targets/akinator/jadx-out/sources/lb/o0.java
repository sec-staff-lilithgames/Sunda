package lb;

import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class o0 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public e.c f72935i;

    /* renamed from: j, reason: collision with root package name */
    public qb.h f72936j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f72937k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f72938l;

    /* renamed from: m, reason: collision with root package name */
    public int f72939m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(e eVar, zu.d dVar) {
        super(dVar);
        this.f72938l = eVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f72937k = obj;
        this.f72939m |= Integer.MIN_VALUE;
        return this.f72938l.b(0, false, false, null, null, this);
    }
}
