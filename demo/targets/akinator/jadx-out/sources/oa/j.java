package oa;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public l f78756i;

    /* renamed from: j, reason: collision with root package name */
    public ka.a f78757j;

    /* renamed from: k, reason: collision with root package name */
    public long f78758k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f78759l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f78760m;

    /* renamed from: n, reason: collision with root package name */
    public int f78761n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, zu.d dVar) {
        super(dVar);
        this.f78760m = lVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f78759l = obj;
        this.f78761n |= Integer.MIN_VALUE;
        return this.f78760m.a(null, 0L, this);
    }
}
