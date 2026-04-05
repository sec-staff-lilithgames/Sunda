package x1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1.v f91378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kv.p f91379f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x0 f91380g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f91381h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91382i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(e1.v vVar, kv.p pVar, x0 x0Var, int i10, int i11) {
        super(2);
        this.f91378e = vVar;
        this.f91379f = pVar;
        this.f91380g = x0Var;
        this.f91381h = i10;
        this.f91382i = i11;
    }

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((p0.w) obj, ((Number) obj2).intValue());
        return tu.x0.f87415a;
    }

    public final void invoke(p0.w wVar, int i10) {
        g0.MultiMeasureLayout(this.f91378e, this.f91379f, this.f91380g, wVar, this.f91381h | 1, this.f91382i);
    }
}
