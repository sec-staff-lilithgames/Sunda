package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e1 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f3530e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w1 f3531f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kv.p f3532g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3533h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(t tVar, w1 w1Var, kv.p pVar, int i10) {
        super(2);
        this.f3530e = tVar;
        this.f3531f = w1Var;
        this.f3532g = pVar;
        this.f3533h = i10;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        if ((i10 & 11) == 2 && wVar.getSkipping()) {
            wVar.skipToGroupEnd();
        } else {
            a3.ProvideCommonCompositionLocals(this.f3530e, this.f3531f, this.f3532g, wVar, ((this.f3533h << 3) & 896) | 72);
        }
    }
}
