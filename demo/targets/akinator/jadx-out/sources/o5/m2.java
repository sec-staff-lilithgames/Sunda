package o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m2 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public n2 f77660i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f77661j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f77662k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n2 f77663l;

    /* renamed from: m, reason: collision with root package name */
    public int f77664m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(n2 n2Var, zu.d dVar) {
        super(dVar);
        this.f77663l = n2Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f77662k = obj;
        this.f77664m |= Integer.MIN_VALUE;
        return this.f77663l.emit((int[]) null, (zu.d<? super tu.x0>) this);
    }
}
