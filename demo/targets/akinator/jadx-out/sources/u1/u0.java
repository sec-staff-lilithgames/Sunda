package u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u0 extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.l f87680e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c1 f87681f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(c1 c1Var, kv.l lVar) {
        super(3);
        this.f87680e = lVar;
        this.f87681f = c1Var;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
    }

    public final e1.v invoke(e1.v composed, p0.w wVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(composed, "$this$composed");
        wVar.startReplaceableGroup(374375707);
        wVar.startReplaceableGroup(-492369756);
        Object objRememberedValue = wVar.rememberedValue();
        if (objRememberedValue == p0.v.f80515a.getEmpty()) {
            objRememberedValue = new q0();
            wVar.updateRememberedValue(objRememberedValue);
        }
        wVar.endReplaceableGroup();
        q0 q0Var = (q0) objRememberedValue;
        q0Var.setOnTouchEvent(this.f87680e);
        q0Var.setRequestDisallowInterceptTouchEvent(this.f87681f);
        wVar.endReplaceableGroup();
        return q0Var;
    }
}
