package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j2 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f73767e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r2.k f73768f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h2 f73769g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f73770h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(boolean z10, r2.k kVar, h2 h2Var, int i10) {
        super(2);
        this.f73767e = z10;
        this.f73768f = kVar;
        this.f73769g = h2Var;
        this.f73770h = i10;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        l2.TextFieldSelectionHandle(this.f73767e, this.f73768f, this.f73769g, wVar, this.f73770h | 1);
    }
}
