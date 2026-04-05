package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f51477e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f51478f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e2.m f51479g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f51480h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kv.a f51481i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kv.a f51482j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.a f51483k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(boolean z10, String str, e2.m mVar, kv.a aVar, kv.a aVar2, kv.a aVar3, String str2) {
        super(3);
        this.f51477e = z10;
        this.f51478f = str;
        this.f51479g = mVar;
        this.f51480h = str2;
        this.f51481i = aVar;
        this.f51482j = aVar2;
        this.f51483k = aVar3;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(1969174843);
        s2 s2Var = (s2) wVar.consume(v2.getLocalIndication());
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        if (objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = f0.p.MutableInteractionSource();
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        kv.a aVar = this.f51482j;
        kv.a aVar2 = this.f51483k;
        e1.v vVarM3709combinedClickableXVZzFYc = k0.m3709combinedClickableXVZzFYc(e1.t.f53496b, (f0.q) objRememberedValue, s2Var, this.f51477e, this.f51478f, this.f51479g, this.f51480h, this.f51481i, aVar, aVar2);
        wVar.endReplaceableGroup();
        return vVarM3709combinedClickableXVZzFYc;
    }
}
