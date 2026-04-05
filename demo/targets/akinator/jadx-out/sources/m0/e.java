package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f73688e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f73689f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r2.k f73690g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f73691h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e1.v f73692i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kv.p f73693j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f73694k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i10, long j10, e1.v vVar, kv.p pVar, r2.k kVar, boolean z10, boolean z11) {
        super(2);
        this.f73688e = j10;
        this.f73689f = z10;
        this.f73690g = kVar;
        this.f73691h = z11;
        this.f73692i = vVar;
        this.f73693j = pVar;
        this.f73694k = i10;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        i.m5534SelectionHandle8fL75g(this.f73688e, this.f73689f, this.f73690g, this.f73691h, this.f73692i, this.f73693j, wVar, this.f73694k | 1);
    }
}
