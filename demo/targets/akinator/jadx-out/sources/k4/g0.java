package k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g0 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public p f70336i;

    /* renamed from: j, reason: collision with root package name */
    public int f70337j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f70338k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f70339l;

    /* renamed from: m, reason: collision with root package name */
    public int f70340m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(p pVar, zu.d dVar) {
        super(dVar);
        this.f70339l = pVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f70338k = obj;
        this.f70340m |= Integer.MIN_VALUE;
        return this.f70339l.b(this);
    }
}
