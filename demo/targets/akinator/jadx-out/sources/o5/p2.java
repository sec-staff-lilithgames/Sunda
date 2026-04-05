package o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p2 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public j2 f77688i;

    /* renamed from: j, reason: collision with root package name */
    public p5.a f77689j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f77690k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j2 f77691l;

    /* renamed from: m, reason: collision with root package name */
    public int f77692m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(j2 j2Var, zu.d dVar) {
        super(dVar);
        this.f77691l = j2Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f77690k = obj;
        this.f77692m |= Integer.MIN_VALUE;
        return this.f77691l.a(this);
    }
}
