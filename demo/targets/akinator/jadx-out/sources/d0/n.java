package d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f51507e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j1.f2 f51508f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j1.b0 f51509g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(float f10, j1.b0 b0Var, j1.f2 f2Var) {
        super(3);
        this.f51507e = f10;
        this.f51508f = f2Var;
        this.f51509g = b0Var;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(-1498088849);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        if (objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = new z1.a2();
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        j1.f2 f2Var = this.f51508f;
        j1.b0 b0Var = this.f51509g;
        e1.v vVarThen = composed.then(g1.j.drawWithCache(e1.t.f53496b, new m(this.f51507e, f2Var, (z1.a2) objRememberedValue, b0Var)));
        wVar.endReplaceableGroup();
        return vVarThen;
    }
}
