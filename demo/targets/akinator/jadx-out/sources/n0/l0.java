package n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f75122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r1 f75123f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r0 f75124g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kv.p f75125h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f75126i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f75127j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(i iVar, r1 r1Var, r0 r0Var, kv.p pVar, int i10, int i11) {
        super(2);
        this.f75122e = iVar;
        this.f75123f = r1Var;
        this.f75124g = r0Var;
        this.f75125h = pVar;
        this.f75126i = i10;
        this.f75127j = i11;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        m0.MaterialTheme(this.f75122e, this.f75123f, this.f75124g, this.f75125h, wVar, this.f75126i | 1, this.f75127j);
    }
}
