package o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public q f77341i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f77342j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f77343k;

    /* renamed from: l, reason: collision with root package name */
    public int f77344l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q qVar, zu.d dVar) {
        super(dVar);
        this.f77343k = qVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f77342j = obj;
        this.f77344l |= Integer.MIN_VALUE;
        return this.f77343k.animate(this);
    }
}
