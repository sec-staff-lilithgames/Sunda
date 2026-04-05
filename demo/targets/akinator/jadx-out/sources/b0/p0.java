package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0.z1 f8469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e1.v f8470f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0.j0 f8471g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kv.l f8472h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kv.q f8473i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8474j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8475k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(c0.z1 z1Var, e1.v vVar, c0.j0 j0Var, kv.l lVar, kv.q qVar, int i10, int i11) {
        super(2);
        this.f8469e = z1Var;
        this.f8470f = vVar;
        this.f8471g = j0Var;
        this.f8472h = lVar;
        this.f8473i = qVar;
        this.f8474j = i10;
        this.f8475k = i11;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        q0.Crossfade(this.f8469e, this.f8470f, this.f8471g, this.f8472h, this.f8473i, wVar, this.f8474j | 1, this.f8475k);
    }
}
