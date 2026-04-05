package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z2 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z1.s1 f3899e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x4 f3900f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kv.p f3901g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3902h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(z1.s1 s1Var, x4 x4Var, kv.p pVar, int i10) {
        super(2);
        this.f3899e = s1Var;
        this.f3900f = x4Var;
        this.f3901g = pVar;
        this.f3902h = i10;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        a3.ProvideCommonCompositionLocals(this.f3899e, this.f3900f, this.f3901g, wVar, this.f3902h | 1);
    }
}
