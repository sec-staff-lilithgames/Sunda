package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b1 f11572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11573f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f11574g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v f11575h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f11576i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f11577j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.l f11578k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(kotlin.jvm.internal.b1 b1Var, Object obj, g gVar, v vVar, p pVar, float f10, kv.l lVar) {
        super(1);
        this.f11572e = b1Var;
        this.f11573f = obj;
        this.f11574g = gVar;
        this.f11575h = vVar;
        this.f11576i = pVar;
        this.f11577j = f10;
        this.f11578k = lVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return tu.x0.f87415a;
    }

    public final void invoke(long j10) {
        g gVar = this.f11574g;
        m mVar = new m(this.f11573f, gVar.getTypeConverter(), this.f11575h, j10, gVar.getTargetValue(), j10, true, new p1(this.f11576i));
        x1.b(mVar, j10, this.f11577j, gVar, this.f11576i, this.f11578k);
        this.f11572e.f71816b = mVar;
    }
}
