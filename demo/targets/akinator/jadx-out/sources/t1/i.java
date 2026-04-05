package t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public k f86263i;

    /* renamed from: j, reason: collision with root package name */
    public long f86264j;

    /* renamed from: k, reason: collision with root package name */
    public long f86265k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f86266l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f86267m;

    /* renamed from: n, reason: collision with root package name */
    public int f86268n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, zu.d dVar) {
        super(dVar);
        this.f86267m = kVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f86266l = obj;
        this.f86268n |= Integer.MIN_VALUE;
        return this.f86267m.mo24onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
