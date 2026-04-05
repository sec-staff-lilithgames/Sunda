package u1;

import u1.g1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f1 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f87564i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g1.a f87565j;

    /* renamed from: k, reason: collision with root package name */
    public int f87566k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(g1.a aVar, zu.d dVar) {
        super(dVar);
        this.f87565j = aVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f87564i = obj;
        this.f87566k |= Integer.MIN_VALUE;
        return this.f87565j.withTimeoutOrNull(0L, null, this);
    }
}
