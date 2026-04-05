package f7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f55474i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f55475j;

    /* renamed from: k, reason: collision with root package name */
    public int f55476k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar, zu.d dVar) {
        super(dVar);
        this.f55475j = kVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f55474i = obj;
        this.f55476k |= Integer.MIN_VALUE;
        return this.f55475j.a(null, this);
    }
}
