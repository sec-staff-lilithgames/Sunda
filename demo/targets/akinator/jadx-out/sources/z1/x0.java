package z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x0 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u0 f97437e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o0 f97438f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v0 f97439g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f97440h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s f97441i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f97442j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f97443k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f97444l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(u0 u0Var, o0 o0Var, v0 v0Var, long j10, s sVar, boolean z10, boolean z11, float f10) {
        super(0);
        this.f97437e = u0Var;
        this.f97438f = o0Var;
        this.f97439g = v0Var;
        this.f97440h = j10;
        this.f97441i = sVar;
        this.f97442j = z10;
        this.f97443k = z11;
        this.f97444l = f10;
    }

    @Override // kv.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m8098invoke();
        return tu.x0.f87415a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m8098invoke() {
        this.f97437e.l(this.f97438f.getNext(), this.f97439g, this.f97440h, this.f97441i, this.f97442j, this.f97443k, this.f97444l);
    }
}
