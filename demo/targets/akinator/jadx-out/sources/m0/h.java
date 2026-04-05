package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f73718e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r2.k f73719f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f73720g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z10, r2.k kVar, boolean z11) {
        super(3);
        this.f73718e = z10;
        this.f73719f = kVar;
        this.f73720g = z11;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(-1538687176);
        e1.v vVarThen = composed.then(g1.j.drawWithCache(e1.t.f53496b, new g(((s2) wVar.consume(u2.getLocalTextSelectionColors())).m5569getHandleColor0d7_KjU(), this.f73718e, this.f73719f, this.f73720g)));
        wVar.endReplaceableGroup();
        return vVarThen;
    }
}
