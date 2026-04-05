package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f51351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f51352f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e2.m f51353g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kv.a f51354h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(boolean z10, String str, e2.m mVar, kv.a aVar) {
        super(3);
        this.f51351e = z10;
        this.f51352f = str;
        this.f51353g = mVar;
        this.f51354h = aVar;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(-756081143);
        s2 s2Var = (s2) wVar.consume(v2.getLocalIndication());
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        if (objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = f0.p.MutableInteractionSource();
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        e2.m mVar = this.f51353g;
        kv.a aVar = this.f51354h;
        e1.v vVarM3705clickableO2vRcR0 = k0.m3705clickableO2vRcR0(e1.t.f53496b, (f0.q) objRememberedValue, s2Var, this.f51351e, this.f51352f, mVar, aVar);
        wVar.endReplaceableGroup();
        return vVarM3705clickableO2vRcR0;
    }
}
