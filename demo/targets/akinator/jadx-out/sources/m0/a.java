package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.v f73651e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f73652f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r2.k f73653g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f73654h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f73655i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e1.v vVar, boolean z10, r2.k kVar, boolean z11, int i10) {
        super(2);
        this.f73651e = vVar;
        this.f73652f = z10;
        this.f73653g = kVar;
        this.f73654h = z11;
        this.f73655i = i10;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        i.DefaultSelectionHandle(this.f73651e, this.f73652f, this.f73653g, this.f73654h, wVar, this.f73655i | 1);
    }
}
