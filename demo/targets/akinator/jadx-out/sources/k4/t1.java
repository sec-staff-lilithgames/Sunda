package k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t1 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public Object f70517i;

    /* renamed from: j, reason: collision with root package name */
    public Object f70518j;

    /* renamed from: k, reason: collision with root package name */
    public Object f70519k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f70520l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ q1 f70521m;

    /* renamed from: n, reason: collision with root package name */
    public int f70522n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(q1 q1Var, zu.d dVar) {
        super(dVar);
        this.f70521m = q1Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f70520l = obj;
        this.f70522n |= Integer.MIN_VALUE;
        return this.f70521m.lock(null, this);
    }
}
