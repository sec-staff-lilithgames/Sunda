package b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0.z1 f8461e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.l f8462f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e1.v f8463g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t1 f8464h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v1 f8465i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kv.q f8466j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8467k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f8468l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(c0.z1 z1Var, kv.l lVar, e1.v vVar, t1 t1Var, v1 v1Var, kv.q qVar, int i10, int i11) {
        super(2);
        this.f8461e = z1Var;
        this.f8462f = lVar;
        this.f8463g = vVar;
        this.f8464h = t1Var;
        this.f8465i = v1Var;
        this.f8466j = qVar;
        this.f8467k = i10;
        this.f8468l = i11;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        b0.AnimatedVisibility(this.f8461e, this.f8462f, this.f8463g, this.f8464h, this.f8465i, this.f8466j, wVar, this.f8467k | 1, this.f8468l);
    }
}
