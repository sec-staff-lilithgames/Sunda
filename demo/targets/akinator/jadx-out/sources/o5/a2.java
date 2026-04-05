package o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a2 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public b2 f77495i;

    /* renamed from: j, reason: collision with root package name */
    public int f77496j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f77497k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b2 f77498l;

    /* renamed from: m, reason: collision with root package name */
    public int f77499m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(b2 b2Var, zu.d dVar) {
        super(dVar);
        this.f77498l = b2Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f77497k = obj;
        this.f77499m |= Integer.MIN_VALUE;
        return b2.access$refresh(this.f77498l, this);
    }
}
