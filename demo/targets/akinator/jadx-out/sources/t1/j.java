package t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public k f86269i;

    /* renamed from: j, reason: collision with root package name */
    public long f86270j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f86271k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f86272l;

    /* renamed from: m, reason: collision with root package name */
    public int f86273m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, zu.d dVar) {
        super(dVar);
        this.f86272l = kVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f86271k = obj;
        this.f86273m |= Integer.MIN_VALUE;
        return this.f86272l.mo26onPreFlingQWom1Mo(0L, this);
    }
}
