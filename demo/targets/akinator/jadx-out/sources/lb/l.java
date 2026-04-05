package lb;

import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public e f72910i;

    /* renamed from: j, reason: collision with root package name */
    public e.i f72911j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f72912k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f72913l;

    /* renamed from: m, reason: collision with root package name */
    public int f72914m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e eVar, zu.d dVar) {
        super(dVar);
        this.f72913l = eVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f72912k = obj;
        this.f72914m |= Integer.MIN_VALUE;
        return this.f72913l.cancelAnswerAsync(null, this);
    }
}
